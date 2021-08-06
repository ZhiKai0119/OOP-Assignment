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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Wong Xiao Tong
 */
public class Registration_Form extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/idfc";
    static final String USER = "root";
    static final String PASS = "Yizhimae_98";
    private static int startID = 10001;
    Connection sqlCon = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Registration_Form() {
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
        jTextField_FN = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jTextField_LN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_CN = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_M = new javax.swing.JRadioButton();
        jRadioButton_F = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPasswordField_Pass = new javax.swing.JPasswordField();
        jPasswordField_ConPass = new javax.swing.JPasswordField();
        jComboBox_Roles = new javax.swing.JComboBox<>();
        jComboBox_Ques = new javax.swing.JComboBox<>();
        jTextField_Ans = new javax.swing.JTextField();
        jXDatePicker_DOB = new org.jdesktop.swingx.JXDatePicker();

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

        jTextField_FN.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
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

        jTextField_LN.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jTextField_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 178, 106));
        jLabel5.setText("Contact No:");

        jTextField_CN.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jTextField_CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CNActionPerformed(evt);
            }
        });

        jTextField_Email.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
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

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Mongolian Baiti", 0, 13)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

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

        jPasswordField_Pass.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jPasswordField_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField_PassMouseExited(evt);
            }
        });
        jPasswordField_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_PassKeyReleased(evt);
            }
        });

        jPasswordField_ConPass.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N

        jComboBox_Roles.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jComboBox_Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Staff", "Delivery Staff" }));

        jComboBox_Ques.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jComboBox_Ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorite Food", "Favorite Drinks", "Favorite Color", "Favorite Novel", "Favorite Actor", "Favorite Author", "Favorite Subject", "Favorite Pet" }));

        jTextField_Ans.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        jTextField_Ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AnsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton_M)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(jRadioButton_F))
                                    .addComponent(jTextField_CN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Email)
                                    .addComponent(jTextField_FN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_LN))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField_Pass)
                            .addComponent(jPasswordField_ConPass)
                            .addComponent(jComboBox_Roles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_Ques, 0, 166, Short.MAX_VALUE)
                            .addComponent(jTextField_Ans, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jXDatePicker_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addGap(0, 64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox_Ques, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField_Ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jPasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField_CN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_ConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel24))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_M)
                    .addComponent(jRadioButton_F)
                    .addComponent(jLabel7)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox_Roles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jXDatePicker_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        try
        {
            String userID = "21WMR12346";
            String firstName = jTextField_FN.getText();
            String lastName = jTextField_LN.getText();
            String contactNo = jTextField_CN.getText();
            String email = jTextField_Email.getText();
            String address = jTextArea_Address.getText();
            String securityQuestion = jComboBox_Ques.getSelectedItem().toString();
            String securityAnswer = jTextField_Ans.getText();
            String password = String.valueOf(jPasswordField_Pass.getPassword());
            String conPass = String.valueOf(jPasswordField_ConPass.getPassword());
            String role=jComboBox_Roles.getSelectedItem().toString();
            String gender = "";
            String dateOfBirth=null;
            
            
            //Email Validation
            String e_expression = "[A-Za-z]+@+[A-Za-z]+\\.+[A-Za-z]{2,4}+$";
            Pattern p_email = Pattern.compile(e_expression);
            Matcher m_email = p_email.matcher(jTextField_Email.getText());
             //ContactNo Validation
            String c_expression = "\\d{3}-\\d{8}";
            Pattern p_CN = Pattern.compile(c_expression);
            Matcher m_CN = p_CN.matcher(jTextField_CN.getText());
            //Password Validation
            boolean validPassword = isValidPassword(password);
            if (!textFieldsValid()) {
                JOptionPane.showMessageDialog(null, "The text fields are not filled with data.");
            }
            else if(radioButtonValid()){
                if(jRadioButton_M.isSelected()){
                    gender = "M";
                }
                else if(jRadioButton_F.isSelected()){
                    gender = "F";
                }
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
                JOptionPane.showMessageDialog(null,"Password and Confirm Password not match. Please try again.");
            }
            else{
                 Class.forName("com.mysql.jdbc.Driver");
                 sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
                 ps = sqlCon.prepareStatement("INSERT INTO userdetails(user_ID,firstName,lastName,email,gender,contactNo,dateOfBirth,address,securityQuestion,securityAnswer,password,roles) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                 ps.setString(1, userID);
                 ps.setString(2, firstName);
                 ps.setString(3, lastName);
                 ps.setString(4, email);
                 ps.setString(5, gender);
                 ps.setString(6, contactNo);
                 ps.setString(7, dateOfBirth);
                 ps.setString(8, address);
                 ps.setString(9, securityQuestion);
                 ps.setString(10, securityAnswer);
                 ps.setString(11, password);
                 ps.setString(12, role);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Insert Successfully.");
            }           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextField_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNActionPerformed

    private void jTextField_CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CNActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jTextField_AnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AnsActionPerformed
        
    }//GEN-LAST:event_jTextField_AnsActionPerformed

    private void jPasswordField_PassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_PassMouseExited

    }//GEN-LAST:event_jPasswordField_PassMouseExited

    private void jPasswordField_PassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PassKeyReleased

    }//GEN-LAST:event_jPasswordField_PassKeyReleased

     private void groupButton( ) {       
        ButtonGroup bg1 = new ButtonGroup( );
        bg1.add(jRadioButton_M);
        bg1.add(jRadioButton_F);
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
        
        if (jTextField_FN.getText().isEmpty()) {
            validTextFields = false;
            jTextField_FN.setBorder(new LineBorder(Color.RED));
        }
        
        if (jTextField_LN.getText().isEmpty()) {
            validTextFields = false;
            jTextField_LN.setBorder(new LineBorder(Color.RED));
        }
        
        if (jTextField_Email.getText().isEmpty()) {
            validTextFields = false;
            jTextField_Email.setBorder(new LineBorder(Color.RED));
        }
                
        if (jTextField_CN.getText().isEmpty()) {
            validTextFields = false;
            jTextField_CN.setBorder(new LineBorder(Color.RED));
        }
        
        if (jTextArea_Address.getText().isEmpty()) {
            validTextFields = false;
            jTextArea_Address.setBorder(new LineBorder(Color.RED));
        }
        
        if (jTextField_Ans.getText().isEmpty()) {
            validTextFields = false;
            jTextField_Ans.setBorder(new LineBorder(Color.RED));
        }        
        else{
            validTextFields = true;
            jTextField_Ans.setBorder(new LineBorder(Color.BLACK));
        }
        return validTextFields;
    }
    
     public boolean checkEmail(String email)
    {
        boolean checkUser = false;
        
        try {

            sqlCon = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6425946?zeroDateTimeBehavior=convertToNull", "sql6425946", "PB2R62nXjy");
            ps = sqlCon.prepareStatement("SELECT * FROM userdetails WHERE 'email' =?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
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
            JOptionPane.showMessageDialog(null,"Password must have atl east one number.");
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
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBox_Ques;
    private javax.swing.JComboBox<String> jComboBox_Roles;
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
    private javax.swing.JPasswordField jPasswordField_ConPass;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JRadioButton jRadioButton_F;
    private javax.swing.JRadioButton jRadioButton_M;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Ans;
    private javax.swing.JTextField jTextField_CN;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker_DOB;
    // End of variables declaration//GEN-END:variables
}
