package cn.itcast.web;

import cn.itcast.service.LoginService;
import cn.itcast.service.impl.LoginServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    LoginService service =new LoginServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        String verifycode = req.getParameter("verifycode");

        HttpSession session = req.getSession();
        String code = session.getAttribute("code").toString();

        if (code.equals(verifycode) && service.check(user, password)) {
            Map<String,String> map = new HashMap<>();
            map.put("user",user);
            map.put("pwd",password);
            session.setAttribute("map",map);

            session.setAttribute("list", service.findAll());
            resp.sendRedirect("pageServlet");
        } else {
            session.setAttribute("flag",1);
            resp.sendRedirect("login.jsp");
        }
    }
}
