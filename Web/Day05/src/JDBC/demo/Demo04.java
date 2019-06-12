package JDBC.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Demo04 {

    public static ArrayList<Emp> find () throws Exception {
        Connection conn = JdbcUtils.getConn();
        PreparedStatement ps = conn.prepareStatement("select * from emp");
        ResultSet rs = ps.executeQuery();
        ArrayList<Emp> list = new ArrayList<>();
        while (rs.next()){
            Emp emp = new Emp();
            emp.setId(rs.getInt("id"));
            emp.setEname(rs.getString("ename"));
            emp.setJob_id(rs.getInt("job_id"));
            emp.setMgr(rs.getInt("mgr"));

            list.add(emp);
        }
        rs.close();
        ps.close();
        conn.close();
        return list;
    }


    public static void main(String[] args) throws Exception {
        ArrayList<Emp> list = find();
        System.out.println(list.get(3).getEname());
    }
}
