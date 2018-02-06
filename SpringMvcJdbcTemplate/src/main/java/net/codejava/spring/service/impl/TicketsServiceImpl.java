package net.codejava.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.TicketsDAO;
import net.codejava.spring.model.Ticket;
import net.codejava.spring.service.TicketsService;

public class TicketsServiceImpl implements TicketsService {

    @Autowired
    private TicketsDAO ticketsDAO;

    /** 
     * Phương thức hiển thị trang Quản lý Vé dành riêng cho Admin.
     * 
     * @return : Service ticket
     */
    @Override
    public List<Ticket> getDataTicketsAll() {
        List<Ticket> getDataUsersAll = ticketsDAO.getDataTicketsAll();
        return getDataUsersAll;
    }

    @Override
    public void saveOrUpdate(Ticket ticket) {
    	ticketsDAO.saveOrUpdate(ticket);
    }

    @Override
    public void delete(int ticket) {
    	ticketsDAO.delete(ticket);
    }

    @Override
    public Ticket get(int ticketId) {
    	Ticket ticket = ticketsDAO.get(ticketId);
        return ticket;
    }

    @Override
    public Ticket getInfoLogin(String usercode, String password) {
    	Ticket ticket = ticketsDAO.getInfoLogin(usercode, password);
        return ticket;
    }
}
