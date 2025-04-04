package org.konoha.DatabaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {
    private static String URL = "jdbc:mysql://brt0fudigzzzclgp7yej-mysql.services.clever-cloud.com:3306/brt0fudigzzzclgp7yej";
    private static String USER = "uoybqq8at9yft4ri";
    private static String PASSWORD = "xkUkX4APPdOtpy7Ittnq";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    };

    public static void main(String[] args) {
        try{
            connection();
            System.out.println("coneccioin exitosa..");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
