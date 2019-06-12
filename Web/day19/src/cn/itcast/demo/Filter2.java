package cn.itcast.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filter2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("执行2");
        chain.doFilter(req, resp);
        System.out.println("执行2");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
