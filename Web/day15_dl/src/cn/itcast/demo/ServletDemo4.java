package cn.itcast.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;


@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      获取用户名、密码和验证码
        request.setCharacterEncoding("utf-8");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        String codes = request.getParameter("code");

//      原始图片验证码
        ServletContext context = request.getServletContext();
        String code = context.getAttribute("code").toString();

//      验证码比对  成功则访问数据库   反之跳转到登录页面
        if(code.equals(codes)){
            //连接数据 比对用户名和密码
            CustomerService cust = new CustomerService();
            Integer inte = cust.check(user,pwd);
            if(inte == 1){
                request.getRequestDispatcher("/successServlet").forward(request,response);
            }else {
                request.getRequestDispatcher("/failServlet").forward(request,response);
            }
        }else{
//          带上flag参数，在页面上用于判断提示信息是否输出
            response.sendRedirect("login.html?flag=1");
        }

    }





}
