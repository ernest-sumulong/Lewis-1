/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import dao.company.CompanyImpl;
import java.util.ArrayList;
import models.Company;
/**
 *
 * @author chris
 */
public class CompanyController {
    
    public void save(Company _company) throws SQLException {
        Company company = new Company();
        company.setCompanyName(_company.getCompanyName());
        company.setBusinessStyle(_company.getBusinessStyle());
        company.setClassification(_company.getClassification());
        company.setAddress(_company.getAddress());
        company.setContactNo(_company.getContactNo());
        CompanyImpl companyImpl = new CompanyImpl();
        companyImpl.insert(company);
    }
    
    public String[] getCompanyById(int id) throws SQLException {
        CompanyImpl companyImpl = new CompanyImpl();
        Company company = companyImpl.getCompanyById(id);
        String _comId = String.valueOf(company.getId());
        String _comName = company.getCompanyName();
        String _comBStyle = company.getBusinessStyle();
        String _comClassif = company.getClassification();
        String _comAddress = company.getAddress();
        String _comContact = company.getContactNo();
        String[] arry = new String[]{_comId,_comName,_comBStyle,_comClassif,_comAddress,_comContact};
        return arry;
        
        //temporary  way to display 
       /*
         System.out.println(company.getId() + " " + company.getCompanyName() +
                " " + company.getBusinessStyle() + " " + company.getClassification() + 
                " " + company.getAddress() + " " + company.getContactNo());
        */ 
       
        
      
        
    }
    
    public ArrayList<Company> list() throws SQLException {
        CompanyImpl companyImpl = new CompanyImpl();
        ArrayList<Company> ls = (ArrayList<Company>) companyImpl.getCompanies();
        return ls;
        //temporary way to display
       /*
         for(Company companies : ls){
            System.out.println(companies.toString());
        }
        */
    }
    
    public void remove(int id) throws SQLException {
        CompanyImpl companyImpl = new CompanyImpl();
        companyImpl.delete(id);
    }
    
    public void UpdateCompany(Company _company) throws SQLException {
    Company company = new Company();
    company.setCompanyName(_company.getCompanyName());
    company.setBusinessStyle(_company.getBusinessStyle());
    company.setClassification(_company.getClassification());
    company.setAddress(_company.getAddress());
    company.setContactNo(_company.getContactNo());
    company.setId(_company.getId());
    CompanyImpl compImpl = new CompanyImpl();
    compImpl.update(company);
    }
    
}
