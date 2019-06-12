package cn.itcast.service.impl;

import cn.itcast.dao.impl.LoginDaoImpl;
import cn.itcast.dao.LoginDao;
import cn.itcast.service.LoginService;

public class LoginServiceImpl implements LoginService {
    LoginDao dao = new LoginDaoImpl();
    @Override
    public boolean login(String username, String password) {
        return dao.login(username,password);
    }
}
