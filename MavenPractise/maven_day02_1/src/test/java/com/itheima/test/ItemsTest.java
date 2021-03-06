package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);

        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
