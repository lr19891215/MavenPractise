package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.sql.SQLException;


public interface BookDao {
    Book findById(int id) throws SQLException;
    void update(int id,double price,boolean autoCommit) throws SQLException;
}
