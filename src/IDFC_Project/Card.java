
package IDFC_Project;

import CardDisplay.Product_Card;
import java.awt.Graphics;

public class Card extends javax.swing.JPanel {

    private final Product_Card data;
    public Card(Product_Card data) {
        this.data = data;
        initComponents();
        setOpaque(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        // for draw image
        super.paintComponent(grphcs);
    }

    @Override
    public void paint(Graphics grphcs) {
        // style color
        super.paint(grphcs); 
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
