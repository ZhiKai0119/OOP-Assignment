/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class TrackingOrder extends javax.swing.JPanel {

    private double counter = 0;
    private double increase = 33.33;
    private String status = "";
    
    public TrackingOrder() {
        initComponents();
        inti();
        status();
    }

    public void inti() {
        try {
            DatabaseConnection.getInstance().getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void status() {
        switch (status) {
            case "processing":
                fill(counter);
                break;
            case "TakeOrder":
                fill(counter + 33.33);
                break;
            case "Shipped":
                fill(counter + 66.66);
            default:
                fill(counter + 100);
                break;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 103, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Processing.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 90));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 90));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 90));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Packaging.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Shipping.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 90, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Delivered.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 90, 90));

        bar.setForeground(new java.awt.Color(255, 153, 0));
        add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 1100, -1));

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setText("Tracking Your Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(459, 459, 459))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel5.setText("PROCESSING");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel7.setText("TAKE ORDER");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel8.setText("SHIPPED");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel9.setText("DELIVERED");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        fill(counter + increase);
    }//GEN-LAST:event_btnAddActionPerformed
    
    public void fill(double total) {
        while(counter <= total) {
            bar.setValue((int)counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            counter += 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JButton btnAdd;
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
    // End of variables declaration//GEN-END:variables
}
