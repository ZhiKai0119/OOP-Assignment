package Main;

import Event.EventMenu;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        init();
    }

    private void init() {
        //setBackground(new Color(0, 0, 0, 0));  //  Remove background
        pnlDeliveryCompany.setVisible(false);
        //promotion_Staff1.setVisible(false);
        menu1.initMoving(this);
        menu1.addEventMenu(new EventMenu() {
            @Override
            public void menuIndexChange(int index) {
//                JOptionPane.showMessageDialog(null, index + "");
                if(index == 0) {
                    pnlDeliveryCompany.setVisible(true);
                    //promotion_Staff1.setVisible(false);
                } else if(index == 1) {
                    pnlDeliveryCompany.setVisible(false);
                    //promotion_Staff1.setVisible(true);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new Component.Menu();
        LayeredPane = new javax.swing.JLayeredPane();
        pnlDeliveryCompany = new IDFC_Project.Delivery_Company();
        La = new IDFC_Project.Promotion_Staff();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDFC MART");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LayeredPane.setLayout(new java.awt.CardLayout());
        LayeredPane.add(pnlDeliveryCompany, "card2");
        LayeredPane.add(La, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LayeredPane)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addComponent(LayeredPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnlDeliveryCompany.updateTable();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        try {
            FlatGruvboxDarkMediumIJTheme.setup();
//            FlatAtomOneDarkContrastIJTheme.setup();
            //FlatArcDarkContrastIJTheme.setup();
//            FlatLightFlatIJTheme.setup();
//            FlatGruvboxDarkHardIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void switchPanels(JPanel panel) {
        LayeredPane.removeAll();
        LayeredPane.add(panel);
        LayeredPane.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private IDFC_Project.Promotion_Staff La;
    private javax.swing.JLayeredPane LayeredPane;
    private Component.Menu menu1;
    private IDFC_Project.Delivery_Company pnlDeliveryCompany;
    // End of variables declaration//GEN-END:variables
}
