package com.example.demo.serivice.impl;

import com.example.demo.bean.DatabaseArgs;
import com.example.demo.bean.SqoopBean;
import com.example.demo.serivice.SqoopService;
import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @author lpp
 * @date 2020/11/26
 */
@Service
public class SqoopServiceImpl implements SqoopService {
    @Override
    public SqoopBean db2db(String jdbc, String driver, String username, String password, String table, int m, String putlocation) throws Exception {

        //bindir配置classs文件地址，否则会报错：ClassNotFound
        String[] args = new String[]{
                "--connect", jdbc,
                "--driver", driver,
                "-username", username,
                "-password", password,
                "--table", table,
                "-m", String.valueOf(m),
                "--bindir", "./target/classes",
        };

        SqoopBean sqoopBean = new SqoopBean();
        String[] expandArguments = OptionsFileUtil.expandArguments(args);
        SqoopTool tool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        conf.set("fs.default.name", putlocation);//设置HDFS服务地址
        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        int i1 = Sqoop.runSqoop(sqoop, expandArguments);
        int i = sqoopBean.setI(i1);
        Timestamp ts = sqoopBean.setTs(new Timestamp(System.currentTimeMillis()));
        // map.put("result",Sqoop.runSqoop(sqoop,expandArguments));  map.put("time",new Timestamp(new Date().getTime()));

        return sqoopBean;


    }

    /**
     * 增量导入
     *
     * @return 是否成功
     */
    @Override
    public SqoopBean db2dbAppend(DatabaseArgs databaseArgs) {
        //bindir配置classs文件地址，否则会报错：ClassNotFound
        String[] args = new String[]{
                "--connect", databaseArgs.getJdbc(),
                "--driver", databaseArgs.getDriver(),
                "-username", databaseArgs.getUsername(),
                "-password", databaseArgs.getPassword(),
                "--table", databaseArgs.getTable(),
                "-m", String.valueOf(databaseArgs.getM()),
                "--incremental", "append",
                "--bindir", "./target/classes",
                "--check-column", "order_id",
                "--last-value", "12"
        };

        SqoopBean sqoopBean = new SqoopBean();
        String[] expandArguments = new String[0];
        try {
            expandArguments = OptionsFileUtil.expandArguments(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SqoopTool tool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        //设置HDFS服务地址
        conf.set("fs.default.name", databaseArgs.getPutlocation());
        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        int i1 = Sqoop.runSqoop(sqoop, expandArguments);
        int i = sqoopBean.setI(i1);
        Timestamp ts = sqoopBean.setTs(new Timestamp(System.currentTimeMillis()));
        return sqoopBean;
    }

    //mysql到hbase
    @Override
    public SqoopBean mysql2Hbase(String jdbc, String driver, String username, String password, String mysqlTable, String hbaseTableName, String columnFamily, String rowkey, int m) throws Exception {
        String[] args = new String[]{
                "--connect", jdbc,
                "--driver", driver,
                "-username", username,
                "-password", password,
                "--table", mysqlTable,
                "--hbase-table", hbaseTableName,
                "--column-family", columnFamily,
                "--hbase-create-table",
                "--hbase-row-key", rowkey,
                "-m", String.valueOf(m),
        };
        SqoopBean sqoopBean = new SqoopBean();
        String[] expandArguments = OptionsFileUtil.expandArguments(args);
        SqoopTool tool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        int i = sqoopBean.setI(Sqoop.runSqoop(sqoop, expandArguments));
        Timestamp ts = sqoopBean.setTs(new Timestamp(System.currentTimeMillis()));
        return sqoopBean;
    }
}
