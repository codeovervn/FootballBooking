package net.codejava.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.ContactAction;
import net.codejava.spring.model.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Demo
 * 
 * @author DungLT-27/02/2017
 * 
 */
@Controller
public class HomeController {

    @Autowired
    private ContactAction contactAction;

    @RequestMapping(value="/")
    public ModelAndView listContact(ModelAndView model) throws IOException {
        List<Contact> listContact = contactAction.list();
        model.addObject("listContact", listContact);
        model.setViewName("home");

        return model;
    }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        Contact newContact = new Contact();
        model.addObject("contact", newContact);
        model.setViewName("ContactForm");

        return model;
    }

    @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
    public ModelAndView saveContact(@ModelAttribute Contact contact) {
        contactAction.saveOrUpdate(contact);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
    public ModelAndView deleteContact(HttpServletRequest request) {
        int contactId = Integer.parseInt(request.getParameter("id"));
        contactAction.delete(contactId);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editContact", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int contactId = Integer.parseInt(request.getParameter("id"));
        Contact contact = contactAction.get(contactId);
        ModelAndView model = new ModelAndView("ContactForm");
        model.addObject("contact", contact);

        return model;
    }
}
