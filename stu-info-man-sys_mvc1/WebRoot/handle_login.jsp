<%@page contentType="text/html; charset=gbk" import="java.util.*" %>
<html>
  <head>
      <title>登录返回页</title>
  </head>
<body>

<!-- 内嵌java代码，主要控制逻辑跳转 -->
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean checkOK=false;
    if(username.equals("admin")&&password.equals("admin")){
    	checkOK=true;
    	session.setAttribute("username",username);
    }
    if(checkOK){
    	out.print("<div style=\"color: mediumseagreen;font-size: 35px;text-align: center\">登录成功，欢迎 ");
%>
        <%=session.getAttribute("username") %></div>
<%
    }
    else{
    	out.print("<div style=\"color: red;font-size: 35px;text-align: center\">用户名或密码错误, 登录失败</h1></div>");
    }
%>
<br><br><br><br><br><br>
<div style="color: mediumseagreen;font-size: 15px;text-align: center"><a href="student_login.jsp">返回</a></div>

</body>
</html>