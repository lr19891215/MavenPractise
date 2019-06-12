package JDBC.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象 指定链接数据库ip地址 用户名 密码
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
        //3.Connection对象作用 :执行对象  管理事务
        //String sql = "update dept set loc='武汉' where id=40 ";
        //4.根据类型执行sql并获得返回值  1 insert update delete [create dret]   2 select
       // PreparedStatement ps = conn.prepareStatement(sql);
        //int i = ps.executeUpdate();
        //System.out.println(i);
        String sql = "insert into dept VALUES (50,'研发部','深圳')";
        PreparedStatement ps = conn.prepareStatement(sql);
        int i = ps.executeUpdate();
        System.out.println(i);
        //5.释放资源
        ps.close();
        conn.close();
    }
}
