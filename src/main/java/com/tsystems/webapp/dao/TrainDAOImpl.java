package com.tsystems.webapp.dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.tsystems.webapp.DBUtil;
import com.tsystems.webapp.dao.interfacesDAO.IntTrainDAO;
import com.tsystems.webapp.model.TrainModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainDAOImpl implements IntTrainDAO{
    private Connection conn;

    public TrainDAOImpl() throws SQLException {
        conn = (Connection)DBUtil.getConnection();
    }
    @Override
    public void addTrain( TrainModel train ) {
        try {
            String query = "insert into train (id, trainNumber, placesCount, arrivalStation) values (?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setObject( 1, null);
            preparedStatement.setInt( 2, train.getTrainNumber() );
            preparedStatement.setInt( 3, train.getPlacesCount() );
            preparedStatement.setString( 4, train.getArrivalStation() );
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void deleteTrain( int id ) {
        try {
            String query = "delete from train where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateTrain( TrainModel train ) {
        try {
            String query = "update train set id=?, trainNumber=?, placesCount=?, arrivalStation=? where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt( 1, train.getId() );
            preparedStatement.setInt( 2, train.getTrainNumber() );
            preparedStatement.setInt( 3, train.getPlacesCount() );
            preparedStatement.setString( 4, train.getArrivalStation() );
            preparedStatement.setInt(5, train.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<TrainModel> getAllTrains() {
        List<TrainModel> trains = new ArrayList<TrainModel>();
        try {
            Statement statement = (Statement) conn.createStatement();
            ResultSet resultSet = statement.executeQuery( "select * from train" );
            while( resultSet.next() ) {
                TrainModel train = new TrainModel();
                train.setId( resultSet.getInt( "id" ) );
                train.setTrainNumber( resultSet.getInt( "trainNumber" ) );
                train.setPlacesCount( resultSet.getInt( "placesCount" ) );
                train.setArrivalStation( resultSet.getString( "arrivalStation" ) );

                trains.add(train);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trains;
    }
    @Override
    public TrainModel getTrainById(int id) {
        TrainModel train = new TrainModel();
        try {
            String query = "select * from train where id=?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement( query );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while( resultSet.next() ) {
                train.setId( resultSet.getInt( "id" ) );
                train.setTrainNumber( resultSet.getInt( "trainNumber" ) );
                train.setPlacesCount( resultSet.getInt( "placesCount" ) );
                train.setArrivalStation( resultSet.getString( "arrivalStation" ) );

            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return train;
    }

}
