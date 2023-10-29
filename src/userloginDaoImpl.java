/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Nusrat Ali
 */
public class userloginDaoImpl implements userloginDao {
@Override
    public boolean userAccess(userloginBll ulb) {
        try{
            File f = new File("src/textFiles/activeuser.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            PrintWriter pw = new PrintWriter(bw);
            FileReader fr=new FileReader("src/textFiles/Accountrequest.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line=null;
                String []splt=null;
                while((line=br.readLine())!=null){
                    splt=line.split(",");
                    
                    if(splt[0].equals(ulb.getusername()) && splt[2].equals(ulb.getpassword())) {
                        pw.println(ulb.getusername());
                        pw.flush();
                        pw.close();
                        return true;
                    }
                }
            }
            }
        
        catch(IOException e){
            System.out.println("FileNotFound");
        }
         
        return false; 
    }
}
    
    


