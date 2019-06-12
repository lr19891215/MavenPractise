package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbc = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public int register(User user) {
        String sql = "insert into tab_user values(null,?,?,?,?,?,?,?,?,?)";
        int update = jdbc.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getBirthday(), user.getSex(), user.getTelephone(), user.getEmail(), user.getStatus(), user.getCode());
        return update;
    }

    @Override
    public boolean check(String username) {
        String sql = "select count(*) from tab_user where username=?";
        Integer integer = jdbc.queryForObject(sql, Integer.class, username);
        return integer==0?true:false;
    }

    @Override
    public User findByCode(String code) {
        String sql = "select * from tab_user where code=?";
        List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<>(User.class), code);
        return list.size()==0?null:list.get(0);
    }

    @Override
    public void updateStatus(User user) {
        String sql = "update tab_user set status='Y' where uid=?";
        jdbc.update(sql,user.getUid());
    }

            @Override
            public User login(String username, String password) {
                User user = null;
                String sql = "select * from tab_user where username=? and password=?";
                List<User> list = jdbc.query(sql, new BeanPropertyRowMapper<>(User.class), username, password);
                return list.size()==0?null:list.get(0);
            }
        }
