/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase.Model;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class OrderModel {
    
    private String name;
    private String table;
    private String id_payment;
    private String payment_method;
    private Date payment;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }

    public void setId_payment(String id_payment) {
        this.id_payment = id_payment;
    }

    public String getId_payment() {
        return id_payment;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment(Date payment) {
        this.payment = payment;
    }

    public Date getPayment() {
        return payment;
    }
    
    
    
}
