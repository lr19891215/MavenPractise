package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

@WebFilter("/addServlet")
public class WordFilter implements Filter {

    public void init(FilterConfig filterChain) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) Proxy.newProxyInstance(request.getClass().getClassLoader(), request.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getParameterMap")) {
                    Map<String, String[]> map = (Map<String, String[]>) method.invoke(request, args);
                    if (map.get("name")[0].contains("笨蛋")) {
                        String s = map.get("name")[0].replaceAll("笨蛋", "***");
                        String[] str ={s};
                        Map<String, String[]> map2 = new HashMap<>(map);
                        map2.put("name", str);
                        return map2;
                    }
                    return map;
                } else {
                    return method.invoke(request, args);
                }
            }
        });
        filterChain.doFilter(req,response);
    }

    public void destroy() {

    }

}
