import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import cn.itcast.utils.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        BookService service = ac.getBean("bookServiceImpl", BookService.class);
        List<Book> books = service.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
