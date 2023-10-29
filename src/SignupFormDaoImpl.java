/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.loginpage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nusrat Ali
 */
public class SignupFormDaoImpl implements SignupFormDao{
    public void newuserDetails(SignupFormBll sfb) {
        File f = new File("src/textFiles/Accountrequest.txt"); 
        try {
            if (!f.exists()){
                f.createNewFile();
            }
            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(sfb.getUsername() + "," +sfb.getAddress() + "," + sfb.getPassword() + "," + sfb.getGender() + "," + sfb.getPhoneNo());
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
    }
    
}

