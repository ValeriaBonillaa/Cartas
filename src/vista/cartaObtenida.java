/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;

import java.sql.Statement;
import java.sql.SQLException;    
import java.sql.ResultSet;



import java.awt.Image;

import java.util.Random;


import java.net.URL;
import java.sql.Connection;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Conexion;
import modelo.cartaSeleccionada;


/**
 *
 * @author Dachapi
 */
public class cartaObtenida extends javax.swing.JFrame {
    //Declarando variables a emplear luego para almacenar en la base de datos
    cartaSeleccionada cS;
    
    /**
     * Creates new form cartaObtenida
     */
    public cartaObtenida(int user) {
        initComponents();
        Consulta();
        cS = null;
        almacenarData(user);
        this.toFront();
    }

    private cartaObtenida() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        lblMostrar = new javax.swing.JLabel();
        txtDisposicion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLDisposicion = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jLOficio = new javax.swing.JLabel();
        txtOficio = new javax.swing.JLabel();
        jLEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JLabel();
        jLArma = new javax.swing.JLabel();
        txtArma = new javax.swing.JLabel();
        jLRareza = new javax.swing.JLabel();
        txtRareza = new javax.swing.JLabel();
        jLAlmacenar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPFondo.add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 320, 560));

        txtDisposicion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        txtDisposicion.setForeground(new java.awt.Color(255, 255, 0));
        txtDisposicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDisposicion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDisposicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDisposicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDisposicionMouseExited(evt);
            }
        });
        jPFondo.add(txtDisposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 540, 60));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Personaje Obtenido");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, 660, 60));

        jLDisposicion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLDisposicion.setForeground(new java.awt.Color(255, 255, 0));
        jLDisposicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDisposicion.setText("Disposicion");
        jLDisposicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLDisposicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLDisposicionMouseExited(evt);
            }
        });
        jPFondo.add(jLDisposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 60));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 0));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setToolTipText("");
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNameMouseExited(evt);
            }
        });
        jPFondo.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 540, 60));

        jLOficio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLOficio.setForeground(new java.awt.Color(255, 255, 0));
        jLOficio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLOficio.setText("Oficio");
        jLOficio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLOficioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLOficioMouseExited(evt);
            }
        });
        jPFondo.add(jLOficio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 81, 60));

        txtOficio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        txtOficio.setForeground(new java.awt.Color(255, 255, 0));
        txtOficio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOficio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOficio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtOficioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtOficioMouseExited(evt);
            }
        });
        jPFondo.add(txtOficio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 540, 60));

        jLEspecie.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLEspecie.setForeground(new java.awt.Color(255, 255, 0));
        jLEspecie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEspecie.setText("Especie");
        jLEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLEspecieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLEspecieMouseExited(evt);
            }
        });
        jPFondo.add(jLEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 111, 60));

        txtEspecie.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        txtEspecie.setForeground(new java.awt.Color(255, 255, 0));
        txtEspecie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEspecie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEspecieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEspecieMouseExited(evt);
            }
        });
        jPFondo.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 540, 60));

        jLArma.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLArma.setForeground(new java.awt.Color(255, 255, 0));
        jLArma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLArma.setText("Arma");
        jLArma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLArmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLArmaMouseExited(evt);
            }
        });
        jPFondo.add(jLArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 111, 60));

        txtArma.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        txtArma.setForeground(new java.awt.Color(255, 255, 0));
        txtArma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtArma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtArma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtArmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtArmaMouseExited(evt);
            }
        });
        jPFondo.add(txtArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 540, 60));

        jLRareza.setBackground(new java.awt.Color(255, 255, 0));
        jLRareza.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLRareza.setForeground(new java.awt.Color(255, 255, 0));
        jLRareza.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLRareza.setText("Rareza");
        jLRareza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLRarezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLRarezaMouseExited(evt);
            }
        });
        jPFondo.add(jLRareza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 111, 99));

        txtRareza.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        txtRareza.setForeground(new java.awt.Color(255, 255, 0));
        txtRareza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRareza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRareza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRarezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRarezaMouseExited(evt);
            }
        });
        jPFondo.add(txtRareza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 150, 60));

        jLAlmacenar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLAlmacenar.setForeground(new java.awt.Color(255, 255, 0));
        jLAlmacenar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLAlmacenar.setText("Almacenar");
        jLAlmacenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAlmacenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAlmacenarMouseExited(evt);
            }
        });
        jPFondo.add(jLAlmacenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 480, 130, 35));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 159, 30));

        jLNombre.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 0));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre.setText("Nombre");
        jLNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLNombreMouseExited(evt);
            }
        });
        jPFondo.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 111, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/fondoCartas.png"))); // NOI18N
        jPFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Asignando acciones por movimiento
    private void jLNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNombreMouseEntered
        jLNombre.setForeground(Color.white);
    }//GEN-LAST:event_jLNombreMouseEntered

    private void jLNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNombreMouseExited
        jLNombre.setForeground(Color.yellow);
    }//GEN-LAST:event_jLNombreMouseExited

    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseEntered
        txtName.setForeground(Color.white);
    }//GEN-LAST:event_txtNameMouseEntered

    private void txtNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseExited
        txtName.setForeground(Color.yellow);
    }//GEN-LAST:event_txtNameMouseExited

    private void jLDisposicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDisposicionMouseEntered
        jLDisposicion.setForeground(Color.white);
    }//GEN-LAST:event_jLDisposicionMouseEntered

    private void jLDisposicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDisposicionMouseExited
        jLDisposicion.setForeground(Color.yellow);
    }//GEN-LAST:event_jLDisposicionMouseExited

    private void txtDisposicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDisposicionMouseEntered
        txtDisposicion.setForeground(Color.white);
    }//GEN-LAST:event_txtDisposicionMouseEntered

    private void txtDisposicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDisposicionMouseExited
        txtDisposicion.setForeground(Color.yellow);
    }//GEN-LAST:event_txtDisposicionMouseExited

    private void jLOficioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOficioMouseEntered
        jLOficio.setForeground(Color.white);
    }//GEN-LAST:event_jLOficioMouseEntered

    private void jLOficioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOficioMouseExited
        jLOficio.setForeground(Color.yellow);
    }//GEN-LAST:event_jLOficioMouseExited

    private void txtOficioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOficioMouseEntered
        txtOficio.setForeground(Color.white);
    }//GEN-LAST:event_txtOficioMouseEntered

    private void txtOficioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOficioMouseExited
        txtOficio.setForeground(Color.yellow);
    }//GEN-LAST:event_txtOficioMouseExited

    private void jLEspecieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEspecieMouseEntered
        jLEspecie.setForeground(Color.white);
    }//GEN-LAST:event_jLEspecieMouseEntered

    private void jLEspecieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEspecieMouseExited
        jLEspecie.setForeground(Color.yellow);
    }//GEN-LAST:event_jLEspecieMouseExited

    private void txtEspecieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecieMouseEntered
        txtEspecie.setForeground(Color.white);
    }//GEN-LAST:event_txtEspecieMouseEntered

    private void txtEspecieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecieMouseExited
        txtEspecie.setForeground(Color.yellow);
    }//GEN-LAST:event_txtEspecieMouseExited

    private void jLArmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLArmaMouseEntered
        jLArma.setForeground(Color.white);
    }//GEN-LAST:event_jLArmaMouseEntered

    private void jLArmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLArmaMouseExited
        jLArma.setForeground(Color.yellow);
    }//GEN-LAST:event_jLArmaMouseExited

    private void txtArmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArmaMouseEntered
        txtArma.setForeground(Color.white);
    }//GEN-LAST:event_txtArmaMouseEntered

    private void txtArmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArmaMouseExited
        txtArma.setForeground(Color.yellow);
    }//GEN-LAST:event_txtArmaMouseExited

    private void jLRarezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRarezaMouseEntered
        jLRareza.setForeground(Color.white);
    }//GEN-LAST:event_jLRarezaMouseEntered

    private void jLRarezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRarezaMouseExited
        jLRareza.setForeground(Color.yellow);
    }//GEN-LAST:event_jLRarezaMouseExited

    private void txtRarezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRarezaMouseEntered
        txtRareza.setForeground(Color.white);
    }//GEN-LAST:event_txtRarezaMouseEntered

    private void txtRarezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRarezaMouseExited
        txtRareza.setForeground(Color.yellow);
    }//GEN-LAST:event_txtRarezaMouseExited

    private void jLAlmacenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlmacenarMouseEntered
        jLAlmacenar.setForeground(Color.white);
    }//GEN-LAST:event_jLAlmacenarMouseEntered

    private void jLAlmacenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlmacenarMouseExited
        jLAlmacenar.setForeground(Color.yellow);
    }//GEN-LAST:event_jLAlmacenarMouseExited

    
    public void almacenarData(int user){
        cS = new cartaSeleccionada();
        
        cS.setN_Personaje(txtName.getText());
        cS.setDispocicion(txtDisposicion.getText());
        cS.setOficio(txtOficio.getText());
        cS.setEspecie(txtEspecie.getText());
        cS.setArma(txtArma.getText());
        cS.setRareza(txtRareza.getText());
        cS.setUsuario(user);
        
        try {

            Statement st = Conexion.getConexion().createStatement();
            
            String metodo = "Exec [dbo].[guardarCarta] '"+cS.getN_Personaje()+"', '"+cS.getDispocicion()+"', '"+cS.getOficio()
                    +"', '"+cS.getEspecie()+"', '"+cS.getArma()+"', '"+cS.getRareza()+"', "+cS.getUsuario();
            
            int elementosInsertados = st.executeUpdate(metodo);
            
            System.out.println(elementosInsertados);
 
        } catch (SQLServerException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Consulta(){
        
        int datoRamdon = 0;
        
        datoRamdon = (int)(Math.random() * 20+1);
        try {

            Statement st = Conexion.getConexion().createStatement();

            ResultSet rs = st.executeQuery("Select * from Registro_Personajes where Codigo = '" + datoRamdon +"'");

            while (rs.next()) {                
                
                this.txtName.setText(rs.getString(2));
                this.txtDisposicion.setText(rs.getString(3)); 
                this.txtOficio.setText(rs.getString(4));
                this.txtEspecie.setText(rs.getString(5));
                this.txtArma.setText(rs.getString(6));
                this.txtRareza.setText(rs.getString(7));
                
                mostrarImagen(rs.getString(8));
                
            }
            
 
        } catch (SQLServerException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cartaObtenida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrarImagen(String rs){

        Image imagen = null;
        try {
            URL url = new URL(rs);
            
            imagen = ImageIO.read(url);
        } catch (Exception e) {
            System.out.println("error: "+e.toString());
        }
        
        //Mostrar imagen
        
        Image newImage = imagen.getScaledInstance(lblMostrar.getWidth(), lblMostrar.getHeight(), imagen.SCALE_SMOOTH);
        
        lblMostrar.setIcon(new ImageIcon(newImage));
        
    }
        
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
            java.util.logging.Logger.getLogger(cartaObtenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cartaObtenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cartaObtenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cartaObtenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cartaObtenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLAlmacenar;
    private javax.swing.JLabel jLArma;
    private javax.swing.JLabel jLDisposicion;
    private javax.swing.JLabel jLEspecie;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLOficio;
    private javax.swing.JLabel jLRareza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel txtArma;
    private javax.swing.JLabel txtDisposicion;
    private javax.swing.JLabel txtEspecie;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtOficio;
    private javax.swing.JLabel txtRareza;
    // End of variables declaration//GEN-END:variables
}
