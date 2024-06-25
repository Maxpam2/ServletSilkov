package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            System.err.println("Не подключиться к БД");
        }

        return null;        // todo ap
    }

}
