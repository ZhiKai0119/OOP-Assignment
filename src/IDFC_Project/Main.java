/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDFC_Project;

import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){      
        try {
            UIManager.setLookAndFeel(new FlatGruvboxDarkHardIJTheme());
            Delivery_Company delCom = new Delivery_Company(); 
            delCom.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
