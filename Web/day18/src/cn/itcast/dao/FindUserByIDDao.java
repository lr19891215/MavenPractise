package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface FindUserByIDDao {
    User findUsertByID( String id);
    List<String> findCity();
}
