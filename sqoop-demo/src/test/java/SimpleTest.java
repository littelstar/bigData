import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.manager.ConnManager;
import com.cloudera.sqoop.metastore.JobData;
import com.cloudera.sqoop.tool.SqoopTool;
import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.ConnFactory;
import org.apache.sqoop.Sqoop;

import java.io.IOException;
import java.util.UUID;

/**
 * @author ZD
 */
public class SimpleTest {
    public static void main(String[] args) throws IOException {

        System.setProperty("hadoop.home.dir", "F:\\hadoop-3.3.0");
        System.setProperty("HADOOP_USER_NAME", "root");
        String hiveTableName = "shedlock";
        String querySql="select * from shedlock where name is not null and $CONDITIONS";
        SqoopTool sqoopTool = SqoopTool.getTool("import");
        SqoopOptions sqoopOptions = new SqoopOptions();
        sqoopOptions.setConnectString("jdbc:mysql://210.14.158.133:6033/isc-admin");
        sqoopOptions.setUsername("lipeipei");
        sqoopOptions.setPassword("lipeipei");
        sqoopOptions.setNumMappers(1);
        sqoopOptions.setNullStringValue("\\\\N");
        sqoopOptions.setNullNonStringValue("\\\\N");
        sqoopOptions.setFieldsTerminatedBy('\001');
        sqoopOptions.setTargetDir("/data/hive/warehouse/" + hiveTableName.toLowerCase());
        sqoopOptions.setCodeOutputDir("sqoopjavafile");
        sqoopOptions.setJarOutputDir("sqoopcompilefile/" + UUID.randomUUID().toString() + "/");
        sqoopOptions.setHiveDropDelims(true);
        sqoopOptions.setSqlQuery(querySql);
        sqoopOptions.setAppendMode(true);
        sqoopOptions.setClassName(hiveTableName + UUID.randomUUID().toString());
        sqoopOptions.setSqlQuery(querySql);
        sqoopOptions.setAppendMode(true);
        sqoopOptions.setClassName(hiveTableName + UUID.randomUUID().toString());
        Configuration conf= new Configuration();
        conf.set("fs.defaultFS","hdfs://192.168.31.133:9000");
        Sqoop sqoop = new Sqoop(sqoopTool, SqoopTool.loadPlugins(conf), sqoopOptions);
        int i = Sqoop.runSqoop(sqoop, new String[]{});
        System.out.println("结果"+i);

        //
        // ConnFactory connFactory = new ConnFactory(conf);
        // JobData jobData = new JobData();
        // jobData.setSqoopOptions(sqoopOptions);
        // ConnManager manager = connFactory.getManager(jobData);
        // manager.


    }
}