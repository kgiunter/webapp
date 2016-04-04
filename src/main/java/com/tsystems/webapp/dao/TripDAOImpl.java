package com.tsystems.webapp.dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.tsystems.webapp.DBUtil;
import com.tsystems.webapp.dao.interfacesDAO.IntTripsDAO;
import com.tsystems.webapp.model.TripModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripDAOImpl {
       /*
        implements IntTripsDAO{
    private Connection conn;

    public TripDAOImpl() throws SQLException {
        conn = (Connection) DBUtil.getConnection();
    }

    @Override
    public List<TripModel> getAllTrips(String stationName, String arrivalStation, long date1, long date2) {
        List<TripModel> trips = new ArrayList<TripModel>();
        try {
            String query = "select station.stationName, time(schedule.departureDate) AS departureDate, " +
                    "time(schedule.arrivalDate) AS arrivalDate, train.arrivalStation, train.trainNumber " +
                    "from station, schedule, train where station.id = schedule.Station_id and schedule.Train_id = train.id " +
                    "and station.stationName = ? and train.arrivalStation = ? and ( TIME(schedule.departureDate) BETWEEN ? AND ? )";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setString(1, stationName);
            preparedStatement.setString(2, arrivalStation);
            preparedStatement.setDate(3, (java.sql.Date)new Date(date1 ));
            preparedStatement.setDate(4, (java.sql.Date) new Date(date2));
            ResultSet resultSet = preparedStatement.executeQuery();

            int id=1;
            while( resultSet.next() ) {
                TripModel trip = new TripModel();
                trip.setId( id++ );
                trip.setStationName(resultSet.getString("stationName"));
                trip.setDepartureDate(resultSet.getDate("departureDate"));
                trip.setArrivalDate(resultSet.getDate("arrivalDate"));
                trip.setArrivalStation(resultSet.getString("arrivalStation"));
                trip.setTrainNumber(resultSet.getInt("trainNumber"));
                trips.add(trip);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trips;
    }
    */
}
