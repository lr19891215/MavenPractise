package JDBC;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = Demo02.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(in);

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        System.out.println(dataSource.getConnection());
    }
}
