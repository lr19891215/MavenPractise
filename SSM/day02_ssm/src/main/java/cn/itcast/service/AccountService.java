package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void add(Account account);
}
