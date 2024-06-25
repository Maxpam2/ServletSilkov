package dao;

import entities.ContactDTO;

import java.util.List;

public interface ContactDAO {
    ContactDTO createContact(ContactDTO contactDTO);

    List<ContactDTO> getContacts();
}
