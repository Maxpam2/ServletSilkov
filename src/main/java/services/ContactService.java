package services;

import dao.ContactDAO;
import entities.ContactDTO;

import java.util.List;


public class ContactService {
    private ContactDAO contactDAO;

    public ContactDTO createContact(ContactDTO contactDTO){
        return contactDAO.createContact(contactDTO);
    }

    public List<ContactDTO> getContacts() {
        return contactDAO.getContacts();
    }
}
