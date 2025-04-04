package org.konoha.model.DAO;



import org.konoha.DatabaseConection.DatabaseConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO {


    public static List<String> listarNinjas() throws SQLException {
        String sql = "SELECT * FROM Ninja";
        List<String> ninja = new ArrayList<>();


        try (
                Connection connection = DatabaseConection.connection();
                PreparedStatement soli = connection.prepareStatement(sql);
                ResultSet resultSet = soli.executeQuery();){
            while (resultSet.next()) {
                ninja.add(resultSet.getInt("id")+
                        "-"+ resultSet.getString("nombre")+
                        "-"+ resultSet.getString("Rango")+
                        "-"+ resultSet.getString("aldea"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ninja;
    }

    public static List<String> listarNinjasPorRango(String rango) throws SQLException {
        List<String> ninjas = new ArrayList<>();
        String sql = "SELECT * FROM Ninja WHERE Rango = ?";

        try
    }



}
