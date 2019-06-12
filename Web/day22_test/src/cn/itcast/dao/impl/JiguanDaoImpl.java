package cn.itcast.dao.impl;

import cn.itcast.dao.JiguanDao;
import cn.itcast.domain.Province;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JiguanDaoImpl implements JiguanDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public List<Province> jiguan() {
        String sql = "select * from province";
        List<Province> list = jdbc.query(sql, new BeanPropertyRowMapper<>(Province.class));
        return list;
    }
}
