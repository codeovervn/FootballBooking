package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.Ticket;
//import net.codejava.spring.model.Menu;

/**
 * Đây là DAO của trang Quản lý Vé dành riêng cho Admin.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public interface TicketsDAO {

    public List<Ticket> getDataTicketsAll();

    public void saveOrUpdate(Ticket ticket);

    public void delete(int ticketId);

    public Ticket get(int ticketId);

    public Ticket getInfoLogin(String usercode, String password);

}
