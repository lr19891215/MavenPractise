package cn.itcast.service.impl;

import cn.itcast.dao.SelectDao;
import cn.itcast.dao.impl.SelectDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.SelectService;

import java.util.List;

public class SelectServiceImpl implements SelectService {
    SelectDao dao = new SelectDaoImpl();
    @Override
    public List<User> find(User user) {
        return dao.find(user);
    }
}
