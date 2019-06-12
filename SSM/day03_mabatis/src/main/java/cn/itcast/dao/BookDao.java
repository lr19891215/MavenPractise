package cn.itcast.dao;


import cn.itcast.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {
    @Select("select * from book where bookname=#{bookname}")
    List<Book> find(String bookname);

    @Select("select * from book where bookname=#{name1} or bookname=#{name2}")
    List<Book> find2(@Param("name1") String a, @Param("name2") String b);

    @Select("select b.bookname,k.kid,k.kname from book b,kind k where b.kind_id=k.kid")
    @Results({
            @Result(column = "kid",property = "kind.kid"),
            @Result(column = "kname",property = "kind.kname"),
    })
    List<Book> find3();

    @Select("select b.bookname,b.kind_id from book b")
    @Results({
            @Result(column = "kind_id",property = "kind",
                    one= @One(select="cn.itcast.dao.KindDao.findById"))
    })
    List<Book> findAll();

    @Select("select * from book where kind_id=#{id}")
    List<Book> findByKind_id(int id);

}
