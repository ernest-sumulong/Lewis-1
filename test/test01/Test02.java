/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.sql.SQLException;
import controllers.CompanyController;
/**
 *
 * @author chris
 */
public class Test02 {
    public static void main(String[] args)throws SQLException{
    CompanyController cntlr = new CompanyController();
    //cntlr.getCompanyById(1);
    //cntlr.list();
    //String[] inpts = {"MC Co Corporation","Corporation","Accounting Firm","",""};
    //cntlr.save(inpts);
    cntlr.remove(7);
    cntlr.list();
    
    }
}
