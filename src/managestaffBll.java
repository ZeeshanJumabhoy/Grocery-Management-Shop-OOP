/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;
/**
 *
 * @author Nusrat Ali
 */
public class managestaffBll {
    private String username;
    private int staffid;
    private String newUsername;
    private String newAddress;
    private String newPassword;
    private String newPhoneNo;

    public String getNewPhoneNo() {
        return newPhoneNo;
    }

    public void setNewPhoneNo(String newPhoneNo) {
        this.newPhoneNo = newPhoneNo;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public int getstaffid() {
        return staffid;
    }

    public void setstaffid(int staffid) {
        this.staffid = staffid;
    }
}

