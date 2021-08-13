package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Promotion_Staff extends javax.swing.JPanel {
    
    private DefaultTableModel model;
    private String startDate, endDate;
    //generate random
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWUXYZ0123456789";
    String randomString="";
    int length =6;    
    Random rand= new Random();    
    char[] text= new char[length];

    String s;
    private ResultSet rs;
    PreparedStatement pst = null;
    
    public Promotion_Staff() {
        initComponents();
        init();
        enableTXT(false);
        updateTable();
        autoGenerateID();
    }
    
    private void init() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //generate ID
    public void autoGenerateID() {
        try {
            Statement stmt = DatabaseConnection.getInstance().getConnection().createStatement();
            rs = stmt.executeQuery("SELECT Max(promoID) FROM promotion");
            rs.next();           
            if(rs.getString("Max(promoID)") == null) {
                txtPromoID.setText("PRO-00001");
            } else {
                long id = Long.parseLong(rs.getString("Max(promoID)").substring(4, rs.getString("Max(promoID)").length()));
                id++;
                txtPromoID.setText("PRO-" + String.format("%05d", id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Message: " + e, "Error", JOptionPane.ERROR_MESSAGE);
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
        txtPromoID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        txtPromoName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPromotion = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblPromoCode = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPercent = new javax.swing.JTextField();
        txtPromoQty = new javax.swing.JTextField();
        dtpPromoStartDate = new org.jdesktop.swingx.JXDatePicker();
        dtpPromoEndDate = new org.jdesktop.swingx.JXDatePicker();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnPromoStatus = new javax.swing.JToggleButton();

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Promotion Module");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel1.setText("To");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel2.setText("Promotion Name:");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel3.setText("Promotion Description:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel4.setText("Promotion Qty:");

        txtPromoID.setEditable(false);
        txtPromoID.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPromoName.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel7.setText("Promotion ID:");

        tblPromotion.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        tblPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Code", "Quantity", "Percent", "Description", "Start Date", "End Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPromotion.setRowHeight(26);
        tblPromotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPromotionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPromotion);

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel8.setText("Promotion Code:");

        lblPromoCode.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        lblPromoCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnGenerate.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel5.setText("Promotion Date:");

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel9.setText("Promotion Percent:");

        txtPercent.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        txtPromoQty.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        dtpPromoStartDate.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        dtpPromoStartDate.setBackground(Color.BLACK);

        dtpPromoEndDate.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        dtpPromoStartDate.setBackground(Color.BLACK);

        btnUpdate.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel10.setText("Promotion Status:");

        btnPromoStatus.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        btnPromoStatus.setText("Not Available");
        btnPromoStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromoStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addGap(54, 54, 54))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(60, 60, 60)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPromoQty, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPromoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPromoID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPromoName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(dtpPromoStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                        .addComponent(dtpPromoEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(112, 112, 112)
                                            .addComponent(jLabel1)))
                                    .addComponent(btnPromoStatus))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7))
                            .addComponent(txtPromoID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPromoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8))
                            .addComponent(lblPromoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerate))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPromoQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dtpPromoStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(dtpPromoEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btnPromoStatus))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        dtpPromoStartDate.setBackground(Color.BLACK);
        dtpPromoStartDate.setBackground(Color.BLACK);
    }// </editor-fold>//GEN-END:initComponents

    //Add 
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            if(btnAdd.getText().equals("Add")) {
                btnAdd.setText("Save");
                autoGenerateID();
                enableTXT(true);
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);
                clearTXT();
            } else {
                if(txtPromoName.getText().isEmpty() || lblPromoCode.getText().isEmpty() || txtPromoQty.getText().isEmpty() || txtPercent.getText().isEmpty()
                    || txtDescription.getText().isEmpty()) { //|| startDate.isEmpty() || endDate.isEmpty()
                    JOptionPane.showMessageDialog(this, "Please Fill in all the things!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    btnAdd.setText("Add");
                    System.out.println("Yeah");
                    addRecord();
                    updateTable();
//                    JOptionPane.showMessageDialog(this, "Successfully Added");
                    clearTXT();
                    enableTXT(false);
                    autoGenerateID();
                    btnUpdate.setEnabled(true);
                    btnDelete.setEnabled(true);
                }  
            }
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to generate a promo code?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
 
        if(response == JOptionPane.YES_OPTION) {
            for (int i = 0; i < length; i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
            }
            for(int i=0; i < text.length; i++){
                randomString +=text[i];
            }

            lblPromoCode.setText(randomString);

            btnGenerate.setEnabled(false);
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          try {
            if(btnUpdate.getText().equals("Update")) {
                btnUpdate.setText("Save");
                enableTXT(true);
                txtPromoID.setEnabled(false);
                btnAdd.setEnabled(false);
                btnDelete.setEnabled(false);
            } else {
                btnUpdate.setText("Update");
                updateRecord();
                updateTable();
                enableTXT(false);
                btnAdd.setEnabled(true);
                btnDelete.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Message: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

      
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int responde = JOptionPane.showConfirmDialog(this, "Do you really want to delete this record?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(responde == JOptionPane.YES_OPTION) {
                deleteRecord();
            } else {
                updateTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Message: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_btnDeleteActionPerformed
 
      //add data to database
    private void addRecord() {
        try{
            if(dtpPromoStartDate.getDate() != null ){
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                startDate = dateformat.format(dtpPromoStartDate.getDate());
                endDate = dateformat.format(dtpPromoEndDate.getDate());
            }
        
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into promotion(promoID, promoName, promoCode, promoQty, promoPercent, promoDesc, promoStartDate,promoEndDate,promoStatus) values(?,?,?,?,?,?,?,?,?)");
           
            pst.setString(1, txtPromoID.getText());
            pst.setString(2, txtPromoName.getText());
            pst.setString(3, lblPromoCode.getText());
            pst.setString(4, txtPromoQty.getText());
            pst.setString(5, txtPercent.getText());
            pst.setString(6, txtDescription.getText());
            
            pst.setString(7, startDate);
            pst.setString(8, endDate);
          
            if(btnPromoStatus.getText().equals("Available")){
                pst.setInt(9, 1);
            } else {
                pst.setInt(9, 0);
            } 
            pst.executeUpdate();
//            DatabaseConnection.getInstance().getConnection().close();
            JOptionPane.showMessageDialog(null, "Data Inserted");
            autoGenerateID();
        } catch(Exception ex){
            System.out.println("Error Message: " + ex);
        }
    }
      private void updateRecord() {
        try {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            startDate = dateformat.format(dtpPromoStartDate.getDate());
            endDate = dateformat.format(dtpPromoEndDate.getDate());
            
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE promotion SET promoName = ?, promoCode = ?, promoQty = ?, promoPercent = ?, promoDesc = ?, promoStartDate = ?, promoEndDate = ?, promoStatus = ? WHERE promoID = '" + txtPromoID.getText() + "'");

            pst.setString(1, txtPromoName.getText());
            pst.setString(2, lblPromoCode.getText());
            pst.setString(3, txtPromoQty.getText());
            pst.setString(4, txtPercent.getText());
            pst.setString(5, txtDescription.getText());
            pst.setString(6, startDate);
            pst.setString(7, endDate);   
            if(btnPromoStatus.getText().equals("Available")){
                pst.setInt(8, 1);
            } else {
                pst.setInt(8, 0);
            } 
            pst.executeUpdate();

            updateTable();
            clearTXT();
            autoGenerateID();
            JOptionPane.showMessageDialog(this, "Edit Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
           // JOptionPane.showMessageDialog(this, "Error Message: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void deleteRecord() {
        try {
            int row = tblPromotion.getSelectedRow();
            model = (DefaultTableModel) tblPromotion.getModel();
            String value = model.getValueAt(row, 0).toString();
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("DELETE FROM promotion WHERE promoID = '" + value + "'");
            pst.executeUpdate();
            updateTable();
            clearTXT();
            autoGenerateID();
            JOptionPane.showMessageDialog(this, "Delete Record Successfully!", "Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Message: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void updateTable() {
        try {
            model = (DefaultTableModel) tblPromotion.getModel();
            model.setRowCount(0);
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement("Select * From promotion;", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String promoID = rs.getString(1);
                String promoName = rs.getString(2);
                String promoCode = rs.getString(3);
                String promoQty = rs.getString(4);
                String promoPercent = rs.getString(5);
                String promoDesc = rs.getString(6);
                String promoStartDate = rs.getString(7);
                String promoEndDate = rs.getString(8);
                boolean promoStatus = rs.getInt(9) == 1;

                model.addRow(new Object[]{promoID, promoName, promoCode, promoQty, promoPercent, promoDesc, promoStartDate,promoEndDate,promoStatus});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearTXT();
        autoGenerateID();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblPromotionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPromotionMouseClicked
        try {
            int i = tblPromotion.getSelectedRow();
            model = (DefaultTableModel) tblPromotion.getModel();
            txtPromoID.setText(model.getValueAt(i, 0).toString());
            txtPromoName.setText(model.getValueAt(i, 1).toString());
            lblPromoCode.setText(model.getValueAt(i, 2).toString());
            txtPromoQty.setText(model.getValueAt(i, 3).toString());
            txtPercent.setText(model.getValueAt(i, 4).toString());
            txtDescription.setText(model.getValueAt(i, 5).toString());

            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 6));
            dtpPromoStartDate.setDate(date1);
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 7));
            dtpPromoEndDate.setDate(date2);
            
             boolean status = (boolean) model.getValueAt(i, 8);
            if(status == true) {
                btnPromoStatus.setText("Available");
            } else {
                btnPromoStatus.setText("Not Available");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error Message: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_tblPromotionMouseClicked

    private void btnPromoStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromoStatusActionPerformed
        if(btnPromoStatus.isSelected()) {
            btnPromoStatus.setText("Available");
        } else {
            btnPromoStatus.setText("Not Available");
        }
    }//GEN-LAST:event_btnPromoStatusActionPerformed
   
   
    private void clearTXT(){
      //  txtPromoID.setText("");
        txtPromoName.setText("");
        lblPromoCode.setText("");
        txtPromoQty.setText("");
        txtPercent.setText("");
        txtDescription.setText("");
        dtpPromoStartDate.getEditor().setValue(null);
        dtpPromoEndDate.getEditor().setValue(null);
        btnPromoStatus.setText("");
      
    }
      
    private void enableTXT(boolean blnEnable){
        txtPromoID.setEnabled(blnEnable);
        txtPromoName.setEnabled(blnEnable);
        lblPromoCode.setEnabled(blnEnable);
        txtPromoQty.setEnabled(blnEnable);
        txtPercent.setEnabled(blnEnable);
        txtDescription.setEnabled(blnEnable);
        dtpPromoStartDate.setEnabled(blnEnable);
        dtpPromoEndDate.setEnabled(blnEnable);
        btnGenerate.setEnabled(blnEnable);
        btnPromoStatus.setEnabled(blnEnable);
      
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JToggleButton btnPromoStatus;
    private javax.swing.JButton btnUpdate;
    private org.jdesktop.swingx.JXDatePicker dtpPromoEndDate;
    private org.jdesktop.swingx.JXDatePicker dtpPromoStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPromoCode;
    private javax.swing.JTable tblPromotion;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPercent;
    private javax.swing.JTextField txtPromoID;
    private javax.swing.JTextField txtPromoName;
    private javax.swing.JTextField txtPromoQty;
    // End of variables declaration//GEN-END:variables
}
