package cn.itcast.service.impl;

import cn.itcast.dao.UpdateDao;
import cn.itcast.dao.impl.UpdateDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.UpdateService;

public class UpdateServiceImpl implements UpdateService {
    UpdateDao dao = new UpdateDaoImpl();
    @Override
    public void update(User user) {
        dao.update(user);
    }


}
