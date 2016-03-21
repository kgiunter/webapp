package com.tsystems.webapp.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.tsystems.webapp.DBUtil;
import com.tsystems.webapp.dao.interfacesDAO.IntStationDAO;
import com.tsystems.webapp.model.StationModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StationDAOImpl {
/*
implements IntStationDAO {

    private Connection conn;

    public StationDAOImpl() throws SQLException {
        conn = (Connection) DBUtil.getConnection();
    }
    @Override
    public void addStation(StationModel station) {

        try {
            String query = "insert into station (id, stationName) values (?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt( 1, station.getId());
            preparedStatement.setString( 2, station.getStationName() );
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void deleteStation( int id ) {
        try {
            String query = "delete from station where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateStation( StationModel station ) {
        try {
            String query = "update station set id=?, stationName=? where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt( 1, station.getId() );
            preparedStatement.setString( 2, station.getStationName() );
            preparedStatement.setInt(3, station.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<StationModel> getAllStations() {
        List<StationModel> stations = new ArrayList<StationModel>();
        try {
            Statement statement = (Statement) conn.createStatement();
            ResultSet resultSet = statement.executeQuery( "select * from station" );
            while( resultSet.next() ) {
                StationModel station = new StationModel();
                station.setId( resultSet.getInt( "id" ) );
                station.setStationName( resultSet.getString( "stationName" ) );
                stations.add(station);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stations;
    }
    @Override
    public StationModel getStationById(int id) {
        StationModel station = new StationModel();
        try {
            String query = "select * from station where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while( resultSet.next() )
            {
                station.setId( resultSet.getInt( "id" ) );
                station.setStationName( resultSet.getString( "stationName" ) );
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return station;
    }
*/
}

