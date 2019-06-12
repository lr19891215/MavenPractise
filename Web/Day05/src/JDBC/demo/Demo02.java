package JDBC.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
        String sql = "SELECT * from dept";
        PreparedStatement ps = conn.prepareStatement(sql);
        //查询结果封装在ResultSet中
        ResultSet rs = ps.executeQuery();
        //通过next方法读取对应的行,一次读一行
        while (rs.next()){
            System.out.print(rs.getInt(1) + "--");
            System.out.print(rs.getString(2)+ "--");
            System.out.println(rs.getString(3));
        }
        //数据读取方法1:通过下标和对应的字段数据类型读取数据[下标从1开始]
        //String string = rs.getString(2);
        //System.out.println(string);
        //数据读取方法2:通过字段名和对应的字段数据类型读取数据[下标从1开始]
        //String dname = rs.getString("dname");
        //System.out.println(dname);
        rs.close();
        ps.close();
        conn.close();
    }
}
