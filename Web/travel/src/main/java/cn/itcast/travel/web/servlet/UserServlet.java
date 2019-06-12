package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import cn.itcast.travel.util.UuidUtil;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    private UserService service = new UserServiceImpl();

    public void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        String code = (String) req.getSession().getAttribute("CHECKCODE_SERVER");
        boolean check = service.check(user.getUsername());
        if(code.equalsIgnoreCase(user.getCode())&&check){
            user.setCode(UuidUtil.getUuid());
            user.setStatus("N");
            String content = "<a href='http://localhost:8080/user/active?code="+user.getCode()+"'>点击激活[黑马旅游网]</a>";
            //MailUtils.sendMail(user.getEmail(),content,"激活邮件");
            //虚假邮箱
            req.getSession().setAttribute("mail",content);
            service.register(user);
            resp.sendRedirect(req.getContextPath()+"/register_ok.html");
        }else {
            resp.setContentType("text/html;charset=utf-8");
            if(!code.equalsIgnoreCase(user.getCode())){
                resp.getWriter().write("验证码有误");
            }else if(!check){
                resp.getWriter().write("用户名重复");
            }
            resp.sendRedirect("register.html");

        }
    }

    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User u = service.login(user);

        ResultInfo info = new ResultInfo();
        if(u == null){
            info.setFlag(false);
            info.setErrorMsg("用户名或密码错误");
        }

        if(u != null && !"Y".equals(u.getStatus())){
            info.setFlag(false);
            info.setErrorMsg("尚未激活,请激活后登录");
        }
        if(u != null && "Y".equals(u.getStatus())){
            info.setFlag(true);
            req.getSession().setAttribute("user",u);
        }
        writeValue(info,resp);
    }

    public void active(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("code");
        if(code != null){
            boolean flag = service.active(code);
            String msg = null;
            if(flag){
                msg = "激活成功,请<a href='"+req.getContextPath()+"/login.html'>登录</a>";
            }else {
                msg = "激活失败,请联系管理员";
            }
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(msg);
        }
    }

    public void findOne(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Object user = req.getSession().getAttribute("user");
        writeValue(user,resp);
    }

    public void exit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath()+"/login.html");
    }
}
