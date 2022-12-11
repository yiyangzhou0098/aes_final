/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.CustomerOrder;

import com.fp_1.model.Customer.CustomerOrder;
import com.fp_1.model.UserAccount.UserAccount;
import com.fp_1.utils.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kai
 */
public class CustomerOrderDao {
   ConnectDB util = new ConnectDB();
   
    public boolean add(CustomerOrder customerorder) {
        return util.update("insert into CusOrder(OrderID,OrderStatus,CreateTime,VIN) values(?,?,?,?)",
                customerorder.getOrderID(),  
                customerorder.getCreateTime(),
                customerorder.getOrderStatus(),
                customerorder.getVIN()
                     ) > 0;
    }
    
    
    public CustomerOrder QueryByID(String identity) {
        return _customerorder(util.query("select * from CusOrder where OrderID=?", identity));
    }
    
     public List<CustomerOrder> QueryAll() {
        return _listcustomerorder(util.query("select * from CusOrder"));
    }
    
     private CustomerOrder _customerorder(ResultSet rs) {
        CustomerOrder customerorder = null;
        try {
            if (rs.next()) {
                
                customerorder = new CustomerOrder();

                customerorder.setOrderID(rs.getInt("OrderID"));
                customerorder.setOrderStatus(rs.getString("OrderStatus"));
                customerorder.setCreateTime(rs.getInt("CreateTime"));
                customerorder.setVIN(rs.getInt("VIN"));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return customerorder;
    }
     
     
      private List<CustomerOrder> _listcustomerorder(ResultSet rs) {
        List<CustomerOrder> _listcustomerorder = new ArrayList<CustomerOrder>();
        
        try {
            while (rs.next()) {
                
                CustomerOrder customerorder = new CustomerOrder();

                customerorder.setOrderID(rs.getInt("OrderID"));
                customerorder.setOrderStatus(rs.getString("OrderStatus"));
                customerorder.setCreateTime(rs.getInt("CreateTime"));
                customerorder.setVIN(rs.getInt("VIN"));
                _listcustomerorder.add(customerorder);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listcustomerorder;
    }
    
      public void deletebyID(String id){
      
          util.delete("delete from CusOrder where OrderID=?", id);
      }
      
}
