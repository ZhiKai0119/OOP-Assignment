package Swing;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;

public class MenuItem extends javax.swing.JPanel {

    private final Model_Menu data;
    
    public MenuItem(Model_Menu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
         if (data.getType() == Model_Menu.MenuType.MENU) {
            lbIcon.setIcon(data.toIcon());
            lbName.setText(data.getName());
        } else {
            lbName.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        if (data.getType() == Model_Menu.MenuType.MENU) {
            if (selected) {
                lbName.setFont(new Font("Mongolian Baiti",Font.PLAIN,18));
                lbIcon.setIcon(data.toIconSelected());
                lbName.setForeground(new Color(203, 178, 106)); //240, 240, 240
            } else {
                lbName.setFont(new Font("Mongolian Baiti",Font.PLAIN,18));
                lbIcon.setIcon(data.toIcon());
                lbName.setForeground(new Color(240, 240, 240));
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        lbName.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIcon))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
