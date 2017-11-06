/*
package servlet;

import javabean.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

*/
/**
 * Created by challengezwb on 4/19/17.
 *//*

//@WebServlet(name = "SearchServlet")
@WebServlet(name = "SearchServlet",urlPatterns = {"/servlet/SearchServlet"})

public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SearchServlet(){
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Query query = new Query();
        if (request.getParameter("teamName1") != null) {
            String[] searchData1 = new String[4];
            String teamName1 = request.getParameter("teamName1");
           // System.out.println(teamName1);

            searchData1[0] = teamName1;
            String teamName2 = request.getParameter("teamName2");
            searchData1[1] = teamName2;
            String dateStart = request.getParameter("dateStart");
            searchData1[2] = dateStart;
            String dateEnd = request.getParameter("dateEnd");
            searchData1[3] = dateEnd;
            HttpSession session = request.getSession();

            try {
                String[] resultData1 = query.winRateForTwoTeam(searchData1);
               // String[] resultData1 = query.winRateForTwoTeam(new String[]{"lak", "mag", "2006-04-18", "2016-10-18"});

                if(resultData1 !=null) {
                   */
/* String temp = resultData1[0];*//*

                    session.setAttribute("resultData1", resultData1);
                    request.getRequestDispatcher("query1.jsp").forward(request, response);
                } else {
                    session.setAttribute("resultData1", resultData1);
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        */
/*else if (request.getParameter(" ") != null) {
            String state = request.getParameter("state");
            HttpSession session = request.getSession();
            List<String[]> resultData2 = query.query2(state);
            request.setAttribute("resultData2", resultData2);
            request.getRequestDispatcher("Query2.jsp").forward(request, response);

        } else if (request.getParameter(" ") != null) {

        } else if (request.getParameter(" ") != null) {

        } else {

        }*//*

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   System.out.println("jajaja");

        this.doPost(request, response);

    }
}
*/
/*package servlet;

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

*//**
 * Created by challengezwb on 4/19/17.
 *//*
@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SearchServlet(){
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Query query = new Query();
        int tuple = query.totalCount();
       // session.setAttribute("tuple",tuple);
        if(request.getParameter("Date") != null){

            HttpSession session = request.getSession();
            TodayQuery todayQuery = new TodayQuery();
            String searchDate = request.getParameter("Date");
            List<List<String[]>> dateData = todayQuery.todayData(searchDate);
            if(dateData != null){
                session.setAttribute("Date",dateData);
                request.getRequestDispatcher("NBA.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }
        if (request.getParameter("teamName1") != null) {

            HttpSession session = request.getSession();
            System.out.println("ttttttttttt");

            String[] searchData1 = new String[4];
            String teamName1 = request.getParameter("teamName1");
            searchData1[0] = teamName1;
            String teamName2 = request.getParameter("teamName2");
            searchData1[1] = teamName2;
            String dateStart = request.getParameter("dateStart");
            searchData1[2] = dateStart;
            String dateEnd = request.getParameter("dateEnd");
            searchData1[3] = dateEnd;
            String[] resultData1 = query.winRateForTwoTeam(searchData1);
            if(resultData1 != null){
                session.setAttribute("resultData1", resultData1);
                request.getRequestDispatcher("query1.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

        } else if (request.getParameter(" ") != null) {

            HttpSession session = request.getSession();

            String state = request.getParameter("state");
            List<String[]> resultData2 = query.query2(state);
            if(resultData2 != null){
                session.setAttribute("resultData2", resultData2);
                request.getRequestDispatcher("query2.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }


        } else if (request.getParameter("startDate") != null) {

            HttpSession session = request.getSession();

            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            List<String[]> resultData3 = query.query3(startDate, endDate);
            if(resultData3 != null){
                session.setAttribute("resultData3", resultData3);
                request.getRequestDispatcher("query3.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }

        } else if (request.getParameter("abbreviation") != null) {

            HttpSession session = request.getSession();

            String abbreviation = request.getParameter("abbreviation");
            String beginDate = request.getParameter("beginDate");
            String overDate = request.getParameter("overDate");
            List<String[]> resultData4 = query.query4(abbreviation, beginDate, overDate);
            if(resultData4 != null){
                session.setAttribute("resultData4", resultData4);
                request.getRequestDispatcher("query4.jsp").forward(request,response);
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}*/



/*
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

*/
/**
 * Created by challengezwb on 4/19/17.
 *//*

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SearchServlet(){
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Query query = new Query();
        */
/*int tupe = query.totalCount();
        HttpSession session = request.getSession();
        session.setAttribute("tuple",tuple);*//*

        if(request.getParameter("Date") != null){
            TodayQuery todayQuery = new TodayQuery();
            String searchDate = request.getParameter("Date");
            List<List<String[]>> dateData = todayQuery.todayData(searchDate);
            HttpSession session = request.getSession();
            if(dateData != null){
                session.setAttribute("Date",dateData);
                request.getRequestDispatcher("NBA.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }
        if (request.getParameter("teamName1") != null) {
            String[] searchData1 = new String[4];
            String teamName1 = request.getParameter("teamName1");
            searchData1[0] = teamName1;
            String teamName2 = request.getParameter("teamName2");
            searchData1[1] = teamName2;
            String dateStart = request.getParameter("dateStart");
            searchData1[2] = dateStart;
            String dateEnd = request.getParameter("dateEnd");
            searchData1[3] = dateEnd;
            HttpSession session = request.getSession();
            String[] resultData1 = query.winRateForTwoTeam(searchData1);
            if(resultData1 != null){
                session.setAttribute("resultData1", resultData1);
                request.getRequestDispatcher("/query1.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }

        } else if (request.getParameter("state") != null) {
            String state = request.getParameter("state");
            HttpSession session = request.getSession();
            List<String[]> resultData2 = query.query2(state);
            if(resultData2 != null){
                session.setAttribute("resultData2", resultData2);
                request.getRequestDispatcher("query2.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }


        } else if (request.getParameter("startDate") != null) {
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            HttpSession session = request.getSession();
            List<String[]> resultData3 = query.query3(startDate, endDate);
            if(resultData3 != null){
                session.setAttribute("resultData3", resultData3);
                request.getRequestDispatcher("query3.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }

        } else if (request.getParameter(" ") != null) {

        } else {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
*/


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
 * Created by challengezwb on 4/19/17.
 */
@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SearchServlet(){
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Query query = new Query();
        int tuple = query.totalCount();
        HttpSession session = request.getSession();
       // session.setAttribute("tuple",tuple);
        if(request.getParameter("Date") != null){
            TodayQuery todayQuery = new TodayQuery();
            String searchDate = request.getParameter("Date");
            List<List<String[]>> dateData = todayQuery.todayData(searchDate);
            if(dateData != null){
                session.setAttribute("Date",dateData);
                request.getRequestDispatcher("NBA.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }

        if(request.getParameter("inputDate") != null){
            TodayQuery todayQuery = new TodayQuery();
            String searchDate = request.getParameter("inputDate");
            List<List<String[]>> dateData = todayQuery.todayData(searchDate);
            if(dateData != null){
                session.setAttribute("Date",dateData);
                request.getRequestDispatcher("NBA.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }

        if (request.getParameter("teamName1") != null) {
            String[] searchData1 = new String[4];
            String teamName1 = request.getParameter("teamName1");
            searchData1[0] = teamName1;
            String teamName2 = request.getParameter("teamName2");
            searchData1[1] = teamName2;
            String dateStart = request.getParameter("dateStart");
            searchData1[2] = dateStart;
            String dateEnd = request.getParameter("dateEnd");
            searchData1[3] = dateEnd;
            String[] resultData1 = query.winRateForTwoTeam(searchData1);
            if(resultData1 != null){
                session.setAttribute("resultData1", resultData1);
                request.getRequestDispatcher("query1.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

        } else if (request.getParameter("state") != null) {
            String state = request.getParameter("state");
            List<String[]> resultData2 = query.query2(state);
            if(resultData2 != null){
                session.setAttribute("resultData2", resultData2);
                request.getRequestDispatcher("query2.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }


        } else if (request.getParameter("startDate") != null) {
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            List<String[]> resultData3 = query.query3(startDate, endDate);
            if(resultData3 != null){
                session.setAttribute("resultData3", resultData3);
                request.getRequestDispatcher("query3.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }

        } else if (request.getParameter("abbreviation") != null) {
            String abbreviation = request.getParameter("abbreviation");
            String beginDate = request.getParameter("beginDate");
            String overDate = request.getParameter("overDate");
            List<String[]> resultData4 = query.query4(abbreviation, beginDate, overDate);
            if(resultData4 != null){
                session.setAttribute("resultData4", resultData4);
                request.getRequestDispatcher("query4.jsp").forward(request,response);
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
