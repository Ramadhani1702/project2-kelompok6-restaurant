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
public class MenuQuery {
    
     public String create = "INSERT INTO menu_database (name, ayam_bakar, ikan_goreng, sushi"
             + ", tongseng, es_teh, jus_alpukat, thai_tea, matcha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    public String get = "SELECT * FROM menu_database";
    public String showById = "SELECT * FROM menu_database where id = ?";
    
    public String delete = "DELETE FROM menu_database WHERE id = ?";
}

