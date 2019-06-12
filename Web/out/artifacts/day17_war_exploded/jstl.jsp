<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name","zhangsan");
    request.setAttribute("age",30);
%>
<c:if test="${name=='zhangsan'}">
    <h1>yes</h1>
</c:if>

<c:choose>
    <c:when test="${name=='zhangsan'}">对</c:when>
    <c:when test="${name=='lisi'}">对</c:when>
    <c:otherwise>错</c:otherwise>
</c:choose>

<c:forEach begin="1" end="5" var="i">
    ${i}
</c:forEach>

<%
    List list = new ArrayList();
    list.add("aa");
    list.add("bb");
    list.add("cc");
    request.setAttribute("list",list);
    Date date = new Date();
    request.setAttribute("date",date);
%>

<c:forEach items="${list}" var="i" varStatus="j">
    ${i} ${j.index+1}
</c:forEach>

<fmt:formatDate value="${date}" pattern="yyyy-MM-dd"></fmt:formatDate>
</body>
</html>
