/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;
import controllers.CompanyController;
import java.sql.SQLException;
import java.util.Arrays;
import java.lang.reflect.Array;
/**
 *
 * @author chris
 */
public class Test03 {
    public static void main(String[] args) throws SQLException{
    CompanyController x = new CompanyController();
    
    String[] a = new String[6];
    
        for(int i = 0; i < a.length;i++){
            a[i] = Array.get(x.getCompanyById(1), i).toString();
        }
   
        for (String a1 : a) {
            System.out.println(a1 + " ");
        } 
        
    }
}
