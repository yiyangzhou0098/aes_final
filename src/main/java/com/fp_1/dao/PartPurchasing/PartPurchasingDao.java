/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.PartPurchasing;

import java.sql.ResultSet;
import com.fp_1.model.PartPurchasing.PartPurchase;
import com.fp_1.utils.ConnectDB;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yiyangzhou
 */
public class PartPurchasingDao {

    ConnectDB util = new ConnectDB();

    public boolean add(PartPurchase partpurchase) {
        return util.update("insert into PartPurchasing(ID,PartName,Status,"
                + "WarehouseID,Number,PerPrice,ForCar,CreateTime) values(?,?,?,?,?,?,?,?)",
                partpurchase.getID(), partpurchase.getPartName(),
                partpurchase.getStatus(), partpurchase.getWarehouseID(),
                partpurchase.getNumber(), partpurchase.getPerPrice(),
                partpurchase.getForCar(), partpurchase.getCreateTime()) > 0;
    }

    public boolean delete(int id) {
        return util.update("delete from PartPurchasing where ID=?", id) > 0;
    }

    public boolean update(PartPurchase partpurchase) {
        return util.update("update PartPurchasing set PartName=?,Status=?,"
                + "WarehouseID=?,Number=?,PerPrice=?,ForCar=?,CreateTime=? where ID=?",
                partpurchase.getPartName(),
                partpurchase.getStatus(), partpurchase.getWarehouseID(),
                partpurchase.getNumber(), partpurchase.getPerPrice(),
                partpurchase.getForCar(), partpurchase.getCreateTime(),
                partpurchase.getID()) > 0;
    }

    public List<PartPurchase> QueryAll() {
        return _listpartPurchase(util.query("select * from PartPurchasing"));
    }

    public List<PartPurchase> QueryById(String id) {
        return _listpartPurchase(util.query("select * from PartPurchasing where ID like %?%", id));
    }
    
    public List<PartPurchase> QueryByCar(String forcar) {
        return _listpartPurchase(util.query("select * from PartPurchasing where ForCar like '%${forcar}%'", forcar));
    }

    public List<PartPurchase> QueryByName(String name) {
        return _listpartPurchase(util.query("select * from PartPurchasing where PartName like %${name}%", name));
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
            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listpartPurchase;
    }
}
