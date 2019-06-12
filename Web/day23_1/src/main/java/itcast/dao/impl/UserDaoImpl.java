package itcast.dao.impl;


import itcast.dao.UserDao;
import itcast.domian.Province;
import itcast.domian.User;
import itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class UserDaoImpl implements UserDao {

    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());

    public List<User> find() {

        String sql = "select * from user";

        List<User> list = jdbc.query(sql,new BeanPropertyRowMapper<>(User.class));

        return list;
    }

}
