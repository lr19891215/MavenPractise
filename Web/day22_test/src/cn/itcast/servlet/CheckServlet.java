package cn.itcast.servlet;

import cn.itcast.service.CheckService;
import cn.itcast.service.impl.CheckServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/checkServlet")
public class CheckServlet extends HttpServlet {
    CheckService service = new CheckServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        boolean check = service.check(name);

        //ObjectMapper mapper =new ObjectMapper();
        //mapper.writeValue(resp.getWriter(),check);
        resp.getWriter().print(check);
    }

}
