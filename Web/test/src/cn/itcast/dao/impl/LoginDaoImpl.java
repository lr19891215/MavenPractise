package cn.itcast.dao.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDaoImpl implements LoginDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public boolean login(String username, String password) {
        String sql = "select count(*) from user where username=? and password=?";
        Integer integer = jdbc.queryForObject(sql,Integer.class,username,password);
        return integer==1?true:false;
    }
}
