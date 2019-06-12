package cn.itcast.demo;

import cn.itcast.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("user");
        User user = new User();
        user.setName(name);
        user.setBir(new Date());
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),user);
//        resp.setContentType("text/html;charset=utf8");
//        resp.getWriter().print("该用户已被注册");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
