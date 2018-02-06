package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.Ticket;

public interface TicketsService {

    public List<Ticket> getDataTicketsAll();

    public void saveOrUpdate(Ticket tickets);

    public void delete(int ticketsId);

    public Ticket get(int ticketsId);

    public Ticket getInfoLogin(String usercode, String password);
}
