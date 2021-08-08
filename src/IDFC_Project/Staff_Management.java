package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Staff_Management extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/idfc";
    static final String USER = "root";
    static final String PASS = "Yizhimae_98";
    Connection sqlCon = null;


    public Staff_Management() {
        initComponents();
        this.setLocationRelativeTo(null);//CenterForm 
        showUserDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_User = new javax.swing.JTable();
        btnLogin = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();
        btnLogin2 = new javax.swing.JButton();
        btnLogin3 = new javax.swing.JButton();
        btnLogin4 = new javax.swing.JButton();
        btnLogin5 = new javax.swing.JButton();
        btnLogin6 = new javax.swing.JButton();
        btnLogin7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboQuestion = new javax.swing.JComboBox<>();
        cboRoles = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jTable_User.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jTable_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "First Name", "Last Name", "Contact No", "Email", "Gender", "Date of Birth", "Address", "Security Question", "Security Answer", "Password", "Roles"
            }
        ));
        jTable_User.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_User.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable_User);

        btnLogin.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin.setText("Update");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogin1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin1.setText("Last");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnLogin2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin2.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin2.setText("Delete");
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });

        btnLogin3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin3.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin3.setText("Edit");
        btnLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin3ActionPerformed(evt);
            }
        });

        btnLogin4.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin4.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin4.setText("Add");
        btnLogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin4ActionPerformed(evt);
            }
        });

        btnLogin5.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin5.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin5.setText("First");
        btnLogin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin5ActionPerformed(evt);
            }
        });

        btnLogin6.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLogin6.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin6.setText("Next");
        btnLogin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin6ActionPerformed(evt);
            }
        });

        btnLogin7.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnLogin7.setForeground(new java.awt.Color(203, 178, 106));
        btnLogin7.setText("Previous");
        btnLogin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 178, 106));
        jLabel1.setText("First Name:");

        jTextField1.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 178, 106));
        jLabel2.setText("User ID:");

        jTextField2.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 178, 106));
        jLabel3.setText("Last Name:");

        jTextField3.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 178, 106));
        jLabel4.setText("Contact No:");

        jTextField4.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 178, 106));
        jLabel5.setText("Email:");

        jTextField5.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 178, 106));
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 178, 106));
        jLabel7.setText("Address:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jRadioButton1.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jRadioButton1.setText("Male");

        jRadioButton2.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jRadioButton2.setText("Female");

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(203, 178, 106));
        jLabel8.setText("Security Answer:");

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 178, 106));
        jLabel9.setText("Security Question:");

        jTextField7.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 178, 106));
        jLabel10.setText("Password:");

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(203, 178, 106));
        jLabel11.setText("Confirm Password:");

        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(203, 178, 106));
        jLabel12.setText("Roles:");

        cboQuestion.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        cboQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorite Food", "Favorite Drinks", "Favorite Color", "Favorite Novel", "Favorite Actor", "Favorite Author", "Favorite Subject", "Favorite Pet" }));

        cboRoles.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        cboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Staff", "Delivery Staff" }));

        txtPassword.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordMouseExited(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        txtPassword1.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassword1FocusLost(evt);
            }
        });
        txtPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPassword1MouseExited(evt);
            }
        });
        txtPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassword1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7)
                                    .addComponent(txtPassword1)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogin5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLogin7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cboQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(15, 15, 15)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin2ActionPerformed

    private void btnLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin3ActionPerformed

    private void btnLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin4ActionPerformed

    private void btnLogin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin5ActionPerformed

    private void btnLogin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin6ActionPerformed

    private void btnLogin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin7ActionPerformed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost

    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited

    }//GEN-LAST:event_txtPasswordMouseExited

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassword1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1FocusLost

    private void txtPassword1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassword1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1MouseExited

    private void txtPassword1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1KeyReleased

    private void showUserDetails()
    {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement st = sqlCon.createStatement();
            String query = "SELECT * FROM userdetails";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String user_ID = String.valueOf(rs.getString("user_ID"));
                String firstName = String.valueOf(rs.getString("firstName"));
                String lastName = String.valueOf(rs.getString("lastName"));
                String contactNo = String.valueOf(rs.getString("contactNo"));
                String email = String.valueOf(rs.getString("email"));
                String gender = String.valueOf(rs.getString("gender"));            
                String dateOfBirth = String.valueOf(rs.getString("dateOfBirth"));
                String address = String.valueOf(rs.getString("address"));
                String securityQuestion = String.valueOf(rs.getString("securityQuestion"));
                String securityAnswer = String.valueOf(rs.getString("securityAnswer"));
                String password = String.valueOf(rs.getString("password"));
                String roles = String.valueOf(rs.getString("roles"));
                
                String tbData[] = {user_ID,firstName,lastName,contactNo,email,gender,dateOfBirth,address,securityQuestion,securityAnswer,password,roles};
                DefaultTableModel tblModel = (DefaultTableModel)jTable_User.getModel();
                
                tblModel.addRow(tbData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>*/
        
        try {
            //FlatGruvboxDarkMediumIJTheme.setup();
            FlatGruvboxDarkHardIJTheme.setup();
            //FlatArcDarkContrastIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnLogin2;
    private javax.swing.JButton btnLogin3;
    private javax.swing.JButton btnLogin4;
    private javax.swing.JButton btnLogin5;
    private javax.swing.JButton btnLogin6;
    private javax.swing.JButton btnLogin7;
    private javax.swing.JComboBox<String> cboQuestion;
    private javax.swing.JComboBox<String> cboRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_User;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    // End of variables declaration//GEN-END:variables
}
