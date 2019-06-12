package cn.itcast.svt;

import cn.itcast.domain.Customer;
import cn.itcast.service.CustomerService;
import com.mchange.io.impl.EndsWithFilenameFilter;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet("/loginSvt")
public class SaveSvt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");


//      创建一个空的javaBean对象用于存放数据
        Customer customer = new Customer();

//      将页面收集的数据放入到map中
        Map<String, String[]> map = req.getParameterMap();


        try {
//          将map中的数据复制到javaBean中
//          org.apache.commons.beanutils.BeanUtils【注意导包】

            BeanUtils.populate(customer,map);
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        } catch(InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(customer);

        CustomerService cs = new CustomerService();
        int save = cs.save(customer);


        if(save==0){
            req.getRequestDispatcher("error.html").forward(req,resp);

        }else{
            req.getRequestDispatcher("success.html").forward(req,resp);

        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
