package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static private String URL = "jdbc:mysql://127.0.0.1:3306/mydbtest?useSSL=false&serverTimezone=UTC";
    static private String PASSWORRD = "root";
    static private String NAME = "root";

    private static Connection connection;

    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(URL,PASSWORRD,NAME);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }





}
