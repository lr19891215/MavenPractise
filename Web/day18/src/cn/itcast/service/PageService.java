package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface PageService {
    int findTotal(User user);
    int pageCount(User user);
    List<User> findPage(int pageNo,User user);
}
