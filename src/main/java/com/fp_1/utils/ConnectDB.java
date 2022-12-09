/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yiyangzhou
 */
public class ConnectDB {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/connector";
    public static final String USER = "root";
    public static final String PWD = "mysql0226";
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    // init driver
    public ConnectDB() {
        try {

            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // return valid connection
    public Connection getCon() {
        try {
            con = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

    public void closeAll() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null)
          try {
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (con != null)
          try {
            con.close();
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int update(String sql, Object... pras) {
        int resu = 0;
        con = getCon();
        try {
            ps = con.prepareStatement(sql);
            if (pras != null) {
                for (int i = 0; i < pras.length; i++) {
                    ps.setObject(i + 1, pras[i]);
                }
            }
            resu = ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            closeAll();
        }
        return resu;
    }

    public ResultSet query(String sql, Object... pras) {
        con = getCon();
        try {
            ps = con.prepareStatement(sql);
            if (pras != null) {
                for (int i = 0; i < pras.length; i++) {
                    ps.setObject(i + 1, pras[i]);
                }
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        return rs;
    }

}
