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
public class Supplier {
    
    int id;
    String supplierName;
    String supplyType;
    String paymentType;
    String paymentTransac;
    String address;
    String contactPerson;
    String contactDesignation;
    String emailAdd;
    String contactNo;

    public Supplier() {}

    public Supplier(int id, String supplierName, String supplyType, String paymentType, String paymentTransac, String address, String contactPerson, String contactDesignation, String emailAdd, String contactNo) {
        this.id = id;
        this.supplierName = supplierName;
        this.supplyType = supplyType;
        this.paymentType = paymentType;
        this.paymentTransac = paymentTransac;
        this.address = address;
        this.contactPerson = contactPerson;
        this.contactDesignation = contactDesignation;
        this.emailAdd = emailAdd;
        this.contactNo = contactNo;
    }
    
    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }
    
    public String getSupplierName(){ return supplierName; }
    public void setSupplierName(String supplierName){ this.supplierName = supplierName; }
    
    public String getSupplyType(){ return supplyType; }
    public void setSupplyType(String supplyType){ this.supplyType = supplyType; }
    
    public String getPaymentType(){ return paymentType; }
    public void setPaymentType(String paymentType){ this.paymentType = paymentType; }
    
    public String getPaymentTransac(){ return paymentTransac; }
    public void setPaymentTransac(String paymentTransac){ this.paymentTransac = paymentTransac; }
    
    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}
    
    public String getContactPerson(){return contactPerson;}
    public void setContactPerson(String contactPerson){this.contactPerson = contactPerson;}
    
    public String getContactDesignation(){return contactDesignation;}
    public void setContactDesignation(String contactDesignation){this.contactDesignation = contactDesignation;}
    
    public String getEmailAdd(){ return emailAdd; }
    public void setEmailAdd(String emailAdd){ this.emailAdd = emailAdd; };
    
    public String getContactNo(){ return contactNo; }
    public void setContactNo(String contactNo){this.contactNo = contactNo;}
    
    
    @Override
    public String toString(){
        return id + " " +supplierName + " " + supplyType + " " + paymentType + " " + paymentTransac + " "
                + address + " " + contactPerson + " " + contactDesignation + " " + emailAdd + " " + contactNo;
    }
}
