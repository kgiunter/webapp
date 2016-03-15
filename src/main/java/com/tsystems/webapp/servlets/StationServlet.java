package com.tsystems.webapp.servlets;


import com.tsystems.webapp.dao.StationDAOImpl;
import com.tsystems.webapp.model.StationModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/StationServlet")
public class StationServlet extends HttpServlet {
    private StationDAOImpl dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_STATIONS = "/listStations.jsp";
    public static final String INSERT_OR_EDIT = "/station.jsp";
    public static final String INSERT = "/stationAdd.jsp";

    public StationServlet() throws SQLException {
        dao = new StationDAOImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );

        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = lIST_STATIONS;
            int stationId = Integer.parseInt( request.getParameter("id") );
            dao.deleteStation(stationId);
            request.setAttribute("stations", dao.getAllStations());
        }
        else if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            int stationId = Integer.parseInt( request.getParameter("id") );
            StationModel station = dao.getStationById(stationId);
            request.setAttribute("station", station);
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT;

        }

        else {
            forward = lIST_STATIONS;
            request.setAttribute("stations", dao.getAllStations() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StationModel station = new StationModel();
        try {
            station.setId(Integer.parseInt(request.getParameter("id")));
        } catch (Exception e) {}
        station.setStationName( request.getParameter( "stationName" ) );

        String stationId = request.getParameter("id");

        if( stationId == null || stationId.isEmpty() ) {
            station.setId(Integer.parseInt(request.getParameter("idAdd")));
            dao.addStation(station);
        }
       else {
            station.setId( Integer.parseInt(stationId) );
            dao.updateStation(station);
       }
        RequestDispatcher view = request.getRequestDispatcher(lIST_STATIONS );
        request.setAttribute("stations", dao.getAllStations());
        view.forward(request, response);
    }
}
