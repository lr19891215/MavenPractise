package cn.itcast.dao.impl;

import cn.itcast.dao.AddDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class AddDaoImpl implements AddDao {
    JdbcTemplate jdbc= new JdbcTemplate(DruidUtils.getDs());
    @Override
    public void add(User user) {
        String sql = "insert into user values (null,?,?,?,?,?,?)";
        jdbc.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail());
    }
}
