package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource ds;
    static {
        try {
//          读取配置文件
            Properties pro = new Properties();
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
//          创建数据连接池
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource() {
        return ds;
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
