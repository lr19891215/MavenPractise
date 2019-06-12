package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/welcome")
public class Filter implements javax.servlet.Filter {

    public void init(FilterConfig filterChain) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Object map = session.getAttribute("map");
        if(map!=null && !map.equals("")){
            filterChain.doFilter(request, response);
        }else {
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

    public void destroy() {

    }

}
