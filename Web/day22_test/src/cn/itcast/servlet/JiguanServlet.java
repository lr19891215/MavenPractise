package cn.itcast.servlet;

import cn.itcast.domain.Province;
import cn.itcast.domain.User;
import cn.itcast.service.JiguanService;
import cn.itcast.service.impl.JiguanServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/jiguanServlet")
public class JiguanServlet extends HttpServlet {
    JiguanService service = new JiguanServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String jiguan = service.jiguan();
        resp.setContentType("application/json;charset=utf8");
        resp.getWriter().print(jiguan);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
