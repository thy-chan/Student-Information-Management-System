<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生信息管理系统</title>
    <base href="<%=basePath%>">
    <title>'My JSP 'index.jsp'</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
<body>
<br/>
<div style="color: mediumseagreen;font-size: 35px;text-align: center">欢迎来到学生信息管理系统</div>
<br/><br/>
<div style="margin: 0 auto;text-align: center">
    <p><a href="student_login.jsp">学生登录页面</a></p>
    <p><a href="frame.jsp">学生管理页面</a></p>
</div>
</body>
</html>
