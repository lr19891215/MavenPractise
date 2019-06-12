package cn.itcast.demo;

import org.cson.img.VerifyCodeUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletCheckCode")
public class ServletCheckCode extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        VerifyCodeUtils.checkImg(100,50,4,resp);

        String code = VerifyCodeUtils.code;

        ServletContext context = req.getServletContext();

        context.setAttribute("code",code);

    }

}
