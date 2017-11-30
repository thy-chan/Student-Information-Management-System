<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<title>登陆界面</title>
<script>
function custCheck(){
    var username=document.getElementById("username");
    if(username.value==""){
        alert("学号不能为空");
        return false;
    }
  }
  </script>
</head>
<body>
<div style="text-align: left;"><a href="score_manage_content.jsp">返回</a> </div>
<div style="color: mediumseagreen;font-size: 35px;text-align: center">学生信息查询</div>
<br/><br/><br/><br/>
<div style="margin: 0 auto;text-align: center">
    <form action="/MVCServlet/SearchScore" method="post" onSubmit="return custCheck() ">
        <strong>学号:</strong><input type="text" name="id"  id="id"/>
        <br/>
        <br/>
        <br/>
           <input type="submit" value="查询" id="sub"/>
        <input type="reset"  value="重置" id="res"/>
    </form>
</div>
</body>
</html>