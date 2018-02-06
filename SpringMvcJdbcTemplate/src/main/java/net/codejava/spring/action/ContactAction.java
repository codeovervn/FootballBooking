package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Contact;
import net.codejava.spring.service.ContactService;

/**
 * Đây là Action của trang Liên hệ với ban quản trị.
 * 
 * @author DungLT-27/02/2017
 * 
 */
public class ContactAction {

    @Autowired
    ContactService contactService;

    public List<Contact> list() {
        List<Contact> listContact = contactService.list();
        return listContact;
    }
    public void saveOrUpdate(Contact contact) {
        contactService.saveOrUpdate(contact);
    }

    public void delete(int contactId) {
        contactService.delete(contactId);
    }

    public Contact get(int contactId) {
        Contact contact = contactService.get(contactId);
        return contact;
    }
}
