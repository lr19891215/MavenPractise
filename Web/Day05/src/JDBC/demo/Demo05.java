package JDBC.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入帐号:");
        String user = sc.nextLine();
        System.out.println("输入密码:");
        String pwd = sc.nextLine();

        String sql = "select * from t2 where name =? and pwd = ?";
        Connection conn = JdbcUtils.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,user);
        ps.setString(2, pwd);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("登陆中,请稍后...");
        }else {
            System.out.println("帐号或密码错误");
        }
        rs.close();
        ps.close();
        conn.close();
    }
}
