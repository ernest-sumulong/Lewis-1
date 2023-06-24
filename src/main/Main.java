/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import desktops.MainDesktop;
import javax.swing.JOptionPane;
import dbconnection.DB;
/**
 *
 * @author chris
 */
public class Main {
  
    public static void main(String[] args){
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }
        
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DB _conn = new DB();
                if(_conn.checkConnection() == true) {
                    JOptionPane.showMessageDialog(null, "Connection to the Database is established successfully!");
                new MainDesktop().setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Connection to the Database was not establish !");
                    
                }
                
            }
        });
    }
}
