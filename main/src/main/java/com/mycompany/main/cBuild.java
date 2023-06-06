/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Moje
 */

public class cBuild extends javax.swing.JFrame{

    /**
     * Creates new form cHome
     */
    private String usr;
    
                    
    public cBuild() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Crear Edificio");
    }
    
    public void setUsr(String usr){
        this.usr = usr;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        res = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nCalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pTerr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cPis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cDep = new javax.swing.JTextField();
        elev = new javax.swing.JCheckBox();
        sData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        subPrice = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textElev = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cElev = new javax.swing.JButton();
        pDes = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        idBuild = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        err = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 30, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        res.setEditable(false);
        res.setBackground(new java.awt.Color(51, 51, 51));
        res.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edificio");

        nCalle.setBackground(new java.awt.Color(51, 51, 51));
        nCalle.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Calle");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio Terreno");

        pTerr.setBackground(new java.awt.Color(51, 51, 51));
        pTerr.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tamaño en m²");

        m2.setBackground(new java.awt.Color(51, 51, 51));
        m2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de Pisos");

        cPis.setBackground(new java.awt.Color(51, 51, 51));
        cPis.setForeground(new java.awt.Color(255, 255, 255));
        cPis.setToolTipText("");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de Departamentos");

        cDep.setBackground(new java.awt.Color(51, 51, 51));
        cDep.setForeground(new java.awt.Color(255, 255, 255));

        elev.setBackground(new java.awt.Color(18, 30, 49));
        elev.setForeground(new java.awt.Color(255, 255, 255));
        elev.setText("Ascensor");

        sData.setBackground(new java.awt.Color(136, 166, 193));
        sData.setForeground(new java.awt.Color(0, 0, 0));
        sData.setText("Guardar Datos");
        sData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDataActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio de la Vivienda");

        subPrice.setBackground(new java.awt.Color(136, 166, 193));
        subPrice.setForeground(new java.awt.Color(0, 0, 0));
        subPrice.setText("Tazar Casa");
        subPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subPriceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ascensor");

        textElev.setEditable(false);
        textElev.setBackground(new java.awt.Color(51, 51, 51));
        textElev.setForeground(new java.awt.Color(255, 255, 255));
        textElev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textElev.setActionCommand("<Not Set>");

        back.setBackground(new java.awt.Color(136, 166, 193));
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Regresar");
        back.setToolTipText("");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cElev.setBackground(new java.awt.Color(136, 166, 193));
        cElev.setForeground(new java.awt.Color(0, 0, 0));
        cElev.setText("Ir al piso");
        cElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cElevActionPerformed(evt);
            }
        });

        pDes.setBackground(new java.awt.Color(51, 51, 51));
        pDes.setForeground(new java.awt.Color(255, 255, 255));

        idBuild.setEditable(false);
        idBuild.setBackground(new java.awt.Color(51, 51, 51));
        idBuild.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        idBuild.setForeground(new java.awt.Color(255, 255, 255));
        idBuild.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id del edificio");

        err.setEditable(false);
        err.setBackground(new java.awt.Color(18, 30, 49));
        err.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        err.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(err)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addComponent(cElev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pDes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(sData))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idBuild))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(elev))
                                .addGap(25, 25, 25))
                            .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subPrice)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cDep, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cPis, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pTerr, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textElev))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pTerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(elev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sData)
                    .addComponent(subPrice)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBuild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cElev)
                    .addComponent(pDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addComponent(textElev, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public String irAPiso(int piso , int pisoActual) throws InterruptedException {
        String str = "";
        
        if (piso > pisoActual) {
            for (int i = pisoActual + 1; i <= piso; i++) {
                str = str +  i + "... ";
            }
        } else if (piso < pisoActual) {
            for (int i = pisoActual - 1; i >= piso; i--) {
                str = str +  i + "... ";
            }
        }
        pisoActual = piso;
        str = str + "  Llegaste al piso " + pisoActual;
        return str;
    }
    
    
    
    
    
    private void cElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cElevActionPerformed

        if(elev.isSelected()){
            try {

                String strS = irAPiso(Integer.parseInt(pDes.getText()),c);
                c = Integer.parseInt(pDes.getText());
                textElev.setText(strS);

            } catch (InterruptedException ex) {
                Logger.getLogger(cBuild.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            textElev.setText("El edificio no posee ascensor.");
        }
    }//GEN-LAST:event_cElevActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Welcome open = new Welcome();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
    public String getRes(){
        Build edf = new Build(Integer.parseInt(cPis.getText()),Integer.parseInt(cDep.getText()),elev.isSelected(),Double.valueOf(pTerr.getText()),Double.valueOf(m2.getText()),nCalle.getText());
        String r = edf.calcE(elev.isSelected()) + "$";
        return r;
    }
    
    private void subPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subPriceActionPerformed
        res.setText(getRes());
    }//GEN-LAST:event_subPriceActionPerformed

    private void sDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDataActionPerformed
        Build edf = new Build(Integer.parseInt(cPis.getText()),Integer.parseInt(cDep.getText()),elev.isSelected(),Double.valueOf(pTerr.getText()),Double.valueOf(m2.getText()),nCalle.getText());
        
        String[] columnasGeneradas = {"id"} ;
        try {
            // Establece la conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/regUsers", "root", "");

            // Prepara la sentencia INSERT INTO
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO buildReg (BuildId, Address, Price) VALUES (?, ?,?)", columnasGeneradas);
            stmt.setString(1, "0");
            stmt.setString(2, nCalle.getText());
            stmt.setString(3, edf.calcE(elev.isSelected())+ "");

            // Ejecuta la sentencia INSERT INTO
            stmt.executeUpdate();

            // Obtiene el ID del valor registrado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int idGenerado = rs.getInt(1);
                idBuild.setText(idGenerado + "");
            }

            // Cierra los recursos
            rs.close();
            stmt.close();
            conn.close();
            res.setText(getRes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sDataActionPerformed

    public void cBoard(){
        cDep.setText("");
        m2.setText("");
        cPis.setText("");
        nCalle.setText("");
        pTerr.setText("");
        elev.setSelected(false);
    }
                
    //Piso actual
    int c=0;
    
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
            java.util.logging.Logger.getLogger(cBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cBuild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField cDep;
    private javax.swing.JButton cElev;
    private javax.swing.JTextField cPis;
    private javax.swing.JCheckBox elev;
    private javax.swing.JTextField err;
    private javax.swing.JTextField idBuild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField nCalle;
    private javax.swing.JTextField pDes;
    private javax.swing.JTextField pTerr;
    private javax.swing.JTextField res;
    private javax.swing.JButton sData;
    private javax.swing.JButton subPrice;
    private javax.swing.JTextField textElev;
    // End of variables declaration//GEN-END:variables

    

    
}
