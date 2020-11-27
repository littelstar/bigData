import com.cloudera.sqoop.tool.SqoopTool;
import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;

import java.io.IOException;

/**
 * @author ZD
 */
public class SimpleTest2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("HADOOP_USER_NAME", "root");
        System.out.println(" begin test sqoop");
        System.setProperty("hadoop.home.dir", "F:\\hadoop-3.3.0");
        String[] argument = new String[]{
                "--connect","jdbc:mysql://210.14.158.133:6033/isc-admin",
                " -username","lipeipei",
                " -password","lipeipei",
                " --table","role",
                " --hive-import",
                " -m","-1",
                " --create-hive-table"};
        SqoopTool sqoopTool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.31.133:9000");
        Sqoop sqoop = new Sqoop(sqoopTool, SqoopTool.loadPlugins(conf));
        int i = Sqoop.runSqoop(sqoop, argument);
        System.out.println("结果" + i);
    }

}