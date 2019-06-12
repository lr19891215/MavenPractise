package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.AddService;
import cn.itcast.service.LoginService;
import cn.itcast.service.impl.AddServiceImpl;
import cn.itcast.service.impl.LoginServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    AddService service = new AddServiceImpl();
    LoginService login = new LoginServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.add(user);

        HttpSession session = req.getSession();
        session.setAttribute("list",login.findAll());
        resp.sendRedirect("pageServlet");
    }
}
