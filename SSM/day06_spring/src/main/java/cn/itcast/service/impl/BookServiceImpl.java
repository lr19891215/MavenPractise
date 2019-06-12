package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao dao;
    public Book findById(int id) {
        return dao.findById(id);
    }

    public void update(Book book) {
        dao.update(book);
    }
    @Transactional
    public void trans() {
            Book b1 = findById(1);
            Book b2 = findById(2);
            b1.setPrice(b1.getPrice() - 10);
            b2.setPrice(b2.getPrice() + 10);
            update(b1);
//            int i = 1/0;
            update(b2);
    }

}
