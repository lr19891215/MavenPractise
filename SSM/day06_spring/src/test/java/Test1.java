import cn.itcast.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BookService service = ac.getBean("bookServiceImpl", BookService.class);
        service.trans();
    }
}
