package cn.itcast.dao.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LoginDaoImpl implements LoginDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public boolean check(String user, String pwd) {

        String sql = "select count(*) from user where name=? and qq=?";
        Integer integer = jdbc.queryForObject(sql, int.class, user, pwd);
        return integer==1?true:false;
    }

    @Override
    public List<User> findAll() {
        return jdbc.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }
}
