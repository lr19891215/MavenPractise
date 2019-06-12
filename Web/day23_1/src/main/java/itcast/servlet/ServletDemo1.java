package itcast.servlet;

import itcast.service.SaveService;
import itcast.service.impl.SaveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class ServletDemo1 extends HttpServlet {

    SaveService service = new SaveServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");

        boolean flag = service.check(name);
        resp.setContentType("text/html;charset=utf8");


        resp.getWriter().print(flag);

    }
}
