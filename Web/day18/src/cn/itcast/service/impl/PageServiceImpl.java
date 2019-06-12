package cn.itcast.service.impl;

import cn.itcast.dao.PageDao;
import cn.itcast.dao.impl.PageDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.PageService;

import java.util.List;

public class PageServiceImpl implements PageService{
    PageDao dao = new PageDaoImpl();
    @Override
    public int findTotal(User user) {
        return dao.findTotal(user);
    }

    @Override
    public int pageCount(User user) {
        return dao.pageCount(user);
    }

    @Override
    public List<User> findPage(int pageNo,User user) {
        int temp = (pageNo-1)*3 >0 ? (pageNo-1)*3:0;
        return dao.findPage(temp,user);
    }
}
