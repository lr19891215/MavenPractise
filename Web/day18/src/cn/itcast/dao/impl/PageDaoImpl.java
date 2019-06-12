package cn.itcast.dao.impl;

import cn.itcast.dao.PageDao;
import cn.itcast.domain.User;
import cn.itcast.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PageDaoImpl implements PageDao {
    JdbcTemplate jdbc = new JdbcTemplate(DruidUtils.getDs());
    @Override
    public int findTotal(User user) {
        String sql = "select count(*) from user where 1=1";
        if(user.getName()!=null && user.getName()!=""){
            sql += " and name like '%"+user.getName()+"%'";
        }
        if(user.getAddress()!=null && user.getAddress()!=""){
            sql += " and address ='"+user.getAddress()+"'";
        }
        if(user.getEmail()!=null && user.getEmail()!=""){
            sql += " and email ='"+user.getEmail()+"'";
        }
        Integer integer = jdbc.queryForObject(sql, int.class);
        return integer;
    }

    @Override
    public int pageCount(User user) {
        String sql = "select ceil(count(*)/3) from user where 1=1";
        if(user.getName()!=null && user.getName()!=""){
            sql += " and name like '%"+user.getName()+"%'";
        }
        if(user.getAddress()!=null && user.getAddress()!=""){
            sql += " and address ='"+user.getAddress()+"'";
        }
        if(user.getEmail()!=null && user.getEmail()!=""){
            sql += " and email ='"+user.getEmail()+"'";
        }
        Integer integer = jdbc.queryForObject(sql, int.class);
        return integer;
    }

    @Override
    public List<User> findPage(int pageNo,User user) {
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
        sql+=" limit ?,3";
        List<User> list = jdbc.query(sql,new BeanPropertyRowMapper<>(User.class),pageNo);
        return list;
    }


}
