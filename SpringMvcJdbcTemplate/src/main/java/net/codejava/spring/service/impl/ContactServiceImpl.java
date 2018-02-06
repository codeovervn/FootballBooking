package net.codejava.spring.service.impl;

import java.util.List;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;

import net.codejava.spring.dao.ContactDAO;
import net.codejava.spring.model.Contact;
import net.codejava.spring.service.ContactService;

public class ContactServiceImpl implements ContactService {

//    @SuppressWarnings("unused")
//    private JdbcTemplate jdbcTemplate;
//    
//    public ContactServiceImpl(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
    
    @Autowired
    private ContactDAO contactDAO;

    @Override
    public void saveOrUpdate(Contact contact) {
        contactDAO.saveOrUpdate(contact);
    }

    @Override
    public void delete(int contactId) {
        contactDAO.delete(contactId);        
    }

    @Override
    public Contact get(int contactId) {
        Contact contact = contactDAO.get(contactId);
        return contact;
    }

    @Override
    public List<Contact> list() {
        List<Contact> listContact = contactDAO.list();
        return listContact;
    }

}
