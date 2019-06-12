package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.impl.UserServiceImpl;
import cn.itcast.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    UserService us = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");
        String sign = req.getParameter("sign");
        boolean check = us.check(user, pwd);
        if(check){
            List<User> list = us.findAll();
            HttpSession session = req.getSession();
            session.setAttribute("list",list);

            if(sign!=null && sign.equals("1")){
                Cookie c1 = new Cookie("user",user);
                Cookie c2 = new Cookie("pwd",pwd);
                resp.addCookie(c1);
                resp.addCookie(c2);
            }

            resp.sendRedirect("list.jsp");
        }else {
            resp.sendRedirect("error.jsp");
        }
    }
}
