package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface LoginDao {
    boolean check(String user,String pwd);
    List<User> findAll();
}
