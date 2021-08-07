package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Forgot_Password extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/idfc";
    static final String USER = "root";
    static final String PASS = "Yizhimae_98";
    Connection sqlCon = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Forgot_Password() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form 
        lblAns.setVisible(false);
        lblPass.setVisible(false);
        txtAnswer.setVisible(false);
        txtPassword.setVisible(false);
        btnRetrievePass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAns = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        btnRetrieveQues = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnRetrievePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Logo_Portrait.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 178, 106));
        jLabel4.setText("FORGOT PASSWORD");

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 178, 106));
        jLabel10.setText("Security Question:");

        txtEmail.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtEmail.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAns.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        lblAns.setForeground(new java.awt.Color(203, 178, 106));
        lblAns.setText("Answer:");

        lblPass.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        lblPass.setForeground(new java.awt.Color(203, 178, 106));
        lblPass.setText("Password:");

        txtAnswer.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtAnswer.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(203, 178, 106));
        jLabel14.setText("Email:");

        txtQuestion.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtQuestion.setEnabled(false);
        txtQuestion.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuestionActionPerformed(evt);
            }
        });

        btnRetrieveQues.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnRetrieveQues.setForeground(new java.awt.Color(203, 178, 106));
        btnRetrieveQues.setText("Confirm");
        btnRetrieveQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveQuesActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Mongolian Baiti", 0, 16)); // NOI18N
        txtPassword.setEnabled(false);
        txtPassword.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnRetrievePass.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnRetrievePass.setForeground(new java.awt.Color(203, 178, 106));
        btnRetrievePass.setText("Retrieve Password");
        btnRetrievePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrievePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetrieveQues, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRetrievePass, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAns)
                                    .addComponent(jLabel10)
                                    .addComponent(lblPass))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(184, 184, 184))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetrieveQues))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAns)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addGap(28, 28, 28)
                .addComponent(btnRetrievePass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void txtQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuestionActionPerformed

    private void btnRetrieveQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveQuesActionPerformed
        String email = txtEmail.getText();
        
        try {
            if(email.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter your email to proceed.");
            }
            else{
                Class.forName("com.mysql.jdbc.Driver");
                sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
                String query = "SELECT securityQuestion FROM userdetails WHERE email=?";
                ps = sqlCon.prepareStatement(query);
                ps.setString(1, email);
                rs = ps.executeQuery();
                if(rs.next()){
                    txtQuestion.setText(rs.getString(String.valueOf("securityQuestion")));
                    lblAns.setVisible(true);
                    lblPass.setVisible(true);
                    txtAnswer.setVisible(true);
                    txtPassword.setVisible(true);
                    btnRetrievePass.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email not found.");
                    lblAns.setVisible(false);
                    lblPass.setVisible(false);
                    txtAnswer.setVisible(false);
                    txtPassword.setVisible(false);
                    btnRetrievePass.setVisible(false);
                }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetrieveQuesActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnRetrievePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrievePassActionPerformed
        String email = txtEmail.getText();
        String answer = txtAnswer.getText();
        
        try {
            if(answer.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter your security answer to proceed.");
            }
            else{
                Class.forName("com.mysql.jdbc.Driver");
                sqlCon = DriverManager.getConnection(DB_URL,USER,PASS);
                String query = "SELECT password FROM userdetails WHERE email=? AND securityAnswer=?";
                ps = sqlCon.prepareStatement(query);
                ps.setString(1, email);
                ps.setString(2, answer);
                rs = ps.executeQuery();
                if(rs.next()){
                    txtPassword.setText(rs.getString(String.valueOf("password")));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect security answer.Please try again.");
                }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetrievePassActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Forgot_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetrievePass;
    private javax.swing.JButton btnRetrieveQues;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
