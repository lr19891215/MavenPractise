<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>管理员登录</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
      <script src="js/getParameter.js"></script>
    <script type="text/javascript">
    </script>
  </head>
  <body>
  	<div class="container" style="width: 400px;">
  		<h3 style="text-align: center;">管理员登录</h3>
        <form action="loginServlet" method="post" id="frm">
	      <div class="form-group">
	        <label for="user">用户名：</label>
	        <input type="text" name="user" value="${cookie.user.value}" class="form-control" id="user" placeholder="请输入用户名"/>
	      </div>
	      
	      <div class="form-group">
	        <label for="password">密码：</label>
	        <input type="password" name="pwd" value="${cookie.pwd.value}" class="form-control" id="password" placeholder="请输入密码"/>
	      </div>
	      
	      <div class="form-inline">
              <input type="checkbox" name="sign" value="1">记住我
	      </div>
	      <hr/>
	      <div class="form-group" style="text-align: center;">
              <button class="btn btn btn-primary">登录</button>
		  </div>
	  	</form>


  	</div>
  </body>
</html>