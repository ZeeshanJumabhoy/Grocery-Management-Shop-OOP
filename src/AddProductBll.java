/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;

/**
 *
 * @author Nusrat Ali
 */
class AddProductBll {
    private int productid;
    public int getproductid() {
        return productid;
    }
    public void setproductid(int productid) {
        this.productid = productid;
    }
    private String productname;
    private float unitprice;
    private int quantity;
    private String category;

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getproductname() {
        return productname;
    }

    public void setproductname(String productname) {
        this.productname = productname;
    }

    public float getunitprice() {
        return unitprice;
    }

    public void setunitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
}

    
