package org.konoha.model.DAO;



import com.mysql.cj.protocol.Resultset;
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
                ninja.add(resultSet.getInt("ID_Ninja")+
                        "-"+ resultSet.getString("Nombre")+
                        "-"+ resultSet.getString("Rango")+
                        "-"+ resultSet.getString("Aldea"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ninja;
    }

    public static List<String> listarNinjaPorRango(String Rango) throws SQLException{
        String sql = "SELECT * FROM Ninja WHERE ?";
        List<String> Ninja =new ArrayList<>();

        try (
                Connection connection = DatabaseConection.connection();
                PreparedStatement soli = connection.prepareStatement(sql);
                ResultSet resultSet = soli.executeQuery();){
            while (resultSet.next()){
                Ninja.add(resultSet.getInt("ID_Ninja")+
                        "-"+ resultSet.getString("Nombre")+
                        "-"+ resultSet.getString("Rango")+
                        "-"+ resultSet.getString("Aldea"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Ninja;
    }
}
