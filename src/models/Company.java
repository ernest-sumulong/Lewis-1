/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author chris
 */
public class Company {
    
   int id;
   String companyName;
   String businessStyle;
   String classification;
   String address;
   String contactNo;
    
    public Company(){}

    public Company(int id, String companyName, String businessStyle, String classification, String address, String contactNo) {
        this.id = id;
        this.companyName = companyName;
        this.businessStyle = businessStyle;
        this.classification = classification;
        this.address = address;
        this.contactNo = contactNo;
    }
    
    public int getId(){ return id; }
    
    public void setId(int id) { this.id = id; }
    
    public String getCompanyName() { return companyName; }
    
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    
    public String getBusinessStyle() { return businessStyle; }
    
    public void setBusinessStyle(String businessStyle) { this.businessStyle = businessStyle; }
    
    public String getClassification() { return classification; }
    
    public void setClassification(String classification) { this.classification = classification; }
    
    public String getAddress() { return address; }
    
    public void setAddress(String address) { this.address = address; }
    
    public String getContactNo() { return contactNo; }
    
    public void setContactNo(String contactNo) { this.contactNo = contactNo; }
    
    @Override
    public String toString(){
    return id + companyName + businessStyle + classification + address + contactNo;
    }
}
