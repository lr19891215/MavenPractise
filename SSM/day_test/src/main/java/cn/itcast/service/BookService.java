package cn.itcast.service;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;

import java.sql.SQLException;

public interface BookService {

    Book findById(int id) throws SQLException;
    void update(int id,double price,boolean autoCommit) throws SQLException;

}
