package JDBC.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入页数:");
        int num = sc.nextInt();

        String sql = "select * from customer limit ?,5";
        Connection conn = JdbcUtils.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, (num-1)*5);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.print(rs.getInt(1) + "  ");
            System.out.print(rs.getString(2) + "  ");
            System.out.print(rs.getDate(3) + "  ");
            System.out.println(rs.getInt(4));
        }
        rs.close();
        ps.close();
        conn.close();
    }
}
