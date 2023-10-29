/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nusrat Ali
 */
public class AddProductDaoImpl implements AddProductDao {
    
    public void productFile(AddProductBll apb) {
        File f = new File("src/textfiles/Product.txt");
        
        try {
            if (!f.exists()){
                f.createNewFile();
            }
            int i=0;
            int id = 0;
            BufferedReader br = new BufferedReader(new FileReader(f));
                apb.setproductid(id+1);
            
            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(apb.getproductid()+","+apb.getproductname() + "," +apb.getunitprice() + "," + apb.getquantity() + "," + apb.getcategory());
                pw.flush();
                pw.close();
                bw.close();
                fw.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddstaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddstaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            System.out.println("Successfully Wrote in file.....");
            
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
