/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import dbconnection.DatabaseConnection;
import java.util.ArrayList;
import models.Company;
import views.forms.masterfile.companyViews.CompanyListForm;

/**
 *
 * @author chris
 */
public class CompanyImpl implements ICompany {

  static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(Company company) throws SQLException {
        String query = "INSERT INTO companies (companyName,businessStyle,classification,address,contactNo) " 
                + "VALUES (?,?,?,?,?)";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, company.getCompanyName());
        ps.setString(2, company.getBusinessStyle());
        ps.setString(3, company.getClassification());
        ps.setString(4, company.getAddress());
        ps.setString(5, company.getContactNo());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
            String query = "DELETE FROM companies WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
    }

    @Override
    public Company getCompanyById(int id) throws SQLException {
        String query = "SELECT * FROM companies WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        Company company = new Company();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while(rs.next()){
        check = true;
        company.setId(rs.getInt("id"));
        company.setCompanyName(rs.getString("companyName"));
        company.setBusinessStyle(rs.getString("businessStyle"));
        company.setClassification(rs.getString("classification"));
        company.setAddress(rs.getString("address"));
        company.setContactNo(rs.getString("contactNo"));
        }
        if(check == true){
        return company;
        }else {
        return null;
        }
    }

    @Override
    public List<Company> getCompanies() throws SQLException {
         String query = "SELECT * FROM companies";
         PreparedStatement ps = conn.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         List<Company> ls = new ArrayList<>();
         
         while(rs.next()){
         Company company = new Company();
         company.setId(rs.getInt("id"));
         company.setCompanyName(rs.getString("companyName"));
         company.setBusinessStyle(rs.getString("businessStyle"));
         company.setClassification(rs.getString("classification"));
         company.setAddress(rs.getString("address"));
         company.setContactNo(rs.getString("contactNo"));
         ls.add(company);
         }
         return ls;
    }

    @Override
    public void update(Company company) throws SQLException {
        String query = "UPDATE companies SET companyName=? , businessStyle=? , "
                + "classification=? , address=? , contactNo=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, company.getCompanyName());
        ps.setString(2, company.getBusinessStyle());
        ps.setString(3, company.getClassification());
        ps.setString(4, company.getAddress());
        ps.setString(5, company.getContactNo());
        ps.setInt(6, company.getId());
        ps.executeUpdate();
    }
    
}
