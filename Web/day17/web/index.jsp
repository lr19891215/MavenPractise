<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="500.jsp" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%@include file="500.jsp"%>
    <%
      List list = new ArrayList();
      list.add("aa");
      list.add("bb");
      list.add("cc");
      request.setAttribute("list",list);

      Map map = new HashMap();
      map.put("name","zhangsan");
      map.put("age","12");
      map.put("sex","nan");
      request.setAttribute("map",map);
    %>
  ${list[1]}
  ${requestScope.map.name}
  <a href="${pageContext.request.contextPath}/500.jsp">11111</a>
  </body>
</html>
