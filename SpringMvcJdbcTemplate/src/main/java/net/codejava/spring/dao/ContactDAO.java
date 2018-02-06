package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.Contact;

/**
 * Đây là DAO của trang Demo
 * 
 * @author DungLT-27/02/2017
 * 
 */
public interface ContactDAO {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}
