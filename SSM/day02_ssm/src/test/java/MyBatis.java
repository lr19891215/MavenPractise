import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatis {
    @Test
    public void testFindAll() throws Exception{
        InputStream is = Resources.getResourceAsStream("SqlMapconfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("多少");
        account.setMoney(100d);
        dao.add(account);
        sqlSession.commit();
        List<Account> list = dao.findAll();
        for (Account acc : list) {
            System.out.println(acc);
        }
    }
}
