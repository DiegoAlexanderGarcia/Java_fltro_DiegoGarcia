package org.konoha.controller;

import model.DAO.NinjaDAO;
import model.Ninja;
import view.NinjaView;

import java.sql.SQLException;
import java.util.List;

public class NinjaController {
    private NinjaDAO ninjaDAO;
    private NinjaView ninjaView;

    public void ViewNinja() throws SQLException {
        List<Ninja> Ninja = NinjaDAO.listarNinjas();
        NinjaView.NinjaView(Ninja);
    }
}
