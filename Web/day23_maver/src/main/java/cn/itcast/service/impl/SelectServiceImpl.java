package cn.itcast.service.impl;

import cn.itcast.dao.Impl.SelectDaoImpl;
import cn.itcast.dao.SelectDao;
import cn.itcast.domain.User;
import cn.itcast.service.SelectService;

import java.util.List;

public class SelectServiceImpl implements SelectService {
    SelectDao dao = new SelectDaoImpl();
    public List<User> sel() {
        return dao.sel();
    }
}
