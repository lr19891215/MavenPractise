package com.itheima.service;

import com.itheima.dao.BookDao;
import com.itheima.dao.BookDaoImpl;
import com.itheima.domain.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService{
    BookDao dao = new BookDaoImpl();
    public Map getNum() {
        int num = dao.getNum();
        int totalPage = num /4 == 0 ?(num /4):(num /4 + 1);
        int currentPage = 1;
        HashMap<String, Integer> pb = new HashMap<String, Integer>();
        pb.put("totalPage",totalPage);
        pb.put("currentPage",currentPage);
        return pb;
    }

    public List<Book> sel(int num) {
        return dao.sel(num);
    }
}
