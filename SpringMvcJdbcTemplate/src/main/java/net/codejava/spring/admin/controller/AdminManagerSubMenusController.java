package net.codejava.spring.admin.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.TicketAction;
import net.codejava.spring.model.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Admin Manager SubMenus.
 * 
 * @author DungLT-18/03/2017
 * 
 */
@Controller
public class AdminManagerSubMenusController {

    @Autowired
    private TicketAction ticketAction;

    @RequestMapping(value = "/addSubMenus", method = RequestMethod.GET)
    public ModelAndView addSubMenus(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        Ticket submenus = new Ticket();
        model.addObject("submenus", submenus);
        model.setViewName("admins/admin_quanly_submenu_edit");

        return model;
    }

    @RequestMapping(value = "/saveSubMenus", method = RequestMethod.POST)
    public ModelAndView saveSubMenus(@ModelAttribute Ticket submenu, HttpServletRequest request) throws ParseException {
        ticketAction.saveOrUpdate(submenu);
        return new ModelAndView("redirect:/adminquanlysubmenus");
    }

    @RequestMapping(value = "/deleteSubMenus", method = RequestMethod.GET)
    public ModelAndView deleteSubMenus(HttpServletRequest request) {
        int submenusId = Integer.parseInt(request.getParameter("id"));
        ticketAction.delete(submenusId);

        return new ModelAndView("redirect:/adminquanlysubmenus");
    }

    @RequestMapping(value = "/editSubMenus", method = RequestMethod.GET)
    public ModelAndView editSubMenus(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        int submenusId = Integer.parseInt(request.getParameter("id"));
        Ticket submenus = ticketAction.get(submenusId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_submenu_edit");
        model.addObject("submenus", submenus);

        return model;
    }
}
