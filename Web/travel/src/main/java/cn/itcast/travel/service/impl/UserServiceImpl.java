package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoImpl();
    @Override
    public int register(User user) {
        return dao.register(user);
    }

    @Override
    public boolean check(String username) {
        return dao.check(username);
    }

    @Override
    public boolean active(String code) {
        User user = dao.findByCode(code);
        if(user !=null){
            dao.updateStatus(user);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public User login(User user) {
        return dao.login(user.getUsername(),user.getPassword());
    }
}

