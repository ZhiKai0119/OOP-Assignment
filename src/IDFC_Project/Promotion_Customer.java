/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDFC_Project;

import connection.DatabaseConnection;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC01
 */
public class Promotion_Customer extends javax.swing.JPanel {
    
 private DefaultTableModel model;
 private ResultSet rs;
    /**
     * Creates new form Promotion_Customer
     */
    public Promotion_Customer() {
        initComponents();
         init();
         customJTable();
         updateTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPromotion = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(45, 44, 45));

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Promotion Module");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPromotion.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        tblPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Code", "Quantity", "Description", "Start Date", "End Date", "Copy your code!"
            }
        ));
        tblPromotion.setRowHeight(26);
        jScrollPane2.setViewportView(tblPromotion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customJTable() {
        tblPromotion.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
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
        
        //  set button to column 8
        tblPromotion.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            private final JButton btn = new JButton();

            @Override
            public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
                btn.setText(o + "Copy Code");
                btn.setBackground(jtable.getSelectionBackground());
                return btn;
            }

            @Override
            public Object getCellEditorValue() {
                return btn.getText();
            }
        });
    }
    
     public void updateTable() {
        try {
            model = (DefaultTableModel) tblPromotion.getModel();
            model.setRowCount(0);
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement("Select promoID, promoName, promoCode, promoQty, promoDesc, promoStartDate, promoEndDate From promotion WHERE promoStatus = true;", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String promoID = rs.getString(1);
                String promoName = rs.getString(2);
                String promoCode = rs.getString(3);
                String promoQty = rs.getString(4);                
                String promoDesc = rs.getString(5);
                String promoStartDate = rs.getString(6);
                String promoEndDate = rs.getString(7);

                model.addRow(new Object[]{promoID, promoName, promoCode, promoQty,  promoDesc, promoStartDate,promoEndDate});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPromotion;
    // End of variables declaration//GEN-END:variables
}
