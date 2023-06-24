/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.company;

import java.sql.SQLException;
import java.util.List;
import models.Company;

/**
 *
 * @author chris
 */
public interface ICompany {
    
    public int insert(Company company) throws SQLException;
    
    public void delete(int id) throws SQLException;
    
    public Company getCompanyById(int id) throws SQLException;
    
    public List<Company> getCompanies() throws SQLException;
    
    public void update(Company company) throws SQLException;
    
}
