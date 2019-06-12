package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface UserService {
    boolean check(String name,String pwd);
    List<User> findAll();
}
