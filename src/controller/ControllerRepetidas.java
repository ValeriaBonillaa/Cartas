/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTable;
import modelo.repetidasDAO;
import vista.frmRepetidas;


/**
 *
 * @author 50688
 */
public class ControllerRepetidas {
    frmRepetidas vistaLista = new frmRepetidas();
    repetidasDAO dao = new repetidasDAO();

    public ControllerRepetidas(frmRepetidas frm) {
        this.vistaLista = frm;
    }

    public void filtrarTablaPorNombre(JTable table, String filtro, int user) {
        dao.filtrarTablaPorNombre(table, filtro, user);
    }

    public void inicio(int user) {
        filtrarTablaPorNombre(vistaLista.tblRepetidas, "", user);
    }
}
