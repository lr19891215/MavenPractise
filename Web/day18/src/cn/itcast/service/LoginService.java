package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface LoginService {
    boolean check(String user,String pwd);
    List<User> findAll();
}
