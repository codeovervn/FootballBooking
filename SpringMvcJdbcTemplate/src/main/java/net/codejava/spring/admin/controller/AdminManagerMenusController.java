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
 * Đây là trang Admin Manager Menus.
 * 
 * @author DungLT-18/03/2017
 * 
 */
@Controller
public class AdminManagerMenusController {

    @Autowired
    private TicketAction ticketAction;

    @RequestMapping(value = "/addMenus", method = RequestMethod.GET)
    public ModelAndView addMenus(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        Ticket menus = new Ticket();
        model.addObject("menus", menus);
        model.setViewName("admins/admin_quanly_menu_edit");

        return model;
    }

    @RequestMapping(value = "/saveMenus", method = RequestMethod.POST)
    public ModelAndView saveMenus(@ModelAttribute Ticket menu, HttpServletRequest request) throws ParseException {
        ticketAction.saveOrUpdate(menu);
        return new ModelAndView("redirect:/adminquanlymenus");
    }

    @RequestMapping(value = "/deleteMenus", method = RequestMethod.GET)
    public ModelAndView deleteMenus(HttpServletRequest request) {
        int menusId = Integer.parseInt(request.getParameter("id"));
        ticketAction.delete(menusId);

        return new ModelAndView("redirect:/adminquanlymenus");
    }

    @RequestMapping(value = "/editMenus", method = RequestMethod.GET)
    public ModelAndView editMenus(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        int menusId = Integer.parseInt(request.getParameter("id"));
        Ticket menus = ticketAction.get(menusId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_menu_edit");
        model.addObject("menus", menus);

        return model;
    }
}
