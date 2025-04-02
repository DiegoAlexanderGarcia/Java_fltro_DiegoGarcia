package org.konoha.model.DAO;

import model.MisionNinja;
import model.Ninja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static conection.DatabaseConection.connection;

public class MisionNinjaDAO {
    public List<MisionNinja>  listaMisionNinja(int idNinja) throws SQLException {
        List<MisionNinja> listaMisionNinja = new ArrayList<>();
        String sql = "select * from MisionNinja where ID_Ninja = ?";
        try (Connection con = connection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setint(1, IdNinja)
        }

    }
}
