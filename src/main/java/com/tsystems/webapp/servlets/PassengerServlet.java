package com.tsystems.webapp.servlets;


import com.tsystems.webapp.dao.PassengerDAOImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

//@WebServlet("/PassengerServlet")
public class PassengerServlet {
        /*
        extends HttpServlet {
    private PassengerDAOImpl dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_PASSENGERS = "/listPassengers.jsp";

    public PassengerServlet() throws SQLException {
        dao = new PassengerDAOImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );
        int scheduleId = Integer.parseInt(request.getParameter("id"));

        if( action.equalsIgnoreCase( "show" ) )
        {
            forward = lIST_PASSENGERS;
            request.setAttribute("passengers", dao.getAllPassengers(scheduleId) );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    */
}
