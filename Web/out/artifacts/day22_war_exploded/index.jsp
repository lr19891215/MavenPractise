<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/13
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-3.3.1.min.js"></script>
  </head>
  <body>
    <form>
      <input type="text" name="user"><br>
      <input type="text" name="pwd"><br>
      <button>button</button>
    </form>
  </body>
</html>
<script>
   $("input:eq(0)").blur(function () {
       $.post("demoServlet",{user:$(this).val()},function (obj) {
           alert(obj.bir);
       },"json");
       //$.get
  //     $.ajax({
  //         url:"demoServlet",
  //         data:{user:$(this).val()},
  //         type:"Post",
  //         success:function (obj) {
  //           alert(obj);
  //         },
  //         error:function () {
  //             alert(123) ;
  //         }
  //     });
   });
</script>
