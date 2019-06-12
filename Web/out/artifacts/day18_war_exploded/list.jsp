<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>

    <div style="float: left;">

        <form class="form-inline" action="pageServlet" method="post">
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" name="name" value="${user.name}" class="form-control" id="exampleInputName2" >
            </div>
            <div class="form-group">
                <label for="exampleInputName3">籍贯</label>
                <input type="text" name="address" value="${user.address}" class="form-control" id="exampleInputName3" >
            </div>

            <div class="form-group">
                <label for="exampleInputEmail2">邮箱</label>
                <input type="text" name="email" value="${user.email}" class="form-control" id="exampleInputEmail2"  >
            </div>
            <button class="btn btn-default">查询</button>
        </form>

    </div>

    <div style="float: right;margin: 5px;">

        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
        <a class="btn btn-primary" href="javascript:delAll();" id="delSelected">删除选中</a>

    </div>
</div>
<div class="container">
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th><input type="checkbox" id="cbx" onclick="selectAll()"></th>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach var="user" items="${pb.list}">
            <tr>
                <td><input type="checkbox" name="ids" value="${user.id}"></td>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.gender}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.qq}</td>
                <td>${user.email}</td>
                <td>
                    <a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp;
                    <a class="btn btn-default btn-sm" href="javascript:del('${user.id}')">删除</a>
                </td>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="9" align="center"><a class="btn btn-primary" href="add.jsp">添加联系人</a></td>
        </tr>
    </table>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <ul class="pagination">
                    <li><a href="javascript:perPage()">&laquo;</a></li>
                    <c:forEach begin="1" end="${pb.count}" var="i">
                        <li <c:if test="${page==i}">class="active"</c:if>><a href="javascript:getPage(${i})">${i}</a></li>
                    </c:forEach>
                    <li><a href="javascript:nextPage()">&raquo;</a></li>
                    <span style="font-size: 25px;margin-left: 5px;">
                    共${pb.total}条记录，共${pb.count}页
                    </span>
                </ul>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
<script>
    var user = document.getElementById("exampleInputName2");
    var addr = document.getElementById("exampleInputName3");
    var email = document.getElementById("exampleInputEmail2");
    function perPage() {
        window.location.href="pageServlet?pageNo=${pb.prePage}&name="+user.value+"&address="+addr.value+"&email="+email.value;
    }
    function nextPage() {
        window.location.href="pageServlet?pageNo=${pb.nextPage}&name="+user.value+"&address="+addr.value+"&email="+email.value;
    }
    function getPage(i) {
        window.location.href="pageServlet?pageNo="+i+"&name="+user.value+"&address="+addr.value+"&email="+email.value;
    }

    function del(param) {
        if(confirm("确认删除?")){
            location.href="${pageContext.request.contextPath}/delServlet?id="+param;
        }
    }

    function selectAll() {
        var cbx = document.getElementById("cbx");
        var ids = document.getElementsByName("ids");
        for(var i=0;i< ids.length;i++){
            ids[i].checked=cbx.checked;
        }
    }

    function delAll() {
        var ids = document.getElementsByName("ids");
        var arr = new Array();
        for(var i=0; i<ids.length;i++) {
            if (ids[i].checked == true) {
                arr.push(ids[i].value);
            }
        }
        if(confirm("确认删除?")){
            location.href="${pageContext.request.contextPath}/delSelectServlet?id="+arr;
        }
    }
</script>