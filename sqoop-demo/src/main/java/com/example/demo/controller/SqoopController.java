package com.example.demo.controller;


import com.example.demo.bean.SqoopBean;
import com.example.demo.serivice.SqoopService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SqoopController {
    @Resource
    private SqoopService ss;

    @RequestMapping("/hi")
    public String get() {
        return "你好";
    }

    //数据从mysql到hdfs
    @PostMapping("/mysql2hdfs")
    @ResponseBody
    public SqoopBean sqoopTransform() throws Exception {
        String jdbc = "jdbc:mysql://210.14.158.133:6033/isc-admin";
        String driver = "com.mysql.jdbc.Driver";
        String username = "lipeipei";
        String password = "lipeipei";
        String table = "shedlock";
        int m = 1;
        String targetdir = "/root/data_item";
        String putlocation = "hdfs://192.168.31.133:9000";
        // System.setProperty("hadoop.home.dir", "F:\\hadoop-3.3.0");
        // System.setProperty("hive.home.dir","F:\\apache-hive-3.1.2-bin");
        System.setProperty("HADOOP_USER_NAME", "root");
        // System.setProperty("sqoop.home.dir","F:\\sqoop-1.4.7");
        // System.load("F:\\hadoop-3.3.0/bin/hadoop.dll");
        // SqoopBean sqoopBean = sqoopService.db2db(jdbc, driver, username, password, table, m, putlocation);
        return ss.db2db(jdbc, driver, username, password, table, m, putlocation);
        //返回0正确，返回1错误
    }

    //数据从mysql到hbase
    @PostMapping("/mysql2hbase")
    @ResponseBody
    public SqoopBean transformMysql2Hbase(String jdbc, String driver, String username, String password, String mysqlTable, String hbaseTableName, String columnFamily, String rowkey, int m) throws Exception {
        return ss.mysql2Hbase(jdbc, driver, username, password, mysqlTable, hbaseTableName, columnFamily, rowkey, m);
    }


}


