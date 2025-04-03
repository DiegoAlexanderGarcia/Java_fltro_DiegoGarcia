package org.konoha.model.DAO;

import org.konoha.DatabaseConection.DatabaseConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MisionDAO {
    public List<String> listarMisiones() throws SQLException {
        String sql = "SELECT * FROM Misiones";
        List<String> lista = new ArrayList<>();
        try (
                Connection connection = DatabaseConection.connection();
                PreparedStatement soli = connection.prepareStatement(sql);
                ResultSet resultSet = soli.executeQuery();){
            while (resultSet.next()) {
                lista.add(resultSet.getString("id")+
                        "-"+ resultSet.getString("mision")+
                        "-"+ resultSet.getString("aldea"));
            }
        }
        return lista;
    }
}
