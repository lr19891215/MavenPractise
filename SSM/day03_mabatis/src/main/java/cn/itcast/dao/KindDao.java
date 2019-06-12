package cn.itcast.dao;


import cn.itcast.domain.Kind;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KindDao {

    @Select("select * from kind where kid=#{kid}")
    Kind findById(int id);

    @Select("select * from kind")
    @Results({
            @Result(many = @Many(select = "cn.itcast.dao.BookDao.findByKind_id"),
                    column = "kid",property = "books")
    })
    List<Kind> findAll();

}
