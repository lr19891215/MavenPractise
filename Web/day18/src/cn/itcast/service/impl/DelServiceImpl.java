package cn.itcast.service.impl;

import cn.itcast.dao.DelDao;
import cn.itcast.dao.impl.DelDaoImpl;
import cn.itcast.service.DelService;

public class DelServiceImpl implements DelService {
    DelDao dao = new DelDaoImpl();
    @Override
    public int del(int id) {
        return dao.del(id);
    }

    @Override
    public int delSelete(String id) {
        return dao.delSelete(id);
    }
}
