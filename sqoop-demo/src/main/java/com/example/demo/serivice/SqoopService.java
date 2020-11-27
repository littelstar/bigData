package com.example.demo.serivice;

import com.example.demo.bean.DatabaseArgs;
import com.example.demo.bean.SqoopBean;

/**
 * @author lpp
 * @date 2020/11/26
 */
public interface SqoopService {
    /**
     * mysql到hive
     * @param jdbc mysql路径
     * @param driver 驱动器
     * @param username 数据库用户名
     * @param password 数据库密码
     * @param table 表明
     * @param m mapReduce个数
     * @param putlocation Hadoop地址
     * @return 是否成功，0：成功，1失败，
     * @throws Exception 异常
     */
    SqoopBean db2db(String jdbc, String driver, String username, String password, String table, int m, String putlocation) throws Exception;

    /**
     * 增量导入
     * @return 是否成功
     */
    SqoopBean db2dbAppend(DatabaseArgs databaseArgs);

    //mysql到hbase
    SqoopBean mysql2Hbase(String jdbc, String driver, String username, String password, String mysqlTable, String hbaseTableName, String columnFamily, String rowkey, int m) throws Exception;


}
