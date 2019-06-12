package cn.itcast;

import cn.itcast.dao.ItemsDao;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao dao = ac.getBean(ItemsDao.class);
//        System.out.println(dao.findById(1).getName());
        ItemsService service = ac.getBean(ItemsService.class);
        System.out.println(service.findById(1));
    }
}
