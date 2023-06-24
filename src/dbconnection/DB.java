/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author chris
 */
public class DB {
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;
  
   
    public Boolean checkConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/lewis1db", "root", "password");
          //  JOptionPane.showMessageDialog(null, "Connected !");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Connected !");
            return false;
        }
    }
   
   public ResultSet dataQuery(String sql)
   {
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost/lewis1db", "root", "password");
           stmt = conn.prepareStatement(sql);
           return rs = stmt.executeQuery(sql);
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           return rs;
       }
   }
   
   public void result(){
       try {
           while(this.rs.next()){
               System.out.println(rs.getString(2));
           }
       } catch (Exception e) {
       }
   }
   
   public DefaultTableModel companyTblModel(){
   DefaultTableModel tblModel = new DefaultTableModel();
   tblModel.addColumn("Company ID");
   tblModel.addColumn("Company Name");
   tblModel.addColumn("Classification");
   tblModel.addColumn("");
       try {
           String sql = "SELECT * FROM companies";
           conn = DriverManager.getConnection("jdbc:mysql://localhost/lewis1db", "root", "password");
           stmt = conn.prepareStatement(sql);
           rs = stmt.executeQuery(sql);
           while(rs.next()){
           String id = this.rs.getString(1);
           String companyName = this.rs.getString(2);
           String classification = this.rs.getString(4);
           tblModel.addRow(new String[]{id,companyName,classification});
           }
       } catch (Exception e) {
       }
   
   return tblModel;
   }
   
   public DefaultTableModel supplierTblModel(){
   DefaultTableModel tblModel = new DefaultTableModel();
   tblModel.addColumn("Supplier ID");
   tblModel.addColumn("Supplier Name");
   tblModel.addColumn("Supply Type");
       try {
           String sql = "SELECT * FROM suppliers";
           conn = DriverManager.getConnection("jdbc:mysql://localhost/lewis1db", "root", "password");
           stmt = conn.prepareStatement(sql);
           rs = stmt.executeQuery(sql);
           while(rs.next()){
           String id = this.rs.getString(1);
           String supplierName = this.rs.getString(2);
           String supplyType = this.rs.getString(3);
           tblModel.addRow(new String[]{id,supplierName,supplyType});
           }
       } catch (Exception e) {
       }
   
   return tblModel;
   }
    
}
