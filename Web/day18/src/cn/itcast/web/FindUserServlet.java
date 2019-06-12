package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.FindUsertByIDService;
import cn.itcast.service.impl.FindUsertByIDServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        FindUsertByIDService service = new FindUsertByIDServiceImpl();
        User user = service.findUsertByID(id);
        List<String> list = service.findCity();
        req.setAttribute("user",user);
        req.setAttribute("city",list);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
