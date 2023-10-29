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
public class ManagestaffDaoImpl implements ManageStaffDao{
    public void removestaff(managestaffBll mcb) {
        File file = new File("src/textFiles/staff.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
            }
                Object[] tableLines = br.lines().toArray();
                int i=0;
               
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        int userId = Integer.parseInt(tableRows[0]);
                        if(mcb.getstaffid()== userId && mcb.getusername().equals(tableRows[1])){
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
        }
    }

    @Override
    public void editstaff(managestaffBll mcb) {
        File file = new File("src/textFiles/staff.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
            }
                Object[] tableLines = br.lines().toArray();
                int i=0;
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        int userId = Integer.parseInt(tableRows[0]);
                        if(mcb.getstaffid()== userId && mcb.getusername().equals(tableRows[1]) ){
                            System.out.println("");
                             pwp.println(userId+","+ mcb.getNewUsername() + ","+ mcb.getNewAddress() + "," +mcb.getNewPassword()+  "," + tableRows[4]+","+ mcb.getNewPhoneNo());
                        }
                        else{
                            System.out.println("");
                            pwp.println(lines);
                        }
                    }
                    
                    pwp.flush();
                    pwp.close();
                } catch (IOException ex) {           
                Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        catch (IOException ex) {
            Logger.getLogger(ManagestaffDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
}

