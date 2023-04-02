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
public class UserQuery {
    public String login = "SELECT * FROM users WHERE "
            + "username = ? AND password = ?";
}
