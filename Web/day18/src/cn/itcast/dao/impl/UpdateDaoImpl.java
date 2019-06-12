package cn.itcast.dao.impl;

import cn.itcast.dao.UpdateDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;


public class UpdateDaoImpl implements UpdateDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public void update(User user) {
        String sql = "update user set gender=?,age=?,address=?,qq=?,email=? where id=?";
        jdbc.update(sql,user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail(),user.getId());
    }


}
