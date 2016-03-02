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

public class StationDAOImpl implements IntStationDAO {
    private Connection conn;

    public StationDAOImpl() throws SQLException {
        conn = (Connection) DBUtil.getConnection();
    }
    @Override
    public void addStation(StationModel station) {
        try {
            String query = "insert into station (id, stationName, placesCount, arrivalStation) values (?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setObject( 1, null);
          //  preparedStatement.setInt( 2, train.getTrainNumber() );
         //   preparedStatement.setInt( 3, train.getPlacesCount() );
         //   preparedStatement.setString( 4, train.getArrivalStation() );
         //   preparedStatement.executeUpdate();
         //   preparedStatement.close();
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
    //    try {
          //  String query = "update train set id=?, trainNumber=?, placesCount=?, arrivalStation=? where id=?";
          //  PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
          //  preparedStatement.setInt( 1, train.getId() );
          //  preparedStatement.setInt( 2, train.getTrainNumber() );
          //  preparedStatement.setInt( 3, train.getPlacesCount() );
           // preparedStatement.setString( 4, train.getArrivalStation() );
          //  preparedStatement.setInt(5, train.getId());

          //  preparedStatement.executeUpdate();
         //   preparedStatement.close();
      //  } catch (SQLException e) {
       //     e.printStackTrace();
      //  }
    }
    @Override
    public List<StationModel> getAllStations() {
        List<StationModel> trains = new ArrayList<StationModel>();
        try {
            Statement statement = (Statement) conn.createStatement();
            ResultSet resultSet = statement.executeQuery( "select * from station" );
            while( resultSet.next() ) {
                StationModel station = new StationModel();
          //      train.setId( resultSet.getInt( "id" ) );
           //     train.setTrainNumber( resultSet.getInt( "trainNumber" ) );
           //     train.setPlacesCount( resultSet.getInt( "placesCount" ) );
           //     train.setArrivalStation( resultSet.getString( "arrivalStation" ) );

           //     trains.add(train);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trains;
    }
    @Override
    public StationModel getStationById(int id) {
        StationModel station = new StationModel();
        try {
            String query = "select * from train where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while( resultSet.next() ) {
           //     train.setId( resultSet.getInt( "id" ) );
           //     train.setTrainNumber( resultSet.getInt( "trainNumber" ) );
           //     train.setPlacesCount( resultSet.getInt( "placesCount" ) );
           //     train.setArrivalStation( resultSet.getString( "arrivalStation" ) );

            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return station;
    }

}

