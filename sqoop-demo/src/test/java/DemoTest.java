import com.example.demo.SqoopApplication;
import com.example.demo.bean.DatabaseArgs;
import com.example.demo.bean.SqoopBean;
import com.example.demo.serivice.SqoopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lpp
 * @date 2020/11/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SqoopApplication.class)
public class DemoTest {
    @Autowired
    SqoopService sqoopService;

    @Test
    public void test() throws Exception {
        String jdbc = "jdbc:mysql://210.14.158.133:6033/isc-admin";
        String driver = "com.mysql.jdbc.Driver";
        String username = "lipeipei";
        String password = "lipeipei";
        String table = "data_item";
        int m = 1;
        String targetdir = "/root/data_item";
        String putlocation = "hdfs://192.168.31.133:9000";
        System.setProperty("hadoop.home.dir", "F:\\hadoop-3.3.0");
        // System.setProperty("HADOOP_USER_NAME", "root");
        // System.load("F:\\hadoop-3.3.0/bin/hadoop.dll");
        SqoopBean sqoopBean = sqoopService.db2db(jdbc, driver, username, password, table, m, putlocation);
        System.out.println(sqoopBean.getI() + "结果");
    }
    @Test
    public void test2() throws Exception {
        String jdbc = "jdbc:mysql://210.14.158.133:6033/isc-admin";
        String driver = "com.mysql.jdbc.Driver";
        String username = "lipeipei";
        String password = "lipeipei";
        String table = "data_item";
        int m = 1;
        String targetdir = "/root/data_item";
        String putlocation = "hdfs://192.168.31.133:9000";
        System.setProperty("hadoop.home.dir", "F:\\hadoop-3.3.0");
        String column = "id";
        String value = "86";
        DatabaseArgs databaseArgs = new DatabaseArgs(jdbc,driver,username,password,table,m,putlocation,column,value);
        databaseArgs.setDriver(driver);
        databaseArgs.setJdbc(jdbc);
        databaseArgs.setUsername(username);
        databaseArgs.setPassword(password);

        // System.setProperty("HADOOP_USER_NAME", "root");
        // System.load("F:\\hadoop-3.3.0/bin/hadoop.dll");
        SqoopBean sqoopBean = sqoopService.db2dbAppend(databaseArgs);
        System.out.println(sqoopBean.getI() + "结果");
    }

    @Test
    public void test3(){
        String rule="^[" +
                "\\u4E00-\\u9FA5" +
                "\\uf900-\\ufa2d" +
                "\\u9FA6-\\u9FCB" +
                "\\u3400-\\u4DB5" +
                "\\u20000-\\u2A6D6" +
                "\\u2A700-\\u2B734" +
                "\\u2B740-\\u2B81D" +
                "\\u2F00-\\u2FD5" +
                "\\u2E80-\\u2EF3" +
                "\\uF900-\\uFAD9" +
                "\\u2F800-\\u2FA1D" +
                "\\uE815-\\uE86F" +
                "\\uE400-\\uE5E8" +
                "\\uE600-\\uE6CF" +
                "\\u31C0-\\u31E3" +
                "\\u2FF0-\\u2FFB" +
                "\\u3105-\\u3120" +
                "\\u31A0-\\u31BA" +
                "·s]{1,30}$";

        String str = "攮";

        Pattern r = Pattern.compile(rule);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

}
