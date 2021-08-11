/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Image;
import java.io.*;
import javafx.stage.FileChooser;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Acer
 */
public class Product_Details extends javax.swing.JPanel {

    /**
     * Creates new form Product_Details
     */
    public Product_Details() {
        initComponents();
        init();
    }

        private void init() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProdId = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        txtProdStk = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtProddDes = new javax.swing.JTextArea();
        lblProdImg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbProdTyp = new javax.swing.JComboBox<>();
        btnSeachTyp = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setText("Product Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(502, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(445, 445, 445))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setText("Product ID :");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel2.setText("Product Name :");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3.setText("Product Price :");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel4.setText("Product Name :");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel5.setText("Product Type :");

        txtProdId.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        txtProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdIdActionPerformed(evt);
            }
        });

        txtProdName.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N

        txtProdPrice.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N

        txtProdStk.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N

        txtProddDes.setColumns(20);
        txtProddDes.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        txtProddDes.setRows(5);
        jScrollPane4.setViewportView(txtProddDes);

        lblProdImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProdImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdImgMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel7.setText("Product Description :");

        cmbProdTyp.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        cmbProdTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSeachTyp.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnSeachTyp.setText("Search Type");
        btnSeachTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachTypActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(460, 460, 460))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProdPrice)
                                    .addComponent(txtProdStk)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbProdTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnSeachTyp)
                .addGap(34, 34, 34)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtProdStk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProdTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblProdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeachTyp)
                    .addComponent(btnAdd))
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon prodImg = new ImageIcon(ImagePath);
        Image img = prodImg.getImage();
        Image newImg = img.getScaledInstance(lblProdImg.getWidth(), lblProdImg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void txtProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdIdActionPerformed

    // Display Product Type panel
    Product_Type srcTyp = new Product_Type();
    
    private void btnSeachTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachTypActionPerformed
        srcTyp.setVisible(true);
    }//GEN-LAST:event_btnSeachTypActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void lblProdImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdImgMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File sltFile = fileChooser.getSelectedFile();
            String path = sltFile.getAbsolutePath();
            lblProdImg.setIcon(ResizeImage(path));
            String a = path;
        }else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_lblProdImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSeachTyp;
    private javax.swing.JComboBox<String> cmbProdTyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblProdImg;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdStk;
    private javax.swing.JTextArea txtProddDes;
    // End of variables declaration//GEN-END:variables
}
