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

@WebServlet("/delSelectServlet")
public class DelSelectServlet extends HttpServlet {
    DelService service = new DelServiceImpl();
    LoginService login = new LoginServiceImpl();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if(id != null && id != "") {
            service.delSelete(id);
        }
        HttpSession session = req.getSession();
        session.setAttribute("list",login.findAll());

        resp.sendRedirect("pageServlet");
    }
}
