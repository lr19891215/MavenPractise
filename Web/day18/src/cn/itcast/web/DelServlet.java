package cn.itcast.web;

import cn.itcast.service.DelService;
import cn.itcast.service.LoginService;
import cn.itcast.service.impl.DelServiceImpl;
import cn.itcast.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/delServlet")
public class DelServlet extends HttpServlet {
    DelService service = new DelServiceImpl();
    LoginService login = new LoginServiceImpl();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        service.del(Integer.parseInt(id));

        HttpSession session = req.getSession();
        session.setAttribute("list",login.findAll());

        resp.sendRedirect("pageServlet");
    }
}
