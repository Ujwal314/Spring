package org.example.dao;

import java.sql.*;

public class DbConnect {
    private static Connection connection=null;
    public static Connection getConnection() throws Exception {
        if (connection==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
                    "root",
                    "pass@word1");
        }
        return connection;
    }
}
