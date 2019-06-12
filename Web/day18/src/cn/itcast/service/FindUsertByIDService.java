package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface FindUsertByIDService {
    User findUsertByID(String id);
    List<String> findCity();
}
