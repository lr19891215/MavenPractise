package cn.itcast.web;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.PageService;
import cn.itcast.service.impl.PageServiceImpl;
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

@WebServlet("/pageServlet")
public class PageServlet extends HttpServlet {
    PageService service = new PageServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNo = req.getParameter("pageNo");
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int temp=1;
        if(pageNo!=null&&!pageNo.equals("")){
            temp=Integer.parseInt(pageNo);
        }
        PageBean pb = new PageBean();
        pb.setTotal(service.findTotal(user));
        pb.setCount(service.pageCount(user));
        pb.setList(service.findPage(temp,user));

        int prePage = temp-1<=1?1:temp-1;
        int nextPage = temp+1>=pb.getCount()?pb.getCount():temp+1;

        pb.setPrePage(prePage);
        pb.setNextPage(nextPage);

        HttpSession session = req.getSession();
        session.setAttribute("page",temp);
        session.setAttribute("pb",pb);
        session.setAttribute("user",user);
        resp.sendRedirect("list.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        this.doGet(req,resp);
    }
}
