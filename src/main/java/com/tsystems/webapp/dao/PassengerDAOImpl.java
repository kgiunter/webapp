package com.tsystems.webapp.dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.tsystems.webapp.DBUtil;
import com.tsystems.webapp.dao.interfacesDAO.IntPassengerDAO;
import com.tsystems.webapp.model.PassengerModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAOImpl {
    /*
        implements IntPassengerDAO{
    private Connection conn;

    public PassengerDAOImpl() throws SQLException {
        conn = (Connection) DBUtil.getConnection();
    }

    @Override
    public List<PassengerModel> getAllPassengers(int scheduleId) {
        List<PassengerModel> passengers = new ArrayList<PassengerModel>();
        try {
            String query = "select passenger.lastName, passenger.firstName, passenger.birthday \n" +
                    "from station, schedule, train, ticket, passenger where passenger.id = ticket.Passenger_id and ticket.Schedule_id = schedule.id \n" +
                    "and train.id = ticket.Train_id and station.id = schedule.Station_id and schedule.id = ?;";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, scheduleId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while( resultSet.next() ) {
                PassengerModel passenger = new PassengerModel();
               // passenger.setId( resultSet.getInt( "id" ) );
                passenger.setLastName(resultSet.getString("lastName"));
                passenger.setFirstName(resultSet.getString("firstName"));
                passenger.setBirthday(resultSet.getDate("birthday"));
                passengers.add(passenger);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passengers;
    }

    @Override
    public PassengerModel getPassengerById(int id) {
        PassengerModel passenger = new PassengerModel();
        try {
            String query = "select * from passenger where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while( resultSet.next() )
            {
                passenger.setId( resultSet.getInt( "id" ) );
                passenger.setLastName(resultSet.getString("lastName"));
                passenger.setFirstName(resultSet.getString("firstName"));
                passenger.setBirthday(resultSet.getDate("birthday"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passenger;
    }
    */
}
