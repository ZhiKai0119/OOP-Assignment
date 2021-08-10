package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import connection.DatabaseConnection;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Promotion_Staff extends javax.swing.JPanel {

    private DefaultTableModel model;
    
      //generate
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

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Promotion Module");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel1.setText("To");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel2.setText("Promotion Name:");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel3.setText("Promotion Description:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel4.setText("Promotion Qty:");

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

        tblPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Promotion ID", "Promotion Name", "PromoStartDate", "PromoEndDate", "Description", "Promo Code", "Promo Picture"
            }
        ));
        jScrollPane2.setViewportView(tblPromotion);

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel8.setText("Promotion Code:");

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

        dtpPromoStartDate.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        dtpPromoStartDate.setBackground(Color.BLACK);

        dtpPromoEndDate.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        dtpPromoStartDate.setBackground(Color.BLACK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPromoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtPromoName, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPromoID, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtpPromoEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtpPromoStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(275, 275, 275)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(296, 296, 296)
                    .addComponent(txtPromoQty, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(715, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dtpPromoEndDate, dtpPromoStartDate, jScrollPane1, txtPercent, txtPromoID, txtPromoName, txtPromoQty});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPromoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPromoName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPromoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnGenerate))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(dtpPromoStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(dtpPromoEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(68, 68, 68)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(283, 283, 283)
                    .addComponent(txtPromoQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );

        dtpPromoStartDate.setBackground(Color.BLACK);
        dtpPromoStartDate.setBackground(Color.BLACK);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   /*  if(txtPromoID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill in the Promotion ID!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if(txtPromoID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill in the Promotion Name!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }*/
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
            for (int i = 0; i < length; i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for(int i=0; i < text.length; i++){
            randomString +=text[i];
        }
        
        lblPromoCode.setText(randomString);
        
        btnGenerate.setEnabled(false);
    }//GEN-LAST:event_btnGenerateActionPerformed


//     public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        /*try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>*/
//        
//        /*try {
//            //FlatGruvboxDarkMediumIJTheme.setup();
//            FlatGruvboxDarkHardIJTheme.setup();
//            //FlatArcDarkContrastIJTheme.setup();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Promotion_Staff().setVisible(true);
//            }
//        });
//    }

     
     //add data to database
   /*  private void addRecord() {
        try{
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into delivery_company(companyID, companyName, Address, Manager, ContactNo, Logo, Status) values(?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(s));
            pst.setString(1, txtPromoID.getText());
            pst.setString(2, txtPromoName.getText());
            pst.setString(3, lblPromoCode.getText());
            pst.setString(4, txtPromoQty.getText());
            pst.setString(5, txtPercent.getText());
            pst.setString(6, txtDescription.getText());
          // pst.setDate(7, PromoStartDate.getCalendar());
           // pst.setDate(8, PromoEndDate.getDate());
            pst.setBlob(9, is);
            pst.setInt(10, 1);
            pst.executeUpdate();
//            DatabaseConnection.getInstance().getConnection().close();
            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch(Exception ex){
            System.out.println("Error Message: " + ex);
        }
    */
     
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
                //int contactNo = rs.getInt(5);
                //Icon image = null;
               // if (rs.getObject(8) != null) {
                 //   image = scaledImage(new ImageIcon(rs.getBytes(6)));
                //}
               // boolean status = rs.getInt(7) == 1;
               // model.addRow(new Object[]{promotion.getRowCount() + 1,promoID, promoName, promoCode, promoQty, promoPercent, promoDesc, promoStartDate,promoEndDate});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      private void clearTXT(){
        txtPromoID.setText("");
        txtPromoName.setText("");
        lblPromoCode.setText("");
        txtPromoQty.setText("");
        txtPercent.setText("");
        txtDescription.setText("");
        dtpPromoStartDate.getEditor().setValue(null);
        dtpPromoEndDate.getEditor().setValue(null);
      
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
      
      }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGenerate;
    private org.jdesktop.swingx.JXDatePicker dtpPromoEndDate;
    private org.jdesktop.swingx.JXDatePicker dtpPromoStartDate;
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
