/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designTable.company;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import dbconnection.DatabaseConnection;
import java.sql.Connection;
/**
 *
 * @author chris
 */
public class CompanyListTbl {
    
   static Connection conn = DatabaseConnection.getConnection();
    
    public DefaultTableModel listTbl() {
        
        DefaultTableModel tblMod = new DefaultTableModel();
        tblMod.addColumn("Company ID");
        tblMod.addColumn("Company Name");
        tblMod.addColumn("Classification");
        tblMod.addColumn("");
        try {
            String sql = "SELECT * FROM companies";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            String id = rs.getString(1);
            String companyName = rs.getString(2);
            String classification = rs.getString(4);
            String id2View = rs.getString(1);
            tblMod.addRow(new Object[]{id,companyName,classification,id2View});
            
            }
        } catch (Exception e) {
        }
       
        return tblMod;
    }
    
    
     public DefaultTableModel tblRefresh() {
        
        DefaultTableModel tblMod = new DefaultTableModel();
        tblMod.addColumn("Company ID");
        tblMod.addColumn("Company Name");
        tblMod.addColumn("Classification");
        tblMod.addColumn("");
        try {
            String sql = "SELECT * FROM companies";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            String id = rs.getString(1);
            String companyName = rs.getString(2);
            String classification = rs.getString(4);
            String id2View = rs.getString(1);
            tblMod.addRow(new Object[]{id,companyName,classification,id2View});
            
            }
        } catch (Exception e) {
        }
       
        return tblMod;
    }
}
