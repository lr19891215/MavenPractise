package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet("/demo1")
public class ServletDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> taoyuan = (ArrayList<String>) req.getAttribute("taoyuan");
        for (String s : taoyuan) {
            System.out.println(s);
        }
        req.getRequestDispatcher("xxxx.html").forward(req,resp);

//        String user = req.getParameter("user");
//        String pwd = req.getParameter("pwd");
//        String[] hobbies = req.getParameterValues("hobby");
//        System.out.println(user);
//        System.out.println(pwd);
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }
//        Map<String, String[]> map = req.getParameterMap();
//        String[] strings = map.get("user");
//        System.out.println(strings[0]);
//        String[] hobby = map.get("hobby");
//        for (String s : hobby) {
//            System.out.println(s);
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        this.doGet(req,resp);
    }
}
