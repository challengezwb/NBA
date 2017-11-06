package servlet;

import javabean.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by challengezwb on 4/20/17.
 */
@WebServlet(name = "TupleServlet")
public class TupleServlet extends HttpServlet {
    public TupleServlet(){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Query query = new Query();
        HttpSession session = request.getSession();
        int tuple = query.totalCount();
        if(tuple != 0){
            session.setAttribute("tuple",tuple);
            request.getRequestDispatcher("tuple.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
