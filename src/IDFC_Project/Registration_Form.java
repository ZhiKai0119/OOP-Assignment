package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javafx.scene.paint.Color.color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Registration_Form extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/idfc";
    static final String USER = "root";
    static final String PASS = "Yizhimae_98";
    private static int startID = 10001;
    Connection sqlCon = null;
    PreparedStatement ps = null;

    public Registration_Form(){
        initComponents();
        this.setLocationRelativeTo(null);//Center Form 
        groupButton();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_M = new javax.swing.JRadioButton();
        jRadioButton_F = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConPass = new javax.swing.JPasswordField();
        cboRoles = new javax.swing.JComboBox<>();
        cboQuestion = new javax.swing.JComboBox<>();
        txtAnswer = new javax.swing.JTextField();
        jXDatePicker_DOB = new org.jdesktop.swingx.JXDatePicker();
        lblUserID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Logo_Portrait.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 178, 106));
        jLabel4.setText("Registration Form");

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 178, 106));
        jLabel1.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 178, 106));
        jLabel3.setText("Last Name:");

        txtFirstName.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });

        jButtonRegister.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(203, 178, 106));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 178, 106));
        jLabel5.setText("Contact No:");

        txtContactNo.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtContactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactNoFocusLost(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 178, 106));
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 178, 106));
        jLabel7.setText("Gender:");

        jRadioButton_M.setBackground(new java.awt.Color(26, 26, 26));
        jRadioButton_M.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jRadioButton_M.setForeground(new java.awt.Color(203, 178, 106));
        jRadioButton_M.setText("Male");

        jRadioButton_F.setBackground(new java.awt.Color(26, 26, 26));
        jRadioButton_F.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jRadioButton_F.setForeground(new java.awt.Color(203, 178, 106));
        jRadioButton_F.setText("Female");

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(203, 178, 106));
        jLabel8.setText("Date of Birth:");

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 178, 106));
        jLabel9.setText("Address:");

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Mongolian Baiti", 0, 13)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 178, 106));
        jLabel10.setText("Security Question:");

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(203, 178, 106));
        jLabel11.setText("Answer:");

        jLabel23.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(203, 178, 106));
        jLabel23.setText("Password:");

        jLabel24.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(203, 178, 106));
        jLabel24.setText("Confirm Password:");

        jLabel25.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(203, 178, 106));
        jLabel25.setText("Role:");

        txtPassword.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        txtConPass.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtConPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConPassFocusLost(evt);
            }
        });

        cboRoles.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        cboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Staff", "Delivery Staff" }));

        cboQuestion.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        cboQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorite Food", "Favorite Drinks", "Favorite Color", "Favorite Novel", "Favorite Actor", "Favorite Author", "Favorite Subject", "Favorite Pet" }));

        txtAnswer.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnswerFocusLost(evt);
            }
        });

        jXDatePicker_DOB.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jXDatePicker_DOB.setBackground(Color.BLACK);

        lblUserID.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        lblUserID.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUserID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(cboQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel23)
                                .addGap(4, 4, 4)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel24)
                                .addGap(4, 4, 4)
                                .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(jRadioButton_M)
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButton_F)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel25)
                                .addGap(4, 4, 4)
                                .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(jXDatePicker_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel9)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserID)))
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(cboQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel23))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24))
                    .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_M)
                    .addComponent(jRadioButton_F)
                    .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel25))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jXDatePicker_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jXDatePicker_DOB.setBackground(Color.BLACK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = sqlCon.createStatement();
            String query = "SELECT user_ID FROM userdetails ORDER BY user_ID DESC LIMIT 1";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                String userID = rs.getString("user_ID");
                int auto_ID = Integer.parseInt(userID);
                int new_ID = (auto_ID + 1);
                lblUserID.setText("" +new_ID);
            }

            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String contactNo = txtContactNo.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();
            String securityQuestion = cboQuestion.getSelectedItem().toString();
            String securityAnswer = txtAnswer.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String conPass = String.valueOf(txtConPass.getPassword());
            String role = cboRoles.getSelectedItem().toString();
            String gender = "";
            String dateOfBirth=null;
            
            
            //Email Validation
            String e_expression = "[A-Za-z]+@+[A-Za-z]+\\.+[A-Za-z]{2,4}+$";
            Pattern p_email = Pattern.compile(e_expression);
            Matcher m_email = p_email.matcher(txtEmail.getText());
             //ContactNo Validation
            String c_expression = "\\d{3}-\\d{8}";
            Pattern p_CN = Pattern.compile(c_expression);
            Matcher m_CN = p_CN.matcher(txtContactNo.getText());
            
            if (!textFieldsValid()) {
                JOptionPane.showMessageDialog(null, "The text fields are not filled with data.");
            }
            else if(!radioButtonValid()){
                JOptionPane.showMessageDialog(null, "Please select your gender.");
            }
            else if(!m_email.matches()){
                JOptionPane.showMessageDialog(null, "Invalid email format. Please enter your email in the correct format. Eg, abc@gmail.com");
            }
            else if (!m_CN.matches()) {
                JOptionPane.showMessageDialog(null,"Invalid phone number format. Phone Number must be in the format XXX-XXXXXXX");
            }
            else if (!((password)).equals(conPass)){
                JOptionPane.showMessageDialog(null,"Password and Confirm Password not match. Please try again.","Try Again",JOptionPane.ERROR_MESSAGE);
            }           
            else{
                if(jRadioButton_M.isSelected()){
                    gender = "M";
                }
                else if(jRadioButton_F.isSelected()){
                    gender = "F";
                }
                
                if(jXDatePicker_DOB.getDate() != null)
                {
                    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                    dateOfBirth = dateformat.format(jXDatePicker_DOB.getDate());
                }
                
                if (cboRoles.getSelectedIndex()==1){
                    String isStaff = JOptionPane.showInputDialog(null,"Please enter the verification code: ","Enter Verification Code",JOptionPane.INFORMATION_MESSAGE);
                    if(isStaff.equals("")){
                        JOptionPane.showMessageDialog(null,"You must enter the verification code to continue.");
                    }
                    else if(!"IDFC210810".equals(isStaff)){
                        JOptionPane.showMessageDialog(null,"Wrong verification code.");
                    }
                    else{
                        Class.forName("com.mysql.jdbc.Driver");
                        sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
                        ps = sqlCon.prepareStatement("INSERT INTO userdetails(user_ID,firstName,lastName,email,gender,contactNo,dateOfBirth,address,securityQuestion,securityAnswer,password,roles) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                        ps.setString(1, lblUserID.getText());
                        ps.setString(2, firstName);
                        ps.setString(3, lastName);
                        ps.setString(4, email);
                        ps.setString(5, gender);
                        ps.setString(6, contactNo);
                        if(dateOfBirth != null){
                            ps.setString(7, dateOfBirth);
                        }else{
                            ps.setNull(7, 0);
                        }
                        ps.setString(8, address);
                        ps.setString(9, securityQuestion);
                        ps.setString(10, securityAnswer);
                        ps.setString(11, password);
                        ps.setString(12, role);
                        //ps.executeUpdate();
                        if(ps.executeUpdate() > 0){
                            JOptionPane.showMessageDialog(null, "New User Add");
                            clearTextField();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Fail");
                        }
                    }
                }
                

            }           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        //Password Validation
        boolean validPassword = isValidPassword(String.valueOf(txtPassword.getPassword()));
        if (validPassword == false){
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
         if (!(txtFirstName.getText().isEmpty())) {
             txtFirstName.setBorder(new LineBorder(Color.decode("#5FEA70")));
        }
         else{
             txtFirstName.setBorder(new LineBorder(Color.decode("#FF8583")));
         }
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        if (!(txtLastName.getText().isEmpty())) {
             txtLastName.setBorder(new LineBorder(Color.decode("#5FEA70")));
        }
         else{
             txtLastName.setBorder(new LineBorder(Color.decode("#FF8583")));
         }
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactNoFocusLost
        //ContactNo Validation
            String c_expression = "\\d{3}-\\d{8}";
            Pattern p_CN = Pattern.compile(c_expression);
            Matcher m_CN = p_CN.matcher(txtContactNo.getText());
        if (!(txtContactNo.getText().isEmpty()) && m_CN.matches()) {
             txtContactNo.setBorder(new LineBorder(Color.decode("#5FEA70")));
        }
         else{
             txtContactNo.setBorder(new LineBorder(Color.decode("#FF8583")));
         }
    }//GEN-LAST:event_txtContactNoFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        //Email Validation
            String e_expression = "[A-Za-z]+@+[A-Za-z]+\\.+[A-Za-z]{2,4}+$";
            Pattern p_email = Pattern.compile(e_expression);
            Matcher m_email = p_email.matcher(txtEmail.getText());
            if (!(txtEmail.getText().isEmpty()) && m_email.matches()) {
                txtEmail.setBorder(new LineBorder(Color.decode("#5FEA70")));
            }
            else{
                txtEmail.setBorder(new LineBorder(Color.decode("#FF8583")));
            }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        if (!(txtAddress.getText().isEmpty())) {
                txtAddress.setBorder(new LineBorder(Color.decode("#5FEA70")));
            }
            else{
                txtAddress.setBorder(new LineBorder(Color.decode("#FF8583")));
            }
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtAnswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnswerFocusLost
        if (!(txtAnswer.getText().isEmpty())) {
                txtAnswer.setBorder(new LineBorder(Color.decode("#5FEA70")));
            }
            else{
                txtAnswer.setBorder(new LineBorder(Color.decode("#FF8583")));
            }
    }//GEN-LAST:event_txtAnswerFocusLost

    private void txtConPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConPassFocusLost
        if (!(String.valueOf(txtConPass.getPassword())).equals(String.valueOf(txtConPass.getPassword()))){
                txtConPass.setBorder(new LineBorder(Color.decode("#5FEA70")));
        }
        else{
            txtConPass.setBorder(new LineBorder(Color.decode("#FF8583")));
        }  
    }//GEN-LAST:event_txtConPassFocusLost

     private void groupButton() {       
        ButtonGroup bg1 = new ButtonGroup( );
        bg1.add(jRadioButton_M);
        bg1.add(jRadioButton_F);
    }
     
     private void clearTextField(){
         txtFirstName.setText("");
         txtLastName.setText("");
         txtEmail.setText("");
         txtContactNo.setText("");
         txtAddress.setText("");
         txtAnswer.setText("");
         txtPassword.setText("");
         txtConPass.setText("");
         jXDatePicker_DOB.setDate(null);
         jRadioButton_M.setSelected(false);
         jRadioButton_F.setSelected(false);     
     }
     
     private boolean radioButtonValid(){
         boolean validRadioButton = true;
         
          if(jRadioButton_M.isSelected()){
              validRadioButton = true;
          }
          else if(jRadioButton_F.isSelected()){
              validRadioButton = true;
          }
          else{
              validRadioButton = false;
          }
          return validRadioButton;
     }
     
    private boolean textFieldsValid() {
        boolean validTextFields = true;
        
        if (txtFirstName.getText().isEmpty()) {
            validTextFields = false;
            txtFirstName.setBorder(new LineBorder(Color.decode("#FF8583")));
        }
        
        if (txtLastName.getText().isEmpty()) {
            validTextFields = false;
            txtLastName.setBorder(new LineBorder(Color.decode("#FF8583")));
        }
        
        if (txtEmail.getText().isEmpty()) {
            validTextFields = false;
            txtEmail.setBorder(new LineBorder(Color.decode("#FF8583")));
        }
                
        if (txtContactNo.getText().isEmpty()) {
            validTextFields = false;
            txtContactNo.setBorder(new LineBorder(Color.decode("#FF8583")));
        }
        
        if (txtAddress.getText().isEmpty()) {
            validTextFields = false;
            txtAddress.setBorder(new LineBorder(Color.decode("#FF8583")));
        }
        
        if (txtAnswer.getText().isEmpty()) {
            validTextFields = false;
            txtAnswer.setBorder(new LineBorder(Color.decode("#FF8583")));
        } 
        
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            validTextFields = false;
            txtPassword.setBorder(new LineBorder(Color.decode("#FF8583")));
        }  
        
        if (String.valueOf(txtConPass.getPassword()).isEmpty()) {
            validTextFields = false;
            txtConPass.setBorder(new LineBorder(Color.decode("#FF8583")));
        }  
        
        else{
            validTextFields = true;
            txtFirstName.setBorder(new LineBorder(Color.BLACK));
            txtLastName.setBorder(new LineBorder(Color.BLACK));
            txtEmail.setBorder(new LineBorder(Color.BLACK));
            txtContactNo.setBorder(new LineBorder(Color.BLACK));
            txtAddress.setBorder(new LineBorder(Color.BLACK));
            txtAnswer.setBorder(new LineBorder(Color.BLACK));
            txtPassword.setBorder(new LineBorder(Color.BLACK));
            txtConPass.setBorder(new LineBorder(Color.BLACK));
        }
        return validTextFields;
    }
    
     public boolean checkEmail(String email)
    {
        boolean checkUser = true;
             
        try {
            String query = ("SELECT email FROM userdetails WHERE 'email' = ?");
            sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement statement = sqlCon.prepareStatement(query);
            statement.setString(1, email);
            ResultSet result = statement.executeQuery();
            
            if(result.next())
            {
                checkUser = false;
                System.out.println("Row with email found");
            }
            
            if(!(result.next())){
                checkUser = true;
            }
            
        } catch (SQLException ex) {
              Logger.getLogger(Registration_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }
     
     public static boolean isValidPassword(String password)
    {
        boolean isValid = true;
        if (password.length() < 8 || password.length() > 15)
        {
            JOptionPane.showMessageDialog(null,"Password must be more than 8 and less than 15 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have at least one uppercase character.");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have at least one lowercase character.");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            JOptionPane.showMessageDialog(null,"Password must have at least one number.");
            isValid = false;
        }
        String specialChars = "(.*[_,-,@,#,$,%].*$)";
        if (!password.matches(specialChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have at least one special character among _-@#$%.");
            isValid = false;
        }
        return isValid; 
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
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
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
                new Registration_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboQuestion;
    private javax.swing.JComboBox<String> cboRoles;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_F;
    private javax.swing.JRadioButton jRadioButton_M;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker_DOB;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
