package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {
    List<Book> findAll();
    void save(Book book);
    void update(Book book);
    void del(int id);
    List<Book> findByCompany(String company);
    int findTotal();
    Book find();
    Map<String,Object> findMap();
    Book find1(Map<String,Object> map);
    List<Book> find2(List<String> list);
}
