package JDBC;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Demo03 {
    public static void main(String[] args) {
        JdbcTemplate jdbc = new JdbcTemplate(Utile.getDataSource());
        //修改数据
        String sql1 = "update emp set salary=? where id=?";
        jdbc.update(sql1,10000,1001);
        //添加数据
        String sql2 = "insert into emp (id,ename,job_id) value (?,?,?)";
        jdbc.update(sql2,1015,"黄忠",4);
        //删除数据
        String sql3 = "delete from emp where id=?";
        jdbc.update(sql3,1015);
        //查询1001封装为Map集合
        String sql4 = "select * from emp where id=?";
        Map<String, Object> map = jdbc.queryForMap(sql4, 1001);
        System.out.println(map);
        //查询所有记录,封装为list,每一条封装为map,map装载到list集合中
        String sql5 = "select * from emp";
        List<Map<String, Object>> maps = jdbc.queryForList(sql5);
        for (Map<String, Object> stringObjectMap : maps) {
            System.out.println(stringObjectMap);
        }
        //查询所有记录,封装为Emp对象的list集合
        String sql6 = "select * from emp";
        List<Emp> list = jdbc.query(sql6, new BeanPropertyRowMapper<>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
        //查询总记录数
        String sql7 = "select count(id) from emp";
        Long l = jdbc.queryForObject(sql7, Long.class);
        System.out.println(l);
    }
}
