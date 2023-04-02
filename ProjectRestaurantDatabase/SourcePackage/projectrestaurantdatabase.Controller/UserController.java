/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import projectrestaurantdatabase.Helper.Helper;
import projectrestaurantdatabase.Model.UserModel;
import projectrestaurantdatabase.Query.UserQuery;

/**
 *
 * @author Asus
 */
public class UserController extends BaseController {
    
    Helper helper = new Helper();
    UserQuery query = new UserQuery();
    
    public ResultSet login(UserModel model) {
        String sql = this.query.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
        map.put(2, model.getPassword());
        
        return this.getWithParameter(map, sql);
    }
}
    

