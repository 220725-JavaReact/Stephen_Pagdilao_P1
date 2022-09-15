package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

public class UserDao implements Dao<User> {

    @Override
    public User addInstance(User instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getAllInstance() {
        // TODO Auto-generated method stub
        String sql = "Select * from trainer";
        List<User> listOfUser = new ArrayList<>();

        try (Connection con = ConnectionUtil.getConnection()) {
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                listOfUser.add(new User(rs.getInt("trainid"), rs.getString("tname"), rs.getInt("totalbadges")));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }

        return listOfUser;
    }

    @Override
    public User updateInstance(User instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User deleteInstance(User instance) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
