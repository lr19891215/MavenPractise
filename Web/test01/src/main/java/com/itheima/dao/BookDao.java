package com.itheima.dao;

import com.itheima.domain.Book;

import java.util.List;

public interface BookDao {
    int  getNum();
    List<Book> sel(int num);
}
