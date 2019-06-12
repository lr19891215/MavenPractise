package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.dao.impl.BookDaoImpl;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
//    @Qualifier("bookDaoImpl")
//    @Resource(name = "bookDaoImpl")
    BookDao dao;
    public List<Book> findAll() {
        return dao.findAll();
    }
}
