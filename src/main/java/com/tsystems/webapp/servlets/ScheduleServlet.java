package com.tsystems.webapp.servlets;


import com.tsystems.webapp.dao.ScheduleDAOImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

//@WebServlet("/ScheduleServlet")
public class ScheduleServlet {
        /*
        extends HttpServlet {
    private ScheduleDAOImpl dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_SCHEDULES = "/listSchedules.jsp";

    public ScheduleServlet() throws SQLException {
        dao = new ScheduleDAOImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );
        int StationId = Integer.parseInt(request.getParameter("id"));

        if( action.equalsIgnoreCase( "show" ) )
        {
            forward = lIST_SCHEDULES;
            request.setAttribute("schedules", dao.getAllSchedules(StationId) );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    */
}

