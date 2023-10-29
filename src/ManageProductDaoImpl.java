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
public class ManageProductDaoImpl implements ManageProductDao {
    public void removeProduct(manageproductBll mpb) {
        File file = new File("src/textFiles/Product.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
                
            }

               Object[] tableLines = br.lines().toArray();
                int i=0;
               
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                   // System.out.println("Out of first loop");
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        System.out.println(i);
                  
                        if(mpb.getProductName().equals(tableRows[1]) && mpb.getCategory().equals(tableRows[4]) ){
                            //pwp.println(tableRows[0]+","+mpb.getNewProdName()+","+mpb.getNewRate()+","+mpb.getNewQuantity()+","+tableRows[4]);
                          // pw.println(clb.getCustomerId()+","+ clb.getUsername() + ","+ prodname + "," +"Clothes,"+ quantity +","+ rate*quantity+","+ dtf.format(now)
                          
                        }
                        else{
                            pwp.println(lines);
                        }
                    }
                    
                    pwp.flush();
                    pwp.close();
                } catch (IOException ex) {           
                Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }           
             
    }   catch (IOException ex) {
            Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editProduct(manageproductBll mpb) {
        File file = new File("src/textFiles/Product.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
                
            }
  
                Object[] tableLines = br.lines().toArray();
                int i=0;
                
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                   // System.out.println("Out of first loop");
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        //System.out.println(i);
                   
                        if(mpb.getProductName().equals(tableRows[1]) && mpb.getCategory().equals(tableRows[4]) ){
     
                            pwp.println(tableRows[0]+","+mpb.getNewProdName()+","+mpb.getNewRate()+","+mpb.getNewQuantity()+","+tableRows[4]);
                            // pw.println(clb.getCustomerId()+","+ clb.getUsername() + ","+ prodname + "," +"Clothes,"+ quantity +","+ rate*quantity+","+ dtf.format(now)
                          
                        }
                        else{
                            pwp.println(lines);
                        }
                    }
                    
                    pwp.flush();
                    pwp.close();
                } catch (IOException ex) {           
                Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }           
             
    }   
    catch (IOException ex)
    {
        Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
