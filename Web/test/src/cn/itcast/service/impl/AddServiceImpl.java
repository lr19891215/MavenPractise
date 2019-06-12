package cn.itcast.service.impl;

import cn.itcast.dao.AddDao;
import cn.itcast.dao.impl.AddDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.AddService;

public class AddServiceImpl implements AddService {
    AddDao dao = new AddDaoImpl();
    @Override
    public Integer add(User user) {
        return dao.add(user);
    }
}
