import com.example.demo.SqoopApplication;
import com.example.demo.bean.SqoopBean;
import com.example.demo.serivice.SqoopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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


}
