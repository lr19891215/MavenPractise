package cn.itcast.dao.impl;

import cn.itcast.dao.FindUserByIDDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FindUserByIDDaoImpl implements FindUserByIDDao {
    JdbcTemplate jdbc= new JdbcTemplate(DruidUtils.getDs());
    @Override
    public User findUsertByID(String id) {
        return jdbc.queryForObject("select * from user where id=?",new BeanPropertyRowMapper<User>(User.class),id);
    }
    @Override
    public List<String> findCity() {
        return jdbc.queryForList("select distinct address from user",String.class);
    }
}
