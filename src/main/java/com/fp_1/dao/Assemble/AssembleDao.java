/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.Assemble;

import java.sql.ResultSet;
import com.fp_1.model.Assemble.Assemble;
import com.fp_1.utils.ConnectDB;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yiyangzhou
 */
public class AssembleDao {

    ConnectDB util = new ConnectDB();

    public boolean add(Assemble assemble) {
        return util.update("insert into Assemble(Status,CreateTime,Car) values(?,?,?)",
                assemble.getStatus(), assemble.getCreateTime(), assemble.getCar()) > 0;
    }

    public boolean delete(int id) {
        return util.update("delete from Assemble where AssembleID=?", id) > 0;
    }

    public boolean update(Assemble assemble) {
        return util.update("update Assemble set Status=?,CreateTime=?,Car=? where AssembleID=?",
                assemble.getStatus(),assemble.getCreateTime(), assemble.getCar(), assemble.getAssembleID()) > 0;
    }

    public List<Assemble> QueryAll() {
        return _listassemble(util.query("select * from Assemble"));
    }

    public List<Assemble> QueryById(String id) {
        return _listassemble(util.query("select * from Assemble where ID like concat('%',?,'%')", id));
    }
    
    public List<Assemble> QueryByCar(String car) {
        return _listassemble(util.query("select * from Assemble where Car like concat('%',?,'%')", car));
    }

//    public List<Assemble> QueryByName(String name) {
//        return _listassemble(util.query("select * from Assemble where PartName like concat('%',?,'%')", name));
//    }

    private Assemble _assemble(ResultSet rs) {
        Assemble assemble = null;
        try {
            if (rs.next()) {
                assemble = new Assemble();
                assemble.setCar(rs.getString("Car"));
                assemble.setCreateTime(rs.getDate("CreateTime"));
                assemble.setStatus(rs.getShort("Status"));
//                assemble.setAssembleID(rs.getInt("AssembleID"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return assemble;
    }

    private List<Assemble> _listassemble(ResultSet rs) {
        List<Assemble> _listassemble = new ArrayList<Assemble>();
        try {
            while (rs.next()) {
                Assemble assemble = new Assemble();
                assemble.setAssembleID(rs.getInt("AssembleID"));
                assemble.setStatus(rs.getShort("Status"));
                assemble.setCreateTime(rs.getDate("CreateTime"));
                assemble.setCar(rs.getString("Car"));

                _listassemble.add(assemble);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listassemble;
    }
}

