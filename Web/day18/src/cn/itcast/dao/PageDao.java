package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface PageDao {
    int findTotal(User user);
    int pageCount(User user);
    List<User> findPage(int pageNo,User user);
}
