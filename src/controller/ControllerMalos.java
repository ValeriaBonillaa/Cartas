/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import modelo.MaloDAO;
import vista.frmListaBuenos;
import vista.frmListaMalos;

/**
 *
 * @author vboni
 */
public class ControllerMalos {

    frmListaMalos vistaLista = new frmListaMalos();
    frmListaBuenos vistaLista1 = new frmListaBuenos();
    MaloDAO dao = new MaloDAO();

    public ControllerMalos(frmListaMalos frm) {
        this.vistaLista = frm;
    }
    public ControllerMalos(frmListaBuenos frm) {
        this.vistaLista1 = frm;
    }

    public void filtrarTablaPorNombre(JTable table, String filtro,int user) {
        dao.filtrarTablaPorNombre(table, filtro, user);
    }

    public void inicioMalo(int user) {
        filtrarTablaPorNombre(vistaLista.tblMalos, "", user);
    }
     public void filtrarTablaPorNombre1(JTable table, String filtro, int user) {
        dao.filtrarTablaPorNombre1(table, filtro, user);
    }

    public void inicioBueno(int user) {
        filtrarTablaPorNombre1(vistaLista1.tblBuenos, "", user);
    }
}
