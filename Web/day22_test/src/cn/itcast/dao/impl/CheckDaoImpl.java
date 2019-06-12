package cn.itcast.dao.impl;

import cn.itcast.dao.CheckDao;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class CheckDaoImpl implements CheckDao {
    JdbcTemplate jdbc= new JdbcTemplate(DruidUtils.getDs());
    @Override
    public boolean check(String name) {
        String sql = "select count(*) from user where name=?";
        Integer integer = jdbc.queryForObject(sql, Integer.class, name);
        return integer==1?true:false;
    }
}
