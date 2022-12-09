/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.PartSelling;

import com.fp_1.model.PartPurchasing.PartPurchase;
import com.fp_1.utils.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kai
 */
public class PartSellingDao {
    
ConnectDB util = new ConnectDB();

    public boolean add(PartPurchase partpurchase) {
        return util.update("insert into PartSelling(ID,PartName,Status,"
                + "WarehouseID,Number,PerPrice,ForCar,CreateTime) values(?,?,?,?,?,?,?,?)",
                partpurchase.getID(), partpurchase.getPartName(),
                partpurchase.getStatus(), partpurchase.getWarehouseID(),
                partpurchase.getNumber(), partpurchase.getPerPrice(),
                partpurchase.getForCar(), partpurchase.getCreateTime()) > 0;
    }

    public PartPurchase QueryById(int id) {
        return _partPurchase(util.query("select * from PartSelling where ID=?", id));
    }
    
    public PartPurchase QueryByName(String name) {
        return _partPurchase(util.query("select * from PartSelling where PartName=?", name));
    }

    private PartPurchase _partPurchase(ResultSet rs) {
        PartPurchase partPurchase = null;
        try {
            if (rs.next()) {
                partPurchase = new PartPurchase();
                partPurchase.setID(rs.getInt("ID"));
                partPurchase.setPartName(rs.getString("PartName"));
                partPurchase.setStatus(rs.getShort("Status"));
                partPurchase.setWarehouseID(rs.getInt("WarehouseID"));
                partPurchase.setNumber(rs.getInt("Number"));
                partPurchase.setPerPrice(rs.getInt("PerPrice"));
                partPurchase.setForCar(rs.getString("ForCar"));
                partPurchase.setCreateTime(rs.getDate("CreateTime"));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return partPurchase;
    }
          
    private List<PartPurchase> _listpartPurchase(ResultSet rs) {
        List<PartPurchase> _listpartPurchase = new ArrayList<PartPurchase>();
        try {
            while (rs.next()) {
                PartPurchase partPurchase = new PartPurchase();
                partPurchase = new PartPurchase();
                partPurchase.setID(rs.getInt("ID"));
                partPurchase.setPartName(rs.getString("PartName"));
                partPurchase.setStatus(rs.getShort("Status"));
                partPurchase.setWarehouseID(rs.getInt("WarehouseID"));
                partPurchase.setNumber(rs.getInt("Number"));
                partPurchase.setPerPrice(rs.getInt("PerPrice"));
                partPurchase.setForCar(rs.getString("ForCar"));
                partPurchase.setCreateTime(rs.getDate("CreateTime"));
                _listpartPurchase.add(partPurchase);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listpartPurchase;
    }
}

