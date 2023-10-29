/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;

/**
 *
 * @author Nusrat Ali
 */
public class AdminLoginDaoImpl implements AdminLoginDao {
    private String finalUsername = "grocery"; 
    private String finalPassword = "grocery123";
    @Override
    public boolean userCredentials(AdminLoginBll alb) {
        return alb.getUsername().equals(finalUsername) && alb.getPassword().equals(finalPassword); 
    
}
}
