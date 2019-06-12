package cn.itcast.dao.impl;

import cn.itcast.dao.SelectDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SelectDaoImpl implements SelectDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public List<User> find(User user) {
        String sql = "select * from user where 1=1";
        if(user.getName()!=null && user.getName()!=""){
            sql += " and name like '%"+user.getName()+"%'";
        }
        if(user.getAddress()!=null && user.getAddress()!=""){
            sql += " and address ='"+user.getAddress()+"'";
        }
        if(user.getEmail()!=null && user.getEmail()!=""){
            sql += " and email ='"+user.getEmail()+"'";
        }

        List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<>(User.class));
        return list;
    }
}
