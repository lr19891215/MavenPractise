package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.LoginService;
import cn.itcast.service.UpdateService;
import cn.itcast.service.impl.LoginServiceImpl;
import cn.itcast.service.impl.UpdateServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    UpdateService service = new UpdateServiceImpl();
    LoginService login = new LoginServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        }catch (Exception e) {
            e.printStackTrace();
        }
        service.update(user);

        HttpSession session = req.getSession();
        session.setAttribute("list",login.findAll());

        resp.sendRedirect("pageServlet");

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
