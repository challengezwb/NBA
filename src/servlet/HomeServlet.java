package servlet;

import javabean.Query;
import javabean.TodayQuery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by challengezwb on 4/20/17.
 */
@WebServlet(name = "HomeServlet")
public class HomeServlet extends HttpServlet {
    public HomeServlet(){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String playerName = request.getParameter("playerName");
        String teamName = request.getParameter("teamName");
        String time = request.getParameter("Time");
        Query query = new Query();
        if(playerName != null){
            HttpSession session = request.getSession();
            String[] playData = query.getPlayerName(playerName);
            if(playData != null){
                session.setAttribute("playData",playData);
                request.getRequestDispatcher("player.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp");
            }
        }else if(teamName != null){
            HttpSession session = request.getSession();
            String[] teamnData = query.getTeamName(teamName);
            if(teamnData != null){
                session.setAttribute("teamData",teamnData);
                request.getRequestDispatcher("team.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }else if(time != null){
            HttpSession session = request.getSession();
            TodayQuery today = new TodayQuery();
            List<List<String[]>> dateData = today.todayData(time);
            if(today != null){
                session.setAttribute("Date",dateData);
                request.getRequestDispatcher("NBA.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
