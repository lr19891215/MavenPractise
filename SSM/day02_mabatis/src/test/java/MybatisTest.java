import cn.itcast.dao.BookDao;
import cn.itcast.dao.KindDao;
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
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSession session;
    private BookDao bookDao;
    private KindDao kindDao;

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
    }
    @After
    public void destroy() throws Exception {
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void testFindByCase(){
        List<Book> books = bookDao.findByCase("三国演义");
        for (Book b:books){
            System.out.println(b);
        }
    }
    @Test
    public void testFindInId(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(9);
        List<Book> books = bookDao.findInId(list);
        for (Book b:books) {
            System.out.println(b);
        }
    }
    //数据一对一排列
    @Test
    public void tsetFindBookKind(){
        List<Book> bookKind = bookDao.findBookKind();
        for (Book bk:bookKind) {
            System.out.println(bk.getBookname()+"---"+bk.getKind().getKname());
        }
    }
    //数据一对多排列
    @Test
    public void testfind(){
        List<Kind> list = kindDao.find();
        for (Kind kind : list) {
            System.out.println("["+kind.getKname()+"]");
            for (Book book : kind.getBooks()) {
                System.out.println(book.getBookname());
            }
        }
    }
}
