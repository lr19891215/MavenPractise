package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface SelectDao {
    List<User> find(User user);
}
