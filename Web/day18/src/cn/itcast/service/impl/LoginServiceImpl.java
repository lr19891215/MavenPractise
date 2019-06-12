package cn.itcast.service.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.dao.impl.LoginDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.LoginService;

import java.util.List;

public class LoginServiceImpl implements LoginService {
    LoginDao dao = new LoginDaoImpl();
    @Override
    public boolean check(String user, String pwd) {
        return dao.check(user,pwd);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
