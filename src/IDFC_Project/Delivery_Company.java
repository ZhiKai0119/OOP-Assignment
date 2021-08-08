/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Delivery_Company extends javax.swing.JPanel {

    private DefaultTableModel model;
    private ResultSet rs;
    String s;
    PreparedStatement pst = null;
    
    public Delivery_Company() {
        initComponents();
        init();
        customJTable();
    }
    
    private void init() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void customJTable() {
        tblDeliveryCompany.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
                super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
                if (column != 4) {
                    setHorizontalAlignment(JLabel.LEFT);
                }else {
                    setHorizontalAlignment(JLabel.LEFT);
                }
                return this;
            }
        });
        //  set editable to column 2 as jtextarea
        tblDeliveryCompany.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            private final JTextArea txt = new JTextArea();

            @Override
            public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
                txt.setText(o + "");
                JScrollPane sp = new JScrollPane(txt);
                sp.getVerticalScrollBar().setPreferredSize(new Dimension(5, 5));
                txt.setBackground(jtable.getSelectionBackground());
                txt.setWrapStyleWord(true);
                txt.setLineWrap(true);
                sp.setBorder(null);
                return sp;
            }

            @Override
            public Object getCellEditorValue() {
                return txt.getText();
            }
        });
        
        // set image view for column 4
        tblDeliveryCompany.getColumnModel().getColumn(6).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(table, o, selected, bln1, i, i1); 
                if(o == null) {
                    //no image
                    JLabel label = new JLabel("No Image");
                    label.setHorizontalAlignment(JLabel.CENTER);
                    label.setOpaque(selected);
                    label.setBackground(com.getBackground());
                    return label;
                } else {
                    if(o instanceof Icon) {
                        // has Image
                        Icon image = (ImageIcon) o;
                        JLabel label = new JLabel(image);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        label.setOpaque(selected);
                        label.setBackground(com.getBackground());
                    return label;
                    } else {
                        // image updating
                        JLabel label = new JLabel("Updating ...");
                        label.setHorizontalAlignment(JLabel.CENTER);
                        label.setOpaque(selected);
                        label.setBackground(com.getBackground());
                        return label;
                    }
                }
            }
            
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtComID = new javax.swing.JTextField();
        txtComName = new javax.swing.JTextField();
        txtManager = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtContactNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryCompany = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel1.setText("Company ID:");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel2.setText("Company Name:");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel3.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel4.setText("Manager:");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel5.setText("Company Logo:");

        lblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel7.setText("Contact No.:");

        txtComID.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        txtComName.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        txtManager.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtContactNo.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNoKeyPressed(evt);
            }
        });

        tblDeliveryCompany.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        tblDeliveryCompany.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Company ID", "Company Name", "Address", "Manager", "Contact No.", "Logo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDeliveryCompany.setRowHeight(60);
        jScrollPane2.setViewportView(tblDeliveryCompany);
        if (tblDeliveryCompany.getColumnModel().getColumnCount() > 0) {
            tblDeliveryCompany.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblDeliveryCompany.getColumnModel().getColumn(4).setResizable(false);
            tblDeliveryCompany.getColumnModel().getColumn(5).setResizable(false);
            tblDeliveryCompany.getColumnModel().getColumn(6).setResizable(false);
            tblDeliveryCompany.getColumnModel().getColumn(6).setPreferredWidth(120);
            tblDeliveryCompany.getColumnModel().getColumn(7).setPreferredWidth(18);
        }

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setText("Delivery Company");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
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

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtManager)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtComName)
                    .addComponent(txtComID)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtComID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtComName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

        //ResizeImage
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon logo = new ImageIcon(ImagePath);
        Image img = logo.getImage();
        Image newImg = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblLogo.setIcon(ResizeImage(path));
            s = path;
        }else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_lblLogoMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtComID.getText().isEmpty() || txtComName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtManager.getText().isEmpty()
                || txtContactNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill in the Text Field!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if(verifyDigit() == false) {
                JOptionPane.showMessageDialog(this, "Please Insert Number only at Contact Number Field!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if(lblLogo.getIcon() == null) {
                    JOptionPane.showMessageDialog(this, "Please Insert the Delivery Company Logo!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int response = JOptionPane.showConfirmDialog(this, "Do you want to inser a new record?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(response == JOptionPane.YES_OPTION) {
                        addRecord();
                        updateTable();
                        JOptionPane.showMessageDialog(this, "Successfully Added");
                        clearTXT();
                    } else {
                        JOptionPane.showMessageDialog(this, "Fail");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        String contactNo = txtContactNo.getText();
        int length = contactNo.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //check for length not more than 10 digit
            if(length < 10) {
                //editable true
                txtContactNo.setEditable(true);
            } else {
                //not editable if length more than 10 digit
                txtContactNo.setEditable(false);
            }
        } else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtContactNo.setEditable(true);
            } else {
                txtContactNo.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtContactNoKeyPressed

    private ImageIcon scaledImage(Icon image) {
        int h = image.getIconHeight();
        int toH = 65;
        if (h < toH) {
            toH = h;
        }
        return new ImageIcon(((ImageIcon) image).getImage().getScaledInstance(-1, toH, Image.SCALE_SMOOTH));
    }
    
    public void updateTable() {
        try {
            model = (DefaultTableModel) tblDeliveryCompany.getModel();
            model.setRowCount(0);
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement("Select * From delivery_company", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String companyID = rs.getString(1);
                String companyName = rs.getString(2);
                String address = rs.getString(3);
                String manager = rs.getString(4);
                int contactNo = rs.getInt(5);
                Icon image = null;
                if (rs.getObject(6) != null) {
                    image = scaledImage(new ImageIcon(rs.getBytes(6)));
                }
                boolean status = rs.getInt(7) == 1;
                model.addRow(new Object[]{tblDeliveryCompany.getRowCount() + 1,companyID, companyName, address, manager, contactNo, image, status});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void addRecord() {
        try{
            pst = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into delivery_company(companyID, companyName, Address, Manager, ContactNo, Logo, Status) values(?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(s));
            pst.setString(1, txtComID.getText());
            pst.setString(2, txtComName.getText());
            pst.setString(3, txtAddress.getText());
            pst.setString(4, txtManager.getText());
            pst.setString(5, txtContactNo.getText());
            pst.setBlob(6, is);
            pst.setInt(7, 1);
            pst.executeUpdate();
//            DatabaseConnection.getInstance().getConnection().close();
            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch(Exception ex){
            System.out.println("Error Message: " + ex);
        }
    }
    
    private boolean verifyDigit() {
        char digit = ' ';
        for(int i = 0; i < txtContactNo.getText().length(); i++) {
            digit = txtContactNo.getText().charAt(i);
        }
        if(Character.isDigit(digit)) {
            return true;
        } else {
            return false;
        }
    }
    
    private void clearTXT() {
        txtComID.setText("");
        txtComName.setText("");
        txtAddress.setText("");
        txtManager.setText("");
        txtContactNo.setText("");
        lblLogo.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tblDeliveryCompany;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtComID;
    private javax.swing.JTextField txtComName;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtManager;
    // End of variables declaration//GEN-END:variables
}
