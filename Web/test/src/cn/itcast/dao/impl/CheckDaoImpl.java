package cn.itcast.dao.impl;

import cn.itcast.dao.CheckDao;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class CheckDaoImpl implements CheckDao {
    JdbcTemplate jdbc= new JdbcTemplate(DruidUtils.getDs());
    @Override
    public boolean check(String username) {
        String sql = "select count(*) from user where username=?";
        Integer integer = jdbc.queryForObject(sql,Integer.class,username);
        return integer==0?true:false;
    }
}
