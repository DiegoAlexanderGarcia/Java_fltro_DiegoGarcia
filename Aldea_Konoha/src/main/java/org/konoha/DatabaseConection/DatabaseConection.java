package org.konoha.DatabaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {
    private static String URL = "jdbc:mysql://localhost:3306/aldeaKonoha";
    private static String USER = "root";
    private static String PASSWORD = "campus2023";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    };
}
