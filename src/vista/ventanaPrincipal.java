/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import controller.ControllerBuenoMalo;
import controller.ControllerMalos;
import controller.ControllerRepetidas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import modelo.Conexion;

import modelo.desktopImage;

/**
 *
 * @author 50688
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    int userList;

    public int getUserList() {
        return userList;
    }

    public void setUserList(int userList) {
        this.userList = userList;
    }

    /**
     * Creates new form ventanaPrincipal
     * @param user
     */
    public ventanaPrincipal(int user) {
        initComponents();
        this.setTitle("Menu Principal");
        setLocationRelativeTo(null); //poner la pantalla en el centro
        this.setUserList(user);
        desktopPane.setBorder(new desktopImage());
        this.setExtendedState(MAXIMIZED_BOTH); //maximizar
        
        setIconImage (new ImageIcon(getClass().getResource("/complementos/icono.png")).getImage());
        
    }

    private ventanaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jRepetidas = new javax.swing.JMenu();
        jBuenos = new javax.swing.JMenuItem();
        jMalos = new javax.swing.JMenuItem();
        jTodos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnCartas = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jRepetidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/album-de-fotos.png"))); // NOI18N
        jRepetidas.setMnemonic('e');
        jRepetidas.setText("Menú de Albumes");
        jRepetidas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jBuenos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jBuenos.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jBuenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/estrella-fugaz.png"))); // NOI18N
        jBuenos.setText("Lista de personajes buenos");
        jBuenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuenosActionPerformed(evt);
            }
        });
        jRepetidas.add(jBuenos);

        jMalos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMalos.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jMalos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/estrella-de-la-muerte.png"))); // NOI18N
        jMalos.setText("Lista de personajes malos");
        jMalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalosActionPerformed(evt);
            }
        });
        jRepetidas.add(jMalos);

        jTodos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jTodos.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/sable-de-luz.png"))); // NOI18N
        jTodos.setText("Lista de todos los personajes");
        jTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTodosActionPerformed(evt);
            }
        });
        jRepetidas.add(jTodos);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/duplicar.png"))); // NOI18N
        jMenuItem1.setText("Postales repetidas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jRepetidas.add(jMenuItem1);

        menuBar.add(jRepetidas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/juego-de-cartas.png"))); // NOI18N
        jMenu1.setText("Cartas");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        btnCartas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCartas.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        btnCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/red-social (1).png"))); // NOI18N
        btnCartas.setMnemonic('d');
        btnCartas.setText("Obtener Sobre");
        btnCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartasActionPerformed(evt);
            }
        });
        jMenu1.add(btnCartas);

        menuBar.add(jMenu1);

        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/salida.png"))); // NOI18N
        jSalir.setText("Salir");
        jSalir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });
        menuBar.add(jSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(WIDTH);
    }//GEN-LAST:event_jSalirMouseClicked

    private void btnCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartasActionPerformed
        
        if (fechaDif(conseguirFecha(this.getUserList()))) {
            cartaObtenida carta1 = new cartaObtenida(this.getUserList());
            cartaObtenida carta2 = new cartaObtenida(this.getUserList());
            cartaObtenida carta3 = new cartaObtenida(this.getUserList());
            System.out.println("Procediendo a mostrar cartas");
            
            carta1.setVisible(true);
            carta2.setVisible(true);
            carta3.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "¡Comunicado! \n Manual de uso: \n Solo puedes abrir un sobre de cartas al dia");
        }
    }//GEN-LAST:event_btnCartasActionPerformed

    //Metodos para conseguir las diferencias en fechas
    //Metodo que verifica si la diferencia de fechas es mayor a 24 horas o 1 dia
    public boolean fechaDif(String fecha){
        LocalDate fechaActual = LocalDate.now();
        
        String dato = null;
        
        if (fecha == null ? dato == null : fecha.equals(dato)) {
            System.out.println("La fecha es mayor");
            return true;
        }
        String [] lF = fecha.split("-");

        int anno = Integer.parseInt(lF[0]);
        int mes = Integer.parseInt(lF[1]);
        int dia = Integer.parseInt(lF[2]);
        
        LocalDate fechaVieja = LocalDate.of(anno,Month.of(mes),dia);
        //System.out.println(fechaVieja);

        if (fechaActual.compareTo(fechaVieja) > 0 ) {
            System.out.println("La fecha es mayor");
            return true;
        }else{
            System.out.println("no puede ingresar al sistema");
            return false;
        }
    }
    //Metodo que retorna la fecha de la ultima carta conseguida por un usuario
    public String conseguirFecha(int i){
        String fecha = "";

        try {

            Statement st = Conexion.getConexion().createStatement();
            
            String consulta = "Select MAX([Fecha_Obtencion]) from [dbo].[RegistroCartas] as rC "
                    + "inner join [dbo].[usuarios_Cartas] as uS on uS.Codigo_Card = rC.Codigo_C "
                    + "inner join [dbo].[usuarios] as u on u.Codigo_Usuarios = uS.Codigo_U "
                    + "where "+i+" = u.Codigo_Usuarios";

            ResultSet rs = st.executeQuery(consulta);
            
            while (rs.next()) {                
                fecha = rs.getString(1);
            }
            
            System.out.println(fecha);
            
        } catch (SQLServerException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }
    private void jBuenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuenosActionPerformed

        frmListaBuenos obj = new frmListaBuenos();
        desktopPane.add(obj);
        
        ControllerMalos con = new ControllerMalos(obj);
        con.inicioBueno(this.getUserList());
        obj.toFront();
        obj.setLocation(desktopPane.getWidth() / 2 - obj.getWidth() / 2, desktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
     
    }//GEN-LAST:event_jBuenosActionPerformed

    private void jMalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalosActionPerformed
        
        frmListaMalos obj = new frmListaMalos();
        desktopPane.add(obj);
        
        ControllerMalos con = new ControllerMalos(obj);
        con.inicioMalo(this.getUserList());
        obj.toFront();
        obj.setLocation(desktopPane.getWidth() / 2 - obj.getWidth() / 2, desktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
        
    }//GEN-LAST:event_jMalosActionPerformed

    private void jTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTodosActionPerformed

        frmListaBuenoMalo obj = new frmListaBuenoMalo ();
        desktopPane.add(obj);
        
        ControllerBuenoMalo con = new ControllerBuenoMalo(obj);
        con.inicio(this.getUserList());
        obj.toFront();// se ponga al frente
        obj.setLocation(desktopPane.getWidth() / 2 - obj.getWidth() / 2, desktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
        
    }//GEN-LAST:event_jTodosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmRepetidas obj = new frmRepetidas ();
        desktopPane.add(obj);
        
        ControllerRepetidas con = new ControllerRepetidas(obj);
        con.inicio(this.getUserList());
        obj.toFront();// se ponga al frente
        obj.setLocation(desktopPane.getWidth() / 2 - obj.getWidth() / 2, desktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCartas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jBuenos;
    private javax.swing.JMenuItem jMalos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jRepetidas;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenuItem jTodos;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}