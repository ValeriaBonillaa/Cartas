/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import vista.cartaObtenida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dachapi
 */
public class Proyecto1Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String bases = "";
        
        try {
            Statement sql = Conexion.getConexion().createStatement();
            
            String consulta = "SELECT name FROM [proyectoEstructurasDB].dbo.sysdatabases";
            
            ResultSet resultado = sql.executeQuery(consulta);
            
            while (resultado.next()) {                
                bases += resultado.getString(1)+"\n";
            }
            JOptionPane.showMessageDialog(null, bases);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
    }
    
}
