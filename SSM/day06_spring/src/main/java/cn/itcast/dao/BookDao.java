package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.sql.SQLException;

public interface BookDao {
    Book findById(int id);
    void update(Book book);
}
