package JDBC;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Utile {
    private static DataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            InputStream in = Utile.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(in);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
            return dataSource.getConnection();

    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
