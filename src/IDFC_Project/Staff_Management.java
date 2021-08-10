package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Staff_Management extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/idfc";
    static final String USER = "root";
    static final String PASS = "Yizhimae_98";
    Connection sqlCon = null;


    public Staff_Management() {
        initComponents();
        this.setLocationRelativeTo(null);//CenterForm 
        showUserDetails();
        groupButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_User = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jRadioButton_M = new javax.swing.JRadioButton();
        jRadioButton_F = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboQuestion = new javax.swing.JComboBox<>();
        cboRoles = new javax.swing.JComboBox<>();
        txtConPass = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        DateTimePicker_DOB = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jTable_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_User);

        btnSave.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(203, 178, 106));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnLast.setForeground(new java.awt.Color(203, 178, 106));
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(203, 178, 106));
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(203, 178, 106));
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(203, 178, 106));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(203, 178, 106));
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(203, 178, 106));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(203, 178, 106));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 178, 106));
        jLabel1.setText("First Name:");

        txtUserID.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 178, 106));
        jLabel2.setText("User ID:");

        txtFirstName.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 178, 106));
        jLabel3.setText("Last Name:");

        txtLastName.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 178, 106));
        jLabel4.setText("Contact No:");

        txtContactNo.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 178, 106));
        jLabel5.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 178, 106));
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 178, 106));
        jLabel7.setText("Address:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jRadioButton_M.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jRadioButton_M.setText("Male");

        jRadioButton_F.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jRadioButton_F.setText("Female");

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(203, 178, 106));
        jLabel8.setText("Security Answer:");

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 178, 106));
        jLabel9.setText("Security Question:");

        txtAnswer.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

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

        txtConPass.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtConPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConPassFocusLost(evt);
            }
        });
        txtConPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConPassMouseExited(evt);
            }
        });
        txtConPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConPassKeyReleased(evt);
            }
        });

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

        jLabel13.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(203, 178, 106));
        jLabel13.setText("Date of Birth:");

        DateTimePicker_DOB.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton_F)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton_M))))))
                            .addComponent(DateTimePicker_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(txtAnswer)
                                    .addComponent(txtPassword)
                                    .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_F)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jRadioButton_M)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cboQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DateTimePicker_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void txtConPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConPassFocusLost

    }//GEN-LAST:event_txtConPassFocusLost

    private void txtConPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConPassMouseExited

    }//GEN-LAST:event_txtConPassMouseExited

    private void txtConPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConPassKeyReleased

    }//GEN-LAST:event_txtConPassKeyReleased

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordMouseExited

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        btnSave.setEnabled(true);
        btnSave.setText("Update");
        setControlReadOnly(false);
        setComboBoxReadOnly(true);
        setButtonForEdit();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        btnSave.setEnabled(true);
        btnSave.setText("Update");
        setControlReadOnly(false);
        setComboBoxReadOnly(true);
        setButtonForEdit();
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        String user_ID = txtUserID.getText();
        
        if(btnDelete.getText() == "Delete"){
            int option = JOptionPane.showConfirmDialog(null,"Are you sure want to remove the current record?","Confirm Delete",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){     
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
                    PreparedStatement ps = sqlCon.prepareStatement("DELETE FROM userdetails(user_ID,firstName,lastName,email,gender,contactNo,dateOfBirth,address,securityQuestion,securityAnswer,password,roles) WHERE user_ID=?");
                    ps.setString(1,user_ID);
                    if(ps.executeUpdate() > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Record Deleted.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Fail to delete the record.");
                    }
                } catch (Exception e){
                    Logger.getLogger(Staff_Management.class.getName()).log(Level.SEVERE, null, e);
                }
            }       
    }
        else{
            btnSave.setText("Save");
            resetButtonForEdit();
            setControlReadOnly(true);
            setComboBoxReadOnly(false);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jTable_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UserMouseClicked
        setControlReadOnly(false);
        setComboBoxReadOnly(false);  
        try{
        int i = jTable_User.getSelectedRow();
        TableModel model = jTable_User.getModel();
        txtUserID.setText(model.getValueAt(i,0).toString());
        txtFirstName.setText(model.getValueAt(i,1).toString());
        txtLastName.setText(model.getValueAt(i,2).toString());
        txtContactNo.setText(model.getValueAt(i,3).toString());
        txtEmail.setText(model.getValueAt(i,4).toString());
        String gender = model.getValueAt(i,5).toString();
        if (gender.equals("M")){
            jRadioButton_M.setSelected(true);
            jRadioButton_F.setSelected(false);
        }
        else{
            jRadioButton_F.setSelected(true);
            jRadioButton_M.setSelected(false);
        }
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 6));
        DateTimePicker_DOB.setDate(date);
        txtAddress.setText(model.getValueAt(i,7).toString());
        String question = model.getValueAt(i,8).toString();
        if (question.equals("Favorite Food")){
            cboQuestion.setSelectedIndex(0);
        }
        else if(question.equals("Favorite Drinks")){
            cboQuestion.setSelectedIndex(1);
        }
        else if(question.equals("Favorite Color")){
            cboQuestion.setSelectedIndex(2);
        }
        else if(question.equals("Favorite Novel")){
            cboQuestion.setSelectedIndex(3);
        }
        else if(question.equals("Favorite Actor")){
            cboQuestion.setSelectedIndex(4);
        }
        else if(question.equals("Favorite Author")){
            cboQuestion.setSelectedIndex(5);
        }
        else if(question.equals("Favorite Subject")){
            cboQuestion.setSelectedIndex(6);
        }
        else{
            cboQuestion.setSelectedIndex(7);
        }
        txtAnswer.setText(model.getValueAt(i,9).toString());
        txtPassword.setText(model.getValueAt(i,10).toString());
        txtConPass.setText(model.getValueAt(i,10).toString());
        String roles = model.getValueAt(i,11).toString();
        if (roles.equals("Customer")){
            cboRoles.setSelectedIndex(0);
        }
        else if(roles.equals("Staff")){
            cboRoles.setSelectedIndex(1);
        }
        else{
            cboRoles.setSelectedIndex(2);
        }
        }
        catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_jTable_UserMouseClicked

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
    
    private void groupButton() {       
        ButtonGroup bg1 = new ButtonGroup( );
        bg1.add(jRadioButton_M);
        bg1.add(jRadioButton_F);
    }
    
    private void setControlReadOnly(boolean blnRead){
        txtUserID.setEditable(blnRead);
        txtFirstName.setEditable(blnRead);
        txtLastName.setEditable(blnRead);
        txtContactNo.setEditable(blnRead);
        txtEmail.setEditable(blnRead);
        txtAddress.setEditable(blnRead);
        txtAnswer.setEditable(blnRead);
        txtPassword.setEditable(blnRead);
        txtConPass.setEditable(blnRead);
    }
    
    private void setComboBoxReadOnly(boolean blnEnabled){
        cboQuestion.setEnabled(blnEnabled);
        cboRoles.setEnabled(blnEnabled);
        DateTimePicker_DOB.setEnabled(blnEnabled);
    }
    
    private void resetButtonForEdit(){
         btnAdd.setText("Add");
         btnAdd.setEnabled(true);
         btnEdit.setEnabled(true);
         btnDelete.setText("Delete");
         btnSave.setEnabled(false);
         btnFirst.setEnabled(true);
         btnLast.setEnabled(true);
         btnNext.setEnabled(true);
         btnPrevious.setEnabled(true);
    }
    
      private void setButtonForEdit(){
         btnAdd.setText("Add");
         btnAdd.setEnabled(false);
         btnEdit.setEnabled(false);
         btnDelete.setText("Cancel");
         btnSave.setEnabled(true);
         btnFirst.setEnabled(false);
         btnLast.setEnabled(false);
         btnNext.setEnabled(false);
         btnPrevious.setEnabled(false);
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
    private org.jdesktop.swingx.JXDatePicker DateTimePicker_DOB;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboQuestion;
    private javax.swing.JComboBox<String> cboRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton_F;
    private javax.swing.JRadioButton jRadioButton_M;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_User;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
