package cn.itcast.demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerService {
    public Integer check(String name,String id){
        JdbcTemplate jdbc = new JdbcTemplate(JdbcUtils.getDs());
        String sql = "select count(*) from customer where name=? and id=?";
        Integer inte = jdbc.queryForObject(sql,int.class,name,id);
        return inte;
    }
}
