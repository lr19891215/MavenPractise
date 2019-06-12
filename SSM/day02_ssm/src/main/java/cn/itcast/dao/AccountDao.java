package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    void add(Account account);
}
