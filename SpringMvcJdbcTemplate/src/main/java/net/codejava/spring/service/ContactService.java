package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.Contact;

public interface ContactService {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}
