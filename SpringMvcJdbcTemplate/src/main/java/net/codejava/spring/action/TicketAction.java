package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Ticket;
import net.codejava.spring.service.TicketsService;

/**
 * Đây là Action của trang Thông tin về Vé.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public class TicketAction {

    @Autowired
    TicketsService ticketService;

    public List<Ticket> getDataTicket() {
        List<Ticket> getTicketList = ticketService.getDataTicketsAll();
        return getTicketList;
    }

    public void saveOrUpdate(Ticket Ticket) {
        ticketService.saveOrUpdate(Ticket);
    }

    public void delete(int ticketId) {
        ticketService.delete(ticketId);
    }

    public Ticket get(int ticketId) {
        Ticket ticket = ticketService.get(ticketId);
        return ticket;
    }

    public Ticket getInfoLogin(String usercode, String password) {
        Ticket ticket = ticketService.getInfoLogin(usercode, password);
        return ticket;
    }
}
