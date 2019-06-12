package cn.itcast.service.impl;

import cn.itcast.dao.CheckDao;
import cn.itcast.dao.impl.CheckDaoImpl;
import cn.itcast.service.CheckService;

public class CheckServiceImpl implements CheckService {
    CheckDao dao = new CheckDaoImpl();
    @Override
    public boolean check(String username) {
        return dao.check(username);
    }
}
