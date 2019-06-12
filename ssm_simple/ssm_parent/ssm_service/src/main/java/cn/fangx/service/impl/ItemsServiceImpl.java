package cn.fangx.service.impl;

import cn.fangx.dao.ItemsDao;
import cn.fangx.domain.Items;
import cn.fangx.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
