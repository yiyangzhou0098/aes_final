/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.WholeCarPurchase;

import com.fp_1.model.Dealership.Dealership;
import com.fp_1.model.WholeCarPurchase.CarPurchase;

import com.fp_1.utils.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiyangzhou
 */
public class CarPurchaseDao {
    ConnectDB util = new ConnectDB();

    public boolean add(CarPurchase carPurchase) {
        return util.update("insert into CarPurchase(Username,CreateTime,VIN,OrderStatus,Address1,Address2,Shipment) values(?,?,?,?,?,?,?)",
                carPurchase.getUserName(), carPurchase.getCreateTime(), carPurchase.getVIN(),carPurchase.getOrderStatus(),
                carPurchase.getAddress1(),carPurchase.getAddress2(),carPurchase.getShipment()) > 0;
    }

    public boolean delete(int id) {
        return util.update("delete from CarPurchase where OrderID=?", id) > 0;
    }

    public boolean update(CarPurchase carPurchase) {
        return util.update("update CarPurchase set UserName=?,CreateTime=?,VIN=?,OrderStatus=?,Address1=?,Address2=?,shipment=? where OrderID=?",
                carPurchase.getUserName(),carPurchase.getCreateTime(), carPurchase.getVIN(),carPurchase.getOrderStatus(), carPurchase.getOrderID(),
                carPurchase.getAddress1(),carPurchase.getAddress2(),carPurchase.getShipment()) > 0;
    }
    
    public boolean updateEdit(CarPurchase carPurchase) {
        return util.update("update CarPurchase set Address1=?,Address2=?,Shipment=? where OrderID=?",
                carPurchase.getAddress1(),carPurchase.getAddress2(), carPurchase.getShipment(),carPurchase.getOrderID()) > 0;
    }
    
    
    
    public List<CarPurchase> QueryAll() {
        return _listcarPurchase(util.query("select * from CarPurchase"));
    }
    
    public List<CarPurchase> QueryByUser(String username) {
        return _listcarPurchase(util.query("select * from CarPurchase where UserName=?", username));
    }
    
    public CarPurchase QueryByOrder(int orderid) {
        return _carPurchase(util.query("select * from CarPurchase where OrderID=?", orderid));
    }

//    public List<Assemble> QueryById(String id) {
//        return _listassemble(util.query("select * from Assemble where ID like concat('%',?,'%')", id));
//    }
//    
//    public List<Assemble> QueryByCar(String car) {
//        return _listassemble(util.query("select * from Assemble where Car like concat('%',?,'%')", car));
//    }

//    public List<Assemble> QueryByName(String name) {
//        return _listassemble(util.query("select * from Assemble where PartName like concat('%',?,'%')", name));
//    }

    private CarPurchase _carPurchase(ResultSet rs) {
        CarPurchase carPurchase = null;
        try {
            if (rs.next()) {
                carPurchase = new CarPurchase();
                carPurchase.setAddress1(rs.getString("Address1"));
                carPurchase.setAddress2(rs.getString("Address2"));
                carPurchase.setShipment(rs.getString("Shipment"));
//                assemble.setAssembleID(rs.getInt("AssembleID"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return carPurchase;
    }

    private List<CarPurchase> _listcarPurchase(ResultSet rs) {
        List<CarPurchase> _listcarPurchase = new ArrayList<CarPurchase>();
        try {
            while (rs.next()) {
                CarPurchase carPurchase = new CarPurchase();
                carPurchase.setUserName(rs.getString("UserName"));
                carPurchase.setVIN(rs.getShort("VIN"));
                carPurchase.setCreateTime(rs.getDate("CreateTime"));
                carPurchase.setOrderStatus(rs.getString("OrderStatus"));
                carPurchase.setOrderID(rs.getShort("OrderID"));
                carPurchase.setAddress1(rs.getString("Address1"));
                carPurchase.setAddress2(rs.getString("Address2"));
                carPurchase.setShipment(rs.getString("Shipment"));

                _listcarPurchase.add(carPurchase);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listcarPurchase;
    }
}
