<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<title>登陆界面</title>
<script>
function custCheck(){
    var username=document.getElementById("username");
    var password=document.getElementById("password");
    if(username.value==""){
        alert("客户名不能为空");
        return false;
    }else if(password.value=="") {
        alert("密码不能为空");
        return false;
    }
  }
  </script>
</head>
<body>
<div style="text-align: left;"><a href="index.jsp">返回首页</a> </div>
<div style="color: mediumseagreen;font-size: 35px;text-align: center">学生信息管理系统</div>
<br/><br/><br/><br/>
<div style="margin: 0 auto;text-align: center">
    <form action="handle_login.jsp" method="post" onSubmit="return custCheck() ">
        <strong>用户:</strong><input type="text" name="username"  id="username"/>
        <br/>
        <br/>
        <strong>密码:</strong><input type="password" name="password" id="password" />
        <br/>
        <br/>
           <input type="submit" value="登陆" id="sub"/>
        <input type="reset"  value="重置" id="res"/>
    </form>
</div>
</body>
</html>