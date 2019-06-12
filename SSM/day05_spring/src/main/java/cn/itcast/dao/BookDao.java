package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();
}
