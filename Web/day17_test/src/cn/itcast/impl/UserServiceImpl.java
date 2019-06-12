package cn.itcast.impl;

import cn.itcast.dao.DruidUtils;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserServiceImpl implements UserService {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public boolean check(String name, String pwd) {
        String sql = "select count(*) from user where name=? and qq=?";
        Integer integer = jdbc.queryForObject(sql, int.class, name, pwd);
        return integer==1?true:false;
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }
}
