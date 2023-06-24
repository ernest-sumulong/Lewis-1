/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import dbconnection.DB;
import javax.swing.JOptionPane;
/**
 *
 * @author chris
 */
public class Test1 extends DB{
    
    DB _conn = new DB();
    
    public static void main(String[] args) 
    {
       
       DB _conn = new DB();
       _conn.dataQuery("SELECT * FROM company");
       _conn.result();
        
        
    }
    
   
}
