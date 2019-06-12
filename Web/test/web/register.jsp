<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎注册</title>
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body class="login_bj">
<div class="zhuce_body">
    <div class="logo">
        <a href="#"><img src="images/czxylogo.png" height="54" border="0"></a>
    </div>
    <div class="zhuce_kong login_kuang">
        <div class="zc">
            <div class="bj_bai">
                <h3>注册</h3>
                <!-- 注册表单 -->
                <form action="addServlet" method="post">
                    <input  type="text" class="kuang_txt" id="username" name="username" placeholder="账号">
                    <input  type="password" class="kuang_txt" id="password" name="password" placeholder="密码">
                    <div>

                    </div>
                    <input type="submit" class="btn_zhuce" value="注册">

                </form>
            </div>
            <div class="bj_right">
                <p>使用以下账号直接注册</p>
                <a href="#" class="zhuce_qq">QQ注册</a>
                <a href="#" class="zhuce_wb">微博注册</a>
                <a href="#" class="zhuce_wx">微信注册</a>
                <p>已有账号？
                    <a href="#">立即登录</a>
                </p>

            </div>
        </div>
        <P>www.czxy.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;传智专修学院欢迎您</P>
    </div>

</div>

</body>
</html>
<script>
    $("#password").blur(function () {
        if($(this).val().length >6){
            alert("密码长度不能超过6位")
        }
    });

    $("#username").blur(function () {
        $.post("checkServlet",{username:$(this).val()},function (obj) {
            if(obj=="true"){

            }else {
                alert("用户名被占用");
            }
        });
    });
</script>
