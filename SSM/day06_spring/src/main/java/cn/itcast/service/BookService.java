package cn.itcast.service;

import cn.itcast.domain.Book;

public interface BookService {
    Book findById(int id);
    void update(Book book);
    void trans();
}
