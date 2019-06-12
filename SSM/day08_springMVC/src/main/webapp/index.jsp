<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function(){
            // 绑定点击事件
            $("#btn").click(function(){
                $.ajax({
                    url:"user/mav",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"addressName":"aa","addressNum":100}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        alert(data);
                        alert(data.addressName);
                    }
                });
            });
        });



    </script>
</head>
<body>
    <form action="user/mav" method="post">
        姓名:<input type="text" name="username">
        年龄:<input type="text" name="age">
        日期:<input type="text" name="date">
        <input type="submit" name="btn" value="提交">
    </form>

</body>
</html>
