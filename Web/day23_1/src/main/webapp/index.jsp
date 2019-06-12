<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>success</h1>
<c:forEach begin="1" end="10" var="i">
    ${i}
</c:forEach>
</body>
</html>
