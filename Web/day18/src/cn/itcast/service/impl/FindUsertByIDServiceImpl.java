package cn.itcast.service.impl;

import cn.itcast.dao.FindUserByIDDao;
import cn.itcast.dao.impl.FindUserByIDDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.FindUsertByIDService;

import java.util.List;

public class FindUsertByIDServiceImpl implements FindUsertByIDService {
    FindUserByIDDao dao = new FindUserByIDDaoImpl();
    @Override
    public User findUsertByID(String id) {
        return dao.findUsertByID(id);
    }
    @Override
    public List<String> findCity() {
        return dao.findCity();
    }
}
