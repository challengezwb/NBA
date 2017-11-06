package servlet;

import javabean.User;
import javabean.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by challengezwb on 4/19/17.
 */
//@WebServlet(name = "SignUpServlet")
@WebServlet(name = "SignUpServlet",urlPatterns = {"/servlet/SignUpServlet"})
public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SignUpServlet() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
       // System.out.println("jajajaja");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String emailAddress = request.getParameter("EmailAddress");
        String passWord = request.getParameter("PassWord");
        String userName = request.getParameter("name");
        HttpSession session = request.getSession();
        User newUser = new User(userName, passWord, emailAddress);
        UserDao newUD = new UserDao();
        try {
            newUD.resigtrate(newUser);
            session.setAttribute("NewUser", newUser);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
