package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Map getNum();
    List<Book> sel(int num);
}
