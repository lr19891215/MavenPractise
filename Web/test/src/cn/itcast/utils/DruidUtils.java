package cn.itcast.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;


public class DruidUtils {

    private static DataSource ds;

    static {

        try {
            InputStream in = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties pro = new Properties();
            pro.load(in);

            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


    public static DataSource getDs() {
        return ds;
    }



}
