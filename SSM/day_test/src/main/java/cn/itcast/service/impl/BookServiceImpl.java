package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao dao;
    public Book findById(int id) throws SQLException {
        return dao.findById(id);
    }

    public void update(int id, double price,boolean autoCommit) throws SQLException {
        dao.update(id,price,autoCommit);
    }
}
