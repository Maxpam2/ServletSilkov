package controllers;

import entities.ContactDTO;
import services.ContactService;

import java.util.List;

public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    public ContactDTO createContact(ContactDTO contactDTO) {
        return contactService.createContact(contactDTO);
    }

    public List<ContactDTO> getContacts(){
        return contactService.getContacts();
    }

}
