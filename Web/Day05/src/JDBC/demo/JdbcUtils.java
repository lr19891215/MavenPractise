package JDBC.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JdbcUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String pwd;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("cfg");
        driver = rb.getString("driver");
        url = rb.getString("url");
        user = rb.getString("user");
        pwd = rb.getString("pwd");
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
