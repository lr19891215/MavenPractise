package cn.itcast.dao.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    QueryRunner runner;

    public List<Book> findAll() {
        String sql = "select * from book";
        List<Book> list = null;
        try {
            list = runner.query(sql, new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
