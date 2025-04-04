package org.konoha.controller;

import org.konoha.model.Ninja;
import org.konoha.model.DAO.NinjaDAO;
import org.konoha.view.NinjaView;


import java.sql.SQLException;
import java.util.List;

public class NinjaController {
    private NinjaDAO ninjaDAO;
    private NinjaView ninjaView;

    public void NinjaController() throws SQLException {
        this.ninjaDAO = new NinjaDAO();
        this.ninjaView = new NinjaView();
    }

    public void NinjaView() throws SQLException {
        List<String> ninjas = ninjaDAO.listarNinjas();
        ninjaView.mostrarNinjas(ninjas);
    }

}
