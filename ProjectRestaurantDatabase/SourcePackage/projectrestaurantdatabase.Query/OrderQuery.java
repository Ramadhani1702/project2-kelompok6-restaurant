/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase.Query;

/**
 *
 * @author Asus
 */
public class OrderQuery {

  public String create = "INSERT INTO order_database (name, nomor_table, id_payment, payment_method, payment_date) VALUES (?, ?, ?, ?, ?)";
    
    public String get = "SELECT * FROM order_database";
    public String showById = "SELECT * FROM order_database where id = ?";
    public String showByName = "SELECT * FROM order_database where name LIKE ?";   
    
    public String update = "UPDATE order_database SET name = ?, nomor_table = ?, id_payment = ?, payment_method = ?, payment_date = ? WHERE id = ?";
    public String delete = "DELETE FROM order_database WHERE id = ?";
}


