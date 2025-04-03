package org.konoha.model.DAO;

import org.konoha.model.MisionNinja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.konoha.DatabaseConection.DatabaseConection.connection;

public class MisionNinjaDAO {
    public List<MisionNinja> listarMisionesNinja() throws SQLException {
        List<MisionNinja> listaMisionesNinja = new ArrayList<>();
        String sql = "SELECT * FROM MisionNinja";
        try {
            Connection connection = connection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                MisionNinja misionNinja = new MisionNinja();
                misionNinja.setIdMision(resultSet.getInt("idMision")+
                        "-"+ resultSet.getString("Fecha de inicio")+
                        "-"+ resultSet.getString("Fecha fin"));
            }
        }
    }

}
