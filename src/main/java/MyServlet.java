import com.google.gson.Gson;
import controllers.ContactController;
import entities.ContactDTO;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


//    Postman - HttpServlet - Controller - Service - DAO - database

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    private ContactController contactController;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<ContactDTO> contacts = contactController.getContacts();// fixme      localhost:8080/getContact?id=123

        Gson gson = new Gson();
        String jsonContactDTO = gson.toJson(contacts);

//        res.setStatus();      todo
        res.getWriter().write(jsonContactDTO);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        Gson gson = new Gson();
        ContactDTO contactDTO = gson.fromJson(req.getReader(), ContactDTO.class);

        contactController.createContact(contactDTO);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        doGet((HttpServletRequest) req,(HttpServletResponse) res);
    }


}
