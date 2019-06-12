package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.SelectService;
import cn.itcast.service.impl.SelectServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet("/selectServlet")
public class SelectServlet extends HttpServlet {
    SelectService service = new SelectServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        }catch (Exception e) {
            e.printStackTrace();
        }
        List<User> list = service.find(user);
        req.getSession().setAttribute("list",list);
        req.getSession().setAttribute("user",user);

        resp.sendRedirect("pageServlet");
    }
}
