package dao;

import entities.ContactDTO;
import utils.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {

    private Connection conn;

    public ContactDAOImpl() {
        conn = Connector.getConnection();
    }

    public ContactDTO createContact(ContactDTO contactDTO) {

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO contacts VALUES (?,?,?,?)");
            ps.setInt(1, contactDTO.getId());
            ps.setString(2, contactDTO.getFirstName());
            ps.setString(3, contactDTO.getLastName());
            ps.setString(4, contactDTO.getEmail());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // todo
        return new ContactDTO(1, "Name", null, null);
    }

    public List<ContactDTO> getContacts() {
        return new ArrayList<ContactDTO>();         // fixme заглушка

//        List<ContactDTO> contacts = new ArrayList<ContactDTO>();
//        try {
//            PreparedStatement ps = conn.prepareStatement("SELECT * FROM contacts");
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()){
//                ContactDTO contactDTO = new ContactDTO(rs.getInt("id"),
//                                                rs.getString("firstname"),
//                                                rs.getString("lastname"),
//                                                rs.getString("email"));
//                contacts.add(contactDTO);
//            }
//
//            ps.close();
//
//            return contacts;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

}
