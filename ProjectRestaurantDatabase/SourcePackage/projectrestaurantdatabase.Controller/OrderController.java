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
import projectrestaurantdatabase.Model.OrderModel;
import projectrestaurantdatabase.Query.OrderQuery;

/**
 *
 * @author Asus
 */
public class OrderController extends BaseController {
    
    Helper helper = new Helper();
    OrderQuery query = new OrderQuery();
    
    public boolean create(OrderModel model) throws ParseException {
        String date = helper.parseDateToString(model.getPayment());
        
        Map<Integer, Object> map = new HashMap<>();
        
        map.put(1, model.getName());
        map.put(2, model.getTable());
        map.put(3, model.getId_payment());
        map.put(4, model.getPayment_method());
        map.put(5, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    public ResultSet get(){
        String sql = this.query.get;
        return this.get(sql);  
    }
    
    public ResultSet showById(String id){
      String sql = this.query.showById;
      
      Map<Integer, Object> map = new HashMap<>();
      map.put(1, id);
      
      return this.getWithParameter(map, sql);
    }
    
    public ResultSet showByName(String name){
      String sql = this.query.showByName;
      
      Map<Integer, Object> map = new HashMap<>();
      map.put(1, helper.parseLikeQuery(name));
      
      return this.getWithParameter(map, sql);
    }
    public boolean update(String id, OrderModel model) throws ParseException {
        String date = helper.parseDateToString(model.getPayment());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getTable());
        map.put(3, model.getId_payment());
        map.put(4, model.getPayment_method());
        map.put(5, date);
        map.put(6, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
    
}


