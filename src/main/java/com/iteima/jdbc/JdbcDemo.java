package com.iteima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {
    public static void main(String[] args)  throws  Exception{
        //1注册驱动
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //2获取链接
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true","root","root");
        //3获取操作数据库的预处理对象
        PreparedStatement pstm= conn.prepareStatement("select * from account");
        //4执行SQL得到结果集
        ResultSet rs=pstm.executeQuery();
        //5遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        pstm.close();
        conn.close();
    }
}
