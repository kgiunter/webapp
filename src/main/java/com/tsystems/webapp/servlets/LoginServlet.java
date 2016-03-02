package com.tsystems.webapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.*;
import java.sql.*;
import javax.servlet.*;



public class LoginServlet extends HttpServlet{
    private ServletConfig config;

    public void init(ServletConfig config)
            throws ServletException{
        this.config=config;
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        PrintWriter out = response.getWriter();
        String connectionURL = "jdbc:mysql://localhost:3306/DBTrain";
        Connection connection=null;
        ResultSet rs;
        String userName=new String("");
        String passwrd=new String("");
        String userType = new String("");
        response.setContentType("text/html");
        try {
//Загружаем драйвер БД
            Class.forName("com.mysql.jdbc.Driver");
// Получаем подключение к базе данных
            connection = DriverManager.getConnection(connectionURL, "root", "root");
//Заносим данные в базу
            String sql = "select login , password, userType from User";
            Statement s = connection.createStatement();
            s.executeQuery (sql);
            rs = s.getResultSet();
            int count=0;
            while (rs.next ())
            {

                userName=rs.getString("login");
                passwrd=rs.getString("password");
                userType=rs.getString("userType");

                if(userName.equals(request.getParameter("username")) &&
                        passwrd.equals(request.getParameter("password")))
                {

                    if (userType.equals("ADMIN"))
                    {
                        //out.println("User Authenticated - ADMIN");

                        request.getRequestDispatcher("adminPage.jsp").forward(request, response);

                        count=1;
                        break;
                    }
                    else
                    {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("userPage.jsp");

                        if (dispatcher != null) {

                            dispatcher.forward(request, response);

                        }
                        count=1;
                        break;
                    }

                    //

                }

               // else
               // {

                //    break;
                //}
            }
            if (count==0) {request.getRequestDispatcher("errorPage.jsp").forward(request, response);}
            //out.println("You are not an authentic person");
            rs.close ();
            s.close ();
        }catch(Exception e){
            System.out.println("Exception is ;"+e);
        }


    }
}