<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML5文档-->
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
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本-->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row" style="width: 800px;margin: auto">
        <center><h3>新用户注册</h3></center>
        <form action="addServlet" method="post">
            <div class="form-group">
                <label for="name">姓名：</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
            </div>

            <div class="form-group">
                <label>性别：</label>
                <input type="radio" name="gender" value="男" checked="checked"/>男
                <input type="radio" name="gender" value="女"/>女
            </div>

            <div class="form-group">
                <label for="age">年龄：</label>
                <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
            </div>

            <div class="form-group">
                <label for="address">籍贯：</label>
                <select name="address" class="form-control" id="jiguan">

                </select>
            </div>

            <div class="form-group">
                <label for="qq">QQ：</label>
                <input type="text" class="form-control" name="qq" placeholder="请输入QQ号码"/>
            </div>

            <div class="form-group">
                <label for="email">Email：</label>
                <input type="text" class="form-control" name="email" placeholder="请输入邮箱地址"/>
            </div>

            <div class="form-group" style="text-align: center">
                    <button class="btn btn-primary">提交</button>
                    <button class="btn btn-default" type="reset">重置</button>
            </div>
        </form>
    </div>
    <div class="alert alert-danger alert-dismissible" id="divs" style="width: 600px;margin: auto" hidden role="alert">
        <button type="button" class="close" data-dismiss="alert">
            <span>&times;</span></button>
        <strong>用户名已被使用!</strong>
    </div>
</div>
</body>
</html>
<script>
    $(document).ready(function () {
        $.post("jiguanServlet",function (obj) {
            $(obj).each(function () {
                //console.log();
                $("#jiguan").append("<option>"+this.p_name+"</option>");
            });
        },"json");
    });
    $("#name").blur(function () {
        $.post("checkServlet",{name:$(this).val()},function (obj) {
            //alert(typeof(obj));
            if(obj=="true"){
                $("button:eq(0)").prop("disabled",true);
                $("#divs").prop("hidden",false);
                //$("#divs").css("visibility","visible");
            }else if(obj=="false"){
                $("button:eq(0)").prop("disabled",false);
                $("#divs").prop("hidden",true);
                //$("#divs").css("visibility","hidden");
            }
        });
    });
</script>