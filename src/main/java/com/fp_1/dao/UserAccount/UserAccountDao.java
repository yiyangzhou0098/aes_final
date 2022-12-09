/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.dao.UserAccount;

import com.fp_1.model.UserAccount.UserAccount;
import com.fp_1.utils.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kai
 */
public class UserAccountDao {
    ConnectDB util = new ConnectDB();
    public boolean add(UserAccount useraccount) {
        return util.update("insert into UserAccount(UserName,UserPassword,UserIdentity) values(?,?,?)",
                useraccount.getUserName(),
                useraccount.getUserPassword(), 
                useraccount.getUserIdentity()) > 0;
    }
    
    public UserAccount QueryById(String username) {
        return _useraccount(util.query("select * from UserAccount where UserName=?", username));
    }
    
    public UserAccount QueryByName(String identity) {
        return _useraccount(util.query("select * from UserAccount where UserIdentity=?", identity));
    }
    
     public List<UserAccount> QueryAll() {
        return _listuseraccount(util.query("select * from UserAccount"));
    }
    
    public boolean isUsernameExist(String username){
        if (_useraccount(util.query("select * from UserAccount where UserName=?", username))!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private UserAccount _useraccount(ResultSet rs) {
        UserAccount useraccount = null;
        try {
            if (rs.next()) {
                
                useraccount = new UserAccount();
                useraccount.setUserName(rs.getString("UserName"));
                useraccount.setUserPassword(rs.getString("UserPassword"));
                useraccount.setUserIdentity(rs.getString("UserIdentity"));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return useraccount;
    }
    
        private List<UserAccount> _listuseraccount(ResultSet rs) {
        List<UserAccount> _listuseraccount = new ArrayList<UserAccount>();
        try {
            while (rs.next()) {
                UserAccount useraccount = new UserAccount();
                useraccount.setUserName(rs.getString("UserName"));
                useraccount.setUserPassword(rs.getString("UserPassword"));
                useraccount.setUserIdentity(rs.getString("UserIdentity"));
                _listuseraccount.add(useraccount);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } finally {
            util.closeAll();
        }
        return _listuseraccount;
    }
}
