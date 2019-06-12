package cn.itcast.dao.impl;

import cn.itcast.dao.DelDao;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class DelDaoImpl implements DelDao {
    JdbcTemplate jdbc= new JdbcTemplate(DruidUtils.getDs());
    @Override
    public int del(int id) {
        return jdbc.update("delete from user where id=?",id);
    }

    @Override
    public int delSelete(String id) {
        String sql = "delete from user where id in ("+id+")";
        return jdbc.update(sql);
    }
}
