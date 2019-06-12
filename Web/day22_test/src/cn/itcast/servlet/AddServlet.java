package cn.itcast.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.AddService;
import cn.itcast.service.impl.AddServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    AddService service = new AddServiceImpl();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        }catch (Exception e) {
            e.printStackTrace();
        }
        service.add(user);
    }

}
