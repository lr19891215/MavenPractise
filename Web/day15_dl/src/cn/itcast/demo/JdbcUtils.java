package cn.itcast.demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource ds;
    static {
        try {
//          读取配置文件
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties pro = new Properties();
            pro.load(is);
//          创建数据连接池
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDs() {
        return ds;
    }
}
