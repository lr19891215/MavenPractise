package JDBC;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        JdbcTemplate jdbc = new JdbcTemplate(Utile.getDataSource());
        String sql = "select dept_id,avg(salary) salary from emp group by dept_id";
        List<Emp> list = jdbc.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDept_id()+"--"+list.get(i).getSalary());
        }
    }
}
