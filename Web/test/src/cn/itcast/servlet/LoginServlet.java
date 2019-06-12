package cn.itcast.servlet;


import cn.itcast.service.LoginService;
import cn.itcast.service.impl.LoginServiceImpl;

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
public class LoginServlet extends HttpServlet {
    LoginService service = new LoginServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean login = service.login(username, password);
        if(login){
            Map<String,String> map = new HashMap<>();
            map.put("username",username);
            map.put("password",password);
            HttpSession session = req.getSession();
            session.setAttribute("map",map);
            resp.sendRedirect("welcome.jsp");
        }else {
            resp.sendRedirect("error.html");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
