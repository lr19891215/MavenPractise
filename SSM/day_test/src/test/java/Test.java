import cn.itcast.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BookServiceImpl service = ac.getBean("bookServiceImpl", BookServiceImpl.class);
        service.update(5,255.5,true);
        System.out.println(service.findById(5));
    }
}
