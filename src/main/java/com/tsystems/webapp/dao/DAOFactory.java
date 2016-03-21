package com.tsystems.webapp.dao;

import com.tsystems.webapp.dao.impl.ImplTrainDAO;

import java.sql.Connection;
import java.sql.SQLException;


public interface DAOFactory {
    /** Возвращает подключение к базе данных */

    public  Connection getConnection() throws SQLException;

        /** Возвращает объект для управления персистентным состоянием объекта Train */
       public ImplTrainDAO getTrainDAO(Connection connection);
    //...

    /** Фабрика объектов для работы с базой данных */
//    public interface DaoFactory<Context> {

  //      public interface DaoCreator<Context> {
   //         public GenericDao create(Context context);
   //     }

        /** Возвращает подключение к базе данных */
  //      public Context getContext() throws PersistException;

        /** Возвращает объект для управления персистентным состоянием объекта */
  //      public GenericDao getDao(Context context, Class dtoClass) throws PersistException;
  //  }

}
