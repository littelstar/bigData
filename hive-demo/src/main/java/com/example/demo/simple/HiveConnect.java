package com.example.demo.simple;

import java.sql.*;

/**
 * @author lpp
 * @date 2020/11/4
 */
public class HiveConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        // 获取连接 // hadoop 不允许其他类接口的访问内部的端口
        Connection connection = DriverManager.getConnection("jdbc:hive2://192.168.31.10:10000/default", "root", "");
        // 执行语句
        PreparedStatement ps = connection.prepareStatement("select * from student");
        ResultSet resultSet = ps.executeQuery();
        // 执行结果
        while (resultSet.next()) {
            System.out.println(resultSet);
            String name = resultSet.getString(1);
            String name2 = resultSet.getString(2);
            String name3 = resultSet.getString(3);
            System.out.println(name);
        }
        // 关闭
        resultSet.close();
        ps.close();
        connection.close();
    }
}


