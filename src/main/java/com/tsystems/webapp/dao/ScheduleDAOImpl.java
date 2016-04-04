package com.tsystems.webapp.dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.tsystems.webapp.DBUtil;
import com.tsystems.webapp.dao.interfacesDAO.IntScheduleDAO;
import com.tsystems.webapp.model.ScheduleModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleDAOImpl {

    /*implements
} IntScheduleDAO {
    private Connection conn;

    public ScheduleDAOImpl() throws SQLException {
        conn = (Connection) DBUtil.getConnection();
    }

    @Override
    public List<ScheduleModel> getAllSchedules(int station_id) {
        List<ScheduleModel> schedules = new ArrayList<ScheduleModel>();
        try {
            String query = "select schedule.id, station.stationName, schedule.departureDate, schedule.arrivalDate, train.arrivalStation, " +
                    "train.trainNumber from station, schedule, train where station.id = schedule.Station_id and schedule.Train_id = train.id and schedule.Station_id = ? and schedule.status = 1";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, station_id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while( resultSet.next() ) {
                ScheduleModel schedule = new ScheduleModel();
                schedule.setId( resultSet.getInt( "id" ) );
                schedule.setStationName(resultSet.getString("stationName"));
                schedule.setDepartureDate(resultSet.getTime("departureDate"));
                schedule.setArrivalDate(resultSet.getTime("arrivalDate"));
                schedule.setArrivalStation(resultSet.getString("arrivalStation"));
                schedule.setTrainNumber(resultSet.getInt("trainNumber"));
                schedules.add(schedule);
            }
        resultSet.close();
        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedules;
    }

    @Override
    public ScheduleModel getScheduleById(int id) {
        ScheduleModel schedule = new ScheduleModel();
        try {
            String query = "select * from schedule where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while( resultSet.next() )
            {
                schedule.setId( resultSet.getInt( "id" ) );
                schedule.setStation_id(resultSet.getInt("Station_id"));
                schedule.setTrain_id(resultSet.getInt("Train_id"));
                schedule.setDepartureDate(resultSet.getDate("departureDate"));
                schedule.setArrivalDate(resultSet.getDate("arrivalDate"));
                schedule.setStatus(resultSet.getInt("status"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedule;

    }
    */
}
