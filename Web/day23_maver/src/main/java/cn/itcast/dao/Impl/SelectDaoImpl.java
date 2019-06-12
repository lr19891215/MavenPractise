package cn.itcast.dao.Impl;

import cn.itcast.dao.SelectDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SelectDaoImpl implements SelectDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    public List<User> sel() {
        String sql = "select * from customer";
        List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }
}
