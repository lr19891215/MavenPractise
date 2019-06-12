package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

import java.util.List;

public interface UserDao {
    int register(User user);
    boolean check(String username);

    User findByCode(String code);

    void updateStatus(User user);

    User login(String username,String password);
}
