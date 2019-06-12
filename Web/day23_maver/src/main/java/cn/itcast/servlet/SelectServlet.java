package cn.itcast.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.SelectService;
import cn.itcast.service.impl.SelectServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectServlet")
public class SelectServlet extends HttpServlet {
    SelectService service = new SelectServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        List<User> list = service.sel();
        HttpSession session = req.getSession();
        session.setAttribute("list",list);
        req.getRequestDispatcher("success.jsp").forward(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
