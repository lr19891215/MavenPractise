import cn.itcast.dao.BookDao;
import cn.itcast.dao.CustomerDao;
import cn.itcast.dao.KindDao;
import cn.itcast.dao.SaleinfoDao;
import cn.itcast.domain.Book;
import cn.itcast.domain.Customer;
import cn.itcast.domain.Kind;
import cn.itcast.domain.Saleinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        List<Customer> list = customerDao.findByName();
        for (Customer customer : list) {
            System.out.println("["+customer.getName()+"]");
            List<Saleinfo> saleinfos = customer.getSaleinfos();
            for (Saleinfo saleinfo : saleinfos) {
                System.out.println(saleinfo.getBook().getBookname());
                System.out.println(saleinfo.getBook().getPrice());
                System.out.println(saleinfo.getNums());
                System.out.println(saleinfo.getPrices());
            }
        }
    }
    @Test
    public void test2(){
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        List<Saleinfo> list = saleinfoDao.findByDate();
        for (Saleinfo saleinfo : list) {
            String str = date.format(saleinfo.getDate());
            System.out.println("【"+str+"】");
            List<Saleinfo> saleinfos = saleinfo.getSaleinfos();
            for (Saleinfo s : saleinfos) {
                System.out.print(s.getCustomer().getName()+" - ");
                System.out.print(s.getBook().getBookname()+" - ");
                System.out.print(s.getBook().getKind().getKname()+" - ");
                System.out.print(s.getNums()+" - ");
                System.out.println(s.getBook().getPrice());
            }

        }
    }
    @Test
    public void test(){
        List<Book> books = bookDao.find();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
