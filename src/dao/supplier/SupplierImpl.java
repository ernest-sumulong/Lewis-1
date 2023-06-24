/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import dbconnection.DatabaseConnection;
import java.util.ArrayList;
import models.Supplier;
/**
 *
 * @author chris
 */
public class SupplierImpl implements ISupplier{
    
    static Connection conn = DatabaseConnection.getConnection();

    @Override
    public int insert(Supplier supplier) throws SQLException {
        String query = "INSERT INTO suppliers (supplierName,supplyType,paymentType,"
                + "paymentTransac,address,contactPerson,contactDesignation,emailAdd,contactNo)" +
                "values (?,?,?,?,?,?,?,?,?)";  
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, supplier.getSupplierName());
        ps.setString(2, supplier.getSupplyType());
        ps.setString(3, supplier.getPaymentType());
        ps.setString(4, supplier.getPaymentTransac());
        ps.setString(5, supplier.getAddress());
        ps.setString(6, supplier.getContactPerson());
        ps.setString(7, supplier.getContactDesignation());
        ps.setString(8, supplier.getEmailAdd());
        ps.setString(9, supplier.getContactNo());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
       String query = "DELETE FROM suppliers WHERE id=?";
       PreparedStatement ps = conn.prepareStatement(query);
       ps.setInt(1, id);
       ps.executeUpdate();
    }

    @Override
    public Supplier getSupplierById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Supplier> getSuppliers() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Supplier supplier) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
