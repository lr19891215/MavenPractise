package cn.itcast.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        PrintWriter pw = resp.getWriter();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("lastTime")){
                String value = cookie.getValue();
                String decode = URLDecoder.decode(value, "utf-8");
                pw.write("欢迎回来,上次访问的时间是"+decode);
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format = sdf.format(date);
                String encode = URLEncoder.encode(format, "utf-8");
                cookie.setMaxAge(600);
                cookie.setValue(encode);
            }else {
                pw.write("欢迎首次访问!");
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format = sdf.format(date);
                String encode = URLEncoder.encode(format, "utf-8");
                Cookie value = new Cookie("lastTime", encode);
                cookie.setMaxAge(600);
                resp.addCookie(value);
            }
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
