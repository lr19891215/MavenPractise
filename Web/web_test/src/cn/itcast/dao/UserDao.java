package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    public User login(User loginUser){
        try {
            String sql = "select * from customer where name = ? and id = ?";
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getName(), loginUser.getId());
            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
