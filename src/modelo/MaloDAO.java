/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vboni
 */
public class MaloDAO {
    
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();
    private ListaMalo l;

    public ListaMalo getL() {
        return l;
    }

    public void setL(ListaMalo l) {
        this.l = l;
    }
    public ListaMalo ListaMalo(int user) {
        setL(new ListaMalo());
        
        String sql = "Select * from RegistroCartas as rC inner join usuarios_Cartas "
                + "as uS on uS.Codigo_Card = rC.Codigo_C inner join usuarios as"
                + " u on u.Codigo_Usuarios = uS.Codigo_U where  u.Codigo_Usuarios = "+user+" and rC.Disposición = 'Malo' "
                + "and rC.Repetido = 'No'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String personaje, disposicion, oficio, especie, arma, rareza;
                int codigo;
                codigo = Integer.parseInt(rs.getString("Codigo_C"));
                personaje = rs.getString("Personaje");
                disposicion = rs.getString("Disposición");
                oficio = rs.getString("Oficio");
                especie = rs.getString("Especie");
                arma = rs.getString("Arma");
                rareza = rs.getString("Rareza");
                this.l.agregarAlFinal(new Malo(codigo ,personaje, disposicion, oficio, especie, arma, rareza));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
       return l;
    }
        public ListaMalo listaBueno(int user) {
        setL(new ListaMalo());
        
        String sql = "Select * from RegistroCartas as rC inner join usuarios_Cartas "
                + "as uS on uS.Codigo_Card = rC.Codigo_C inner join usuarios as"
                + " u on u.Codigo_Usuarios = uS.Codigo_U where  u.Codigo_Usuarios = "+user+" and rC.Disposición = 'Bueno' "
                + "and rC.Repetido = 'No'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String personaje, disposicion, oficio, especie, arma, rareza;
                int codigo;
                codigo = Integer.parseInt(rs.getString("Codigo_C"));
                personaje = rs.getString("Personaje");
                disposicion = rs.getString("Disposición");
                oficio = rs.getString("Oficio");
                especie = rs.getString("Especie");
                arma = rs.getString("Arma");
                rareza = rs.getString("Rareza");
                this.l.agregarAlFinal(new Malo(codigo ,personaje, disposicion, oficio, especie, arma, rareza));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
       return l;
    }

      public void filtrarTablaPorNombre(JTable table, String filtro, int user) {
        this.l =this.ListaMalo(user);
        String[] titulos = {"CODIGO", "PERSONAJE", "DISPOSICIÓN", "OFICIO", "ESPECIE", "ARMA", "RAREZA"};
        String[] registros = new String[7];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < this.l.getTamano(); i++) {
            NodoMalo n = new NodoMalo();
            n.setPersonaje(this.l.retornar(i));
                registros[0] = String.valueOf(n.getPersonaje().getCodigo());
                registros[1] = n.getPersonaje().getPersonaje();
                registros[2] = n.getPersonaje().getDisposicion();
                registros[3] = n.getPersonaje().getOficio();
                registros[4] = n.getPersonaje().getEspecie();
                registros[5] = n.getPersonaje().getArma();
                registros[6] = n.getPersonaje().getRareza();
                modelo.addRow(registros);
        }
        table.setModel(modelo);
    }  
    public void filtrarTablaPorNombre1(JTable table, String filtro, int user) {
        this.l =this.listaBueno(user);
        String[] titulos = {"CODIGO", "PERSONAJE", "DISPOSICIÓN", "OFICIO", "ESPECIE", "ARMA", "RAREZA"};
        String[] registros = new String[7];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < this.l.getTamano(); i++) {
            NodoMalo n = new NodoMalo();
            n.setPersonaje(this.l.retornar(i));
                registros[0] = String.valueOf(n.getPersonaje().getCodigo());
                registros[1] = n.getPersonaje().getPersonaje();
                registros[2] = n.getPersonaje().getDisposicion();
                registros[3] = n.getPersonaje().getOficio();
                registros[4] = n.getPersonaje().getEspecie();
                registros[5] = n.getPersonaje().getArma();
                registros[6] = n.getPersonaje().getRareza();
                modelo.addRow(registros);
        }
        table.setModel(modelo);
    }
}
