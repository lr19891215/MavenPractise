package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        //System.out.println("service--findall");
        return accountDao.findAll();
    }

    public void add(Account account) {
        //System.out.println("service--add");
        accountDao.add(account);
        //int i = 1/0;
    }
}
