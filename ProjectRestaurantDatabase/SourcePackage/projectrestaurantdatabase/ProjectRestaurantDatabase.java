/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase;

import projectrestaurantdatabase.Connection.DBConnection;
import projectrestaurantdatabase.Login.MainLogin;
import projectrestaurantdatabase.MainFrame.OrderFrame;
import projectrestaurantdatabase.MainFrame.MenuFrame;



/**
 *
 * @author Asus
 */
public class ProjectRestaurantDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection con = new DBConnection();
           
         MainLogin login = new MainLogin();
         login.setVisible(true);
         
         OrderFrame order = new OrderFrame();
         order.setVisible(false);
         
         System.out.println(con.open());
         
         MenuFrame menu = new MenuFrame();
         menu.setVisible(false);
    }
    
}
