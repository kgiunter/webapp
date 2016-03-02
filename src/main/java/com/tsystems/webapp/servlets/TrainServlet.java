package com.tsystems.webapp.servlets;


import com.tsystems.webapp.dao.TrainDAOImpl;
import com.tsystems.webapp.model.TrainModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/TrainServlet")
public class TrainServlet extends HttpServlet {

    private TrainDAOImpl dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_TRAINS = "/listTrains.jsp";
    public static final String INSERT_OR_EDIT = "/train.jsp";

   // EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MyEM");
  //  EntityManager entitymanager = emfactory.createEntityManager( );


    public TrainServlet() throws SQLException {
        dao = new TrainDAOImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );

        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = lIST_TRAINS;
            int trainId = Integer.parseInt( request.getParameter("id") );
            dao.deleteTrain(trainId);
            request.setAttribute("trains", dao.getAllTrains());
        }
        else if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            int trainId = Integer.parseInt( request.getParameter("id") );
            TrainModel train = dao.getTrainById(trainId);
            request.setAttribute("train", train);
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT_OR_EDIT;
        }
        else {
            forward = lIST_TRAINS;
            request.setAttribute("trains", dao.getAllTrains() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TrainModel train = new TrainModel();
        try {
            train.setId(Integer.parseInt(request.getParameter("id")));
        } catch (Exception e) {}
        train.setTrainNumber( Integer.parseInt(request.getParameter( "trainNumber" ) ));
        train.setPlacesCount( Integer.parseInt( request.getParameter( "placesCount" ) ) );
        train.setArrivalStation( request.getParameter( "arrivalStation" ) );


        String trainId = request.getParameter("id");

        if( trainId == null || trainId.isEmpty() )
            dao.addTrain(train);
        else {
            train.setId( Integer.parseInt(trainId) );
            dao.updateTrain(train);
        }
        RequestDispatcher view = request.getRequestDispatcher(lIST_TRAINS );
        request.setAttribute("trains", dao.getAllTrains());
        view.forward(request, response);
    }
}