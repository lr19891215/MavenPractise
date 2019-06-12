package cn.itcast.dao.impl;

import cn.itcast.dao.AddDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AddDaoImpl implements AddDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public List<User> sel() {
        String sql = "select * from customer";
        List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return list;
    }
}
