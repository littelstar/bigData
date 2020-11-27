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
    public SqoopBean sqoopTransform(String jdbc, String driver, String username, String password, String table, int m, String targetdir, String putlocation) throws Exception {
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


