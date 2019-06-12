package cn.itcast.dao;

import cn.itcast.domain.Saleinfo;

import java.util.List;

public interface SaleinfoDao {
    List<Saleinfo> findByDate();
}
