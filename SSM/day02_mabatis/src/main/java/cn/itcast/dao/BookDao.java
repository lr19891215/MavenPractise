package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.util.List;

public interface BookDao {
    List<Book> findByCase(String str);
    List<Book> findInId(List<Integer> list);
    List<Book> findBookKind();
    List<Book> find();
}
