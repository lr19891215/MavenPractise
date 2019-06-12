import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.domain.BookVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    private InputStream in;
    private SqlSession session;
    private BookDao bookDao;

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
    }
    @After
    public void destroy() throws Exception {
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void select(){
        //5.使用代理对象执行方法
        List<Book> books = bookDao.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void save(){
        //5.使用代理对象执行方法
        Book book = new Book();
        book.setBookName("福尔摩斯探案集");
        book.setAuthor("柯南道尔");
        book.setPrice(200d);
        book.setCompany("itcast");
        book.setKind_id(6);
        System.out.println(book);
        bookDao.save(book);
        System.out.println(book);
    }

    @Test
    public void update(){
        //5.使用代理对象执行方法
        Book book = new Book();
        book.setId(21);
        book.setAuthor("阿加莎克里斯蒂");
        book.setPrice(300d);
        bookDao.update(book);
    }

    @Test
    public void del(){
        bookDao.del(21);
    }

    @Test
    public void findByCompany(){
        List<Book> books = bookDao.findByCompany("%大学%");
        System.out.println(books);
    }

    @Test
    public void findTotal(){
        int total = bookDao.findTotal();
        System.out.println(total);
    }

    @Test
    public void find(){
        Book book = bookDao.find();
        System.out.println(book.getTotal());
        System.out.println(book.getPages());
    }
    @Test
    public void findMap(){
        Map<String, Object> map = bookDao.findMap();
        System.out.println(map.get("total")+"===="+map.get("pages"));
    }
    @Test
    public void find1(){
        Map<String,Object> map = new HashMap<>();
        map.put("company","中国人民大学出版社");
        map.put("price",100);
        Book book = bookDao.find1(map);
        System.out.println(book);
    }
    @Test
    public void find2(){
        List<String> list = new ArrayList<>();
        list.add("三国演义");
        list.add("水浒传");
        list.add("西游记");
        List<Book> books = bookDao.find2(list);
        System.out.println(books);
    }
}
