package cn.itcast.dao.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    QueryRunner runner;
    @Autowired
    Connection conn;
    public Book findById(int id) throws SQLException {
        String sql = "select * from book where id=?";
        Book book = runner.query(sql, new BeanHandler<Book>(Book.class),id);
        return book;
    }

    public void update(int id, double price, boolean autoCommit) throws SQLException {
        String sql = "update book set price=? where id=?";
        if(autoCommit){
            runner.update(sql,price,id);
        }else {
            conn.rollback();
        }
    }
}
