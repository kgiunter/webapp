package com.tsystems.webapp.dao;


import com.tsystems.webapp.dao.impl.TrainDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory implements DAOFactory{

    private String user = "root";//Логин пользователя
    private String password = "root";//Пароль пользователя
    private String url = "jdbc:mysql://localhost:3306/DBTrain";//URL адрес
    private String driver = "com.mysql.jdbc.Driver";//Имя драйвера

    public MySQLDAOFactory() {
        try
        {
            Class.forName(driver);//Регистрируем драйвер
        } catch (ClassNotFoundException e) {e.printStackTrace();}
    }


    public  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public TrainDAO getTrainDAO(Connection connection) {
        return null;
    }



    }
