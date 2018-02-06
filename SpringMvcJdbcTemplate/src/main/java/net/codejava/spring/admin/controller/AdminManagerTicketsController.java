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
 * Đây là trang Admin Manager Tickets
 * 
 * @author DungLT-13/03/2017
 * 
 */
@Controller
public class AdminManagerTicketsController {

    @Autowired
    private TicketAction ticketAction;

    @RequestMapping(value = "/addTickets", method = RequestMethod.GET)
    public ModelAndView addUsers(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        Ticket tickets = new Ticket();
        model.addObject("tickets", tickets);
        model.setViewName("admins/admin_quanly_ticket_edit");

        return model;
    }

    @RequestMapping(value = "/saveTickets", method = RequestMethod.POST)
    public ModelAndView saveUsers(@ModelAttribute Ticket ticket, HttpServletRequest request) throws ParseException {
        ticketAction.saveOrUpdate(ticket);
        return new ModelAndView("redirect:/adminquanlyticket");
    }

    @RequestMapping(value = "/deleteTickets", method = RequestMethod.GET)
    public ModelAndView deleteUsers(HttpServletRequest request) {
        int usersId = Integer.parseInt(request.getParameter("id"));
        ticketAction.delete(usersId);

        return new ModelAndView("redirect:/adminquanlyticket");
    }

    @RequestMapping(value = "/editTickets", method = RequestMethod.GET)
    public ModelAndView editUsers(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        int ticketsId = Integer.parseInt(request.getParameter("id"));
        Ticket ticket = ticketAction.get(ticketsId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_ticket_edit");
        model.addObject("ticket", ticket);

        return model;
    }
}
