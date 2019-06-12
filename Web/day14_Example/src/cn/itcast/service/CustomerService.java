package cn.itcast.service;

import cn.itcast.db.JdbcUtils;
import cn.itcast.domain.Customer;
import org.springframework.jdbc.core.JdbcTemplate;


public class CustomerService {


    public int save(Customer cus){

        String sql = "insert into customer values(null,?,?,?,?,?,?,?,?,?)";

        JdbcTemplate jdbc = new JdbcTemplate(JdbcUtils.getDs());

        int result = jdbc.update(sql,cus.getName(),cus.getBirthday(),
                cus.getEng(),cus.getMath(),cus.getAddr(),
                cus.getTown(),cus.getEmail(),cus.getMale(),cus.getPhone());

        return result;


    }


}
