/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.Dealership;

/**
 *
 * @author yiyangzhou
 */

import java.sql.ResultSet;
import com.fp_1.model.Dealership.Dealership;
import com.fp_1.model.WholeCarPurchase.CarPurchase;
import com.fp_1.utils.ConnectDB;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;

public class DealershipDao {

    ConnectDB util = new ConnectDB();

    public boolean add(Dealership dealership) {
        return util.update("insert into Dealership(DriveType,Car,EngineType,Transmission,Price,Location,Photopath,VIN) values(?,?,?,?,?,?,?,?)",
                dealership.getDriveType(),dealership.getCar(),dealership.getEngineType(),
                dealership.getTransmission(),dealership.getPrice(),dealership.getLocation(),dealership.getPhotopath(),
                dealership.getVIN()
                ) > 0;
    }

    public boolean delete(int id) {
        return util.update("delete from Dealership where ID=?", id) > 0;
    }

    public boolean update(Dealership dealership) {
        return util.update("update Dealership set DriveType=?,Car=?,EngineType=?,Transmission=?,Price=?,Location=?,Photopath=?,VIN=? where ID=?",
                dealership.getDriveType(),dealership.getCar(),dealership.getEngineType(),
                dealership.getTransmission(),dealership.getPrice(),dealership.getLocation(),dealership.getPhotopath(),
                dealership.getVIN(),dealership.getID()
                ) > 0;
    }

    public List<Dealership> QueryAll() {
        return _listdealership(util.query("select * from Dealership"));
    }
    
    public Dealership QueryByVIN(int VIN) {
        return _dealership(util.query("select * from Dealership where VIN=?", VIN));
    }

    public Dealership QueryById(int id) {
        return _dealership(util.query("select * from Dealership where ID=?", id));
    }
    
    public List<Dealership> QueryByCar(String car) {
        return _listdealership(util.query("select * from Dealership where Car like concat('%',?,'%')", car));
    }
    
    public List<Dealership> QueryByPriceBigger(int price) {
        return _listdealership(util.query("select * from Dealership where price >= ?", price));
    }
    
    public List<Dealership> QueryByPriceSmaller(int price) {
        return _listdealership(util.query("select * from Dealership where price <= ?", price));
    }

//    public List<Assemble> QueryByName(String name) {
//        return _listassemble(util.query("select * from Assemble where PartName like concat('%',?,'%')", name));
//    }
//
    private Dealership _dealership(ResultSet rs) {
        Dealership dealership = null;
        try {
            if (rs.next()) {
                dealership = new Dealership();
                dealership.setVIN(rs.getInt("VIN"));
                dealership.setPhotopath(rs.getString("Photopath"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return dealership;
    }
//
    private List<Dealership> _listdealership(ResultSet rs) {
        List<Dealership> _listdealership = new ArrayList<Dealership>();
        try {
            while (rs.next()) {
                Dealership dealership = new Dealership();
                dealership.setDriveType(rs.getString("DriveType"));
                dealership.setCar(rs.getString("Car"));
                dealership.setEngineType(rs.getString("EngineType"));
                dealership.setTransmission(rs.getString("Transmission"));
                dealership.setPrice(rs.getFloat("Price"));
                dealership.setLocation(rs.getString("Location"));
                dealership.setPhotopath(rs.getString("Photopath"));
                dealership.setVIN(rs.getInt("VIN"));
            
                _listdealership.add(dealership);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listdealership;
    }
}

