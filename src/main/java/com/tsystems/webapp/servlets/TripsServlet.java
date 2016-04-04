package com.tsystems.webapp.servlets;


import com.tsystems.webapp.dao.TripDAOImpl;
import com.tsystems.webapp.model.TripModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

public class TripsServlet{
/*
@WebServlet("/TripsServlet")
public class TripsServlet extends HttpServlet {
    private TripDAOImpl dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_TRIPS = "/listTrips.jsp";

    public TripsServlet() throws SQLException {
        dao = new TripDAOImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = lIST_TRIPS;
        String stationName = request.getParameter("departureStation");
        String arrivalStation = request.getParameter("arrivalStation");
        long date1 = Date.parse(request.getParameter("date1"));
        long date2 = Date.parse(request.getParameter("date2"));


        request.setAttribute("trips", dao.getAllTrips(stationName, arrivalStation, date1, date2));

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    */
}
