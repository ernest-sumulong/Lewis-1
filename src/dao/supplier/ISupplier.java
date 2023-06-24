/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.supplier;

import java.sql.SQLException;
import java.util.List;
import models.Supplier;
/**
 *
 * @author chris
 */
public interface ISupplier {
    
    public int insert(Supplier supplier) throws SQLException;
    
    public void delete(int id) throws SQLException;
    
    public Supplier getSupplierById(int id) throws SQLException;
    
    public List<Supplier> getSuppliers() throws SQLException;
    
    public void update(Supplier supplier)throws SQLException;
}   
