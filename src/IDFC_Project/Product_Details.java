package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Image;
import java.io.*;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.stage.FileChooser;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Product_Details extends javax.swing.JPanel {

    private DefaultTableModel model;
    private ResultSet rs;
    String imgPath = null;
    PreparedStatement pst = null;
        
    public Product_Details() {
        initComponents();
        init();
        enableTxtField(false);
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
        cboProdTyp = new javax.swing.JComboBox<>();
        btnType = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setText("Product Details");

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

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setText("Product ID :");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel2.setText("Product Name :");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3.setText("Product Price :");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel4.setText("Product Stock :");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel5.setText("Product Type :");

        txtProdId.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N

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

        cboProdTyp.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        cboProdTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "drinks", "biscuit" }));

        btnType.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnType.setText("Type");
        btnType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTypeActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Price", "Stock", "Type", "Description", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        btnEdit.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnEdit.setText("Edit");

        btnDelete.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnDelete.setText("Delete");

        btnCancel.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
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
                        .addComponent(lblProdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProdStk)
                            .addComponent(txtProdPrice)
                            .addComponent(txtProdName)
                            .addComponent(txtProdId)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cboProdTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnType)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAdd)
                                    .addComponent(btnCancel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDelete)
                                    .addComponent(btnEdit))))
                        .addGap(18, 18, 18)
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
                            .addComponent(cboProdTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon prodImg = new ImageIcon(ImagePath);
        Image img = prodImg.getImage();
        Image newImg = img.getScaledInstance(lblProdImg.getWidth(), lblProdImg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    // Display Product Type panel

    
    private void btnTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTypeActionPerformed
        Product_Type srcTyp = new Product_Type();
        srcTyp.setVisible(true);
    }//GEN-LAST:event_btnTypeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if(btnAdd.getText().equals("Add")) {
                btnAdd.setText("Save");
                enableTxtField(true);
                btnEdit.setEnabled(false);
                btnDelete.setEnabled(false);
                clearTxtField();
            } else {
                btnAdd.setText("Add");
                Statement stmt = DatabaseConnection.getInstance().getConnection().createStatement();
                String sql = "SELECT * FROM product_details WHERE ProdId = '" + txtProdId.getText() + "'";

                rs = stmt.executeQuery(sql);

                if(rs.next()) {
                    JOptionPane.showMessageDialog(this, "This Prouct is already on the shelf.");
                } else {
                    if(txtProdId.getText().isEmpty() || txtProdName.getText().isEmpty() || txtProdPrice.getText().isEmpty() || txtProdStk.getText().isEmpty()
                        || txtProddDes.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please Fill in the Text Field!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if(lblProdImg.getIcon() == null) {
                            JOptionPane.showMessageDialog(this, "Please Insert the Specified Product Image!", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            int response = JOptionPane.showConfirmDialog(this, "Do you want to inser a new record?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if(response == JOptionPane.YES_OPTION) {
                                addProd();
                                updateTable();
                                //JOptionPane.showMessageDialog(this, "Successfully Added");
                                clearTxtField();
                                enableTxtField(false);
                                btnEdit.setEnabled(true);
                                btnDelete.setEnabled(true);
                            }
                        }
                    }                
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Message: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearTxtField();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int i = tblProduct.getSelectedRow();
        model = (DefaultTableModel) tblProduct.getModel();
        txtProdId.setText(model.getValueAt(i, 1).toString());
        txtProdName.setText(model.getValueAt(i, 2).toString());
        txtProdPrice.setText(model.getValueAt(i, 3).toString());
        txtProdStk.setText(model.getValueAt(i, 4).toString());
        String type = model.getValueAt(i,5).toString();
        txtProddDes.setText(model.getValueAt(i, 6).toString());
        ImageIcon image = (ImageIcon)model.getValueAt(i, 7);
        Image image2 = image.getImage().getScaledInstance(lblProdImg.getWidth(), lblProdImg.getHeight(), Image.SCALE_SMOOTH); 
        lblProdImg.setIcon(new ImageIcon(image2));
    }//GEN-LAST:event_tblProductMouseClicked

    private void addProd(){
        try {
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into product_details(ProdId, ProdName, ProdPrice, ProdStk, ProdTyp_Id, ProdDesc, ProdImg) values(?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(imgPath));
            pst.setString(1, txtProdId.getText());
            pst.setString(2, txtProdName.getText());
            pst.setString(3, txtProdPrice.getText());
            pst.setString(4, txtProdStk.getText());
            pst.setString(5, cboProdTyp.getSelectedItem().toString());
            pst.setString(6, txtProddDes.getText());
            pst.setBlob(7, is);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product added successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error Message: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateTable(){
        try {
            model = (DefaultTableModel) tblProduct.getModel();
            model.setRowCount(0);
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement("Select * From product_details;", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ProdId = rs.getString(1);
                String ProdName = rs.getString(2);
                Double ProdPrice = rs.getDouble(3);
                int ProdStk = rs.getInt(4);
                int ProdTyp_Id = rs.getInt(5);
                String ProdDesc = rs.getString(6);
                Icon ProdImg = null;
                if (rs.getObject(7) != null) {
                    ProdImg = scaledImage(new ImageIcon(rs.getBytes(7)));
                }
                model.addRow(new Object[]{ProdId, ProdName, ProdPrice, ProdStk, ProdTyp_Id, ProdDesc, ProdImg});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private ImageIcon scaledImage(Icon img) {
        int h = img.getIconHeight();
        int toH = 65;
        if (h < toH) {
            toH = h;
        }
        return new ImageIcon(((ImageIcon) img).getImage().getScaledInstance(-1, toH, Image.SCALE_SMOOTH));
    }

    private void enableTxtField(boolean boolEnable){
    txtProdId.setEnabled(boolEnable);
    txtProdName.setEnabled(boolEnable);   
    txtProdPrice.setEnabled(boolEnable);
    txtProdStk.setEnabled(boolEnable);
    cboProdTyp.setEnabled(boolEnable);
    txtProddDes.setEnabled(boolEnable);
    lblProdImg.setEnabled(boolEnable);
}

    private void clearTxtField(){
        txtProdId.setText("");
        txtProdName.setText("");
        txtProdPrice.setText("");
        txtProdStk.setText("");
        cboProdTyp.setSelectedIndex(0);
        txtProddDes.setText("");
        lblProdImg.setIcon(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnType;
    private javax.swing.JComboBox<String> cboProdTyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblProdImg;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdStk;
    private javax.swing.JTextArea txtProddDes;
    // End of variables declaration//GEN-END:variables

}
