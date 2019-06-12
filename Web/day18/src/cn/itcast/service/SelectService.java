package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface SelectService {
    List<User> find(User user);
}
