import cn.itcast.dao.BookDao;
import cn.itcast.dao.CustomerDao;
import cn.itcast.dao.KindDao;
import cn.itcast.dao.SaleinfoDao;
import cn.itcast.domain.Book;
import cn.itcast.domain.Kind;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test1 {
    private InputStream in;
    private SqlSession session;
    private BookDao bookDao;
    private KindDao kindDao;
    private CustomerDao customerDao;
    private SaleinfoDao saleinfoDao;


    @Before
    public void into() throws Exception {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口代理对象
        bookDao = session.getMapper(BookDao.class);
        kindDao = session.getMapper(KindDao.class);
        customerDao = session.getMapper(CustomerDao.class);
        saleinfoDao = session.getMapper(SaleinfoDao.class);
    }
    @After
    public void destroy() throws Exception {
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }
    @Test
    public void test1(){
        List<Book> books = bookDao.find("熊镇");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void test2(){
        List<Book> books = bookDao.find2("三国演义", "水浒传");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    @Test
    public void test3(){
        List<Book> books = bookDao.find3();
        for (Book book : books) {
            System.out.println(book.getBookname());
            System.out.println(book.getKind().getKid());
            System.out.println(book.getKind().getKname());
        }
    }
    @Test
    public void test4(){
        List<Book> books = bookDao.findAll();
        for (Book book : books) {
            System.out.println(book.getBookname());
            System.out.println(book.getKind().getKid());
        }
    }
    @Test
    public void test5(){
        List<Kind> kinds = kindDao.findAll();
        for (Kind kind : kinds) {
            System.out.println("["+kind.getKname()+"]");
            List<Book> books = kind.getBooks();
            for (Book book : books) {
                System.out.println(book.getBookname());
                System.out.println(book.getPrice());
            }
        }
    }
}
