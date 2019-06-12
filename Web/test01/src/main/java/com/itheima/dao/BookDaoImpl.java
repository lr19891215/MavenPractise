package com.itheima.dao;

import com.itheima.domain.Book;
import com.itheima.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao {

    JdbcTemplate jdbc = new JdbcTemplate(JDBCUtils.getDataSource());

    public int getNum() {
        String sql = "select count(*) from books";
        return jdbc.queryForObject(sql,Integer.class);
    }

    public List<Book> sel(int num) {
        String sql = "select * from books limit ? , 4";
        return jdbc.query(sql,new BeanPropertyRowMapper<Book>(Book.class),num);
    }
}
