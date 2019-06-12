package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/pageServlet")
public class Filter implements javax.servlet.Filter {

    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        Object map = session.getAttribute("map");
        if(map!=null && !map.equals("")){
            chain.doFilter(req, resp);
        }else {
            request.getRequestDispatcher("login.jsp").forward(req,resp);
        }




    }

    public void destroy() {
    }

}
