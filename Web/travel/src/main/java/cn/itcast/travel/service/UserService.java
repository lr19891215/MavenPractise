package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {
    int register(User user);
    boolean check(String username);
    boolean active(String code);
    User login(User user);
}
