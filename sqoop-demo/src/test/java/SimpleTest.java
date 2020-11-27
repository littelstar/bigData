import com.cloudera.sqoop.SqoopOptions;
import org.apache.sqoop.tool.ImportTool;

import java.io.IOException;

/**
 * @author ZD
 */
public class SimpleTest {
    public static void main(String[] args) throws IOException {
        SqoopOptions options = new SqoopOptions();
        options.setConnectString("jdbc:mysql://210.14.158.133:6033/isc-admin");
        options.setUsername("lipeipei");
        options.setPassword("lipeipei");
        options.setSqlQuery("SELECT * FROM role WHERE $CONDITIONS limit 10");
        // options.setSplitByCol("log_id")
        // sqoop import --connect jdbc:mysql://210.14.158.133:6033/isc-admin --username lipeipei --password lipeipei --table data_item --hive-import -m 1
        options.setHiveImport(true);
        options.setHiveTableName("role1");
        // HBase options
        // options.setHBaseTable("role1");
        // options.setHBaseColFamily("colFamily");
        // options.setCreate;    // Create HBase table, if it does not exist
        // options.setHBaseRowKeyColumn("log_id");
        int ret = new ImportTool().run(options);
        System.out.println("结果"+ret);

    }
}