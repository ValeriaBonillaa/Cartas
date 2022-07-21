/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Malo;
import modelo.NodoBuenoMalo;
import modelo.listaRepetidas;

/**
 *
 * @author 50688
 */
public class repetidasDAO {
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();
    
    private listaRepetidas l;

    public listaRepetidas getL() {
        return l;
    }

    public void setL(listaRepetidas l) {
        this.l = l;
    }
    public listaRepetidas Lista(int user) {
        setL(new listaRepetidas());
        
        String sql = "Select * from RegistroCartas as rC inner join usuarios_Cartas "
                + "as uS on uS.Codigo_Card = rC.Codigo_C inner join usuarios as"
                + " u on u.Codigo_Usuarios = uS.Codigo_U where u.Codigo_Usuarios = "+user+" "
                + "and rC.Repetido = 'si'";
        
     
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
                this.l.insertNode(new Malo(codigo ,personaje, disposicion, oficio, especie, arma, rareza));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
       return l;
    }

      
    public void filtrarTablaPorNombre(JTable table, String filtro, int user) {
        this.l =this.Lista(user);
        String[] titulos = {"CODIGO", "PERSONAJE", "DISPOSICIÓN", "OFICIO", "ESPECIE", "ARMA", "RAREZA"};
        String[] registros = new String[7];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < this.l.getTamanno(); i++) {
            NodoBuenoMalo n = new NodoBuenoMalo();
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
