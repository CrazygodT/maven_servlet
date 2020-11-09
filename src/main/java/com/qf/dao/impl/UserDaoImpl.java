package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    ResultSet result = null;
    Connection con = null;
    Statement statement = null;

    @Override
    public List<User> findAll() {

        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomishop","root","root");

            // 创建连接对象
            statement = con.createStatement();

            // 执行sql
            String sql = "select * from users where 1 = 1";
            result = statement.executeQuery(sql);
            // 创建集合
            List userlist = new ArrayList();
            // 解析返回值
            while(result.next()) {
                User user = new User();
                user.setUid(result.getInt("u_id"));
                user.setUname(result.getString("u_name"));
                user.setUpass(result.getString("u_pass"));
                user.setGender(result.getString("gender"));
                user.setEmail(result.getString("email"));
                user.setFlag(result.getInt("flag"));
                userlist.add(user);
            }
            return userlist;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User findById(int uid) {

        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomishop","root","root");
            // 3.创建连接对象
            statement = con.createStatement();
            // 执行sql
            String sql = "select * from users where u_id = "+uid;
            result = statement.executeQuery(sql);

            // 声明返回的对象
            User user = new User();

            // 解析返回对象
            while(result.next()) {
                user.setUid(result.getInt("u_id"));
                user.setUname(result.getString("u_name"));
                user.setUpass(result.getString("u_pass"));
                user.setGender(result.getString("gender"));
                user.setEmail(result.getString("email"));
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Boolean deleteById(int uid) {

        PreparedStatement preparedStatement = null;
        try {
            // 创建数据库连接
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomishop","root","root");
            String sql = "delete from users where u_id = ?";
            // 预编译sql
            preparedStatement = con.prepareStatement(sql);
            // 给占位符进行赋值
            preparedStatement.setObject(1,uid);

            // 执行sql
            int i = preparedStatement.executeUpdate();

            // 解析参数结果
            if (i>0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Boolean update(User user) {

        PreparedStatement preparedStatement = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaomishop?characterEncoding=utf8","root","root");
            String sql = "update users set u_name = ?, u_pass = ?, gender = ?, email = ? where u_id = ?";
            // 预编译sql
            preparedStatement = con.prepareStatement(sql);
            // 给问号传值
            preparedStatement.setObject(1,user.getUname());
            preparedStatement.setObject(2,user.getUpass());
            preparedStatement.setObject(3,user.getGender());
            preparedStatement.setObject(4,user.getEmail());
            preparedStatement.setObject(5,user.getUid());

            // 执行sql
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
