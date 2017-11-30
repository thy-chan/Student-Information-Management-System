<%@ page language="java" import="java.util.*" contentType="text/html;charset=GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
   <center>
   	<font size="7" color="red">您要更新的数据如下：</font>
   	<hr>
   	<form action="Update" method="post">
   		<table border="1">
   			<tr>
   			<td>Id：</td>
   			<td><input name="id" value="<%=request.getAttribute("id") %>" readonly></td>
   			</tr>
   			<tr>
   			<td>姓名：</td>
   			<td><input name="name" value="<%=request.getAttribute("name") %>"></td>
   			</tr>
   			<tr>
   			<td>密码：</td>
   			<td><input type="password" name="password" value="<%=request.getAttribute("password") %>"></td>
   			</tr>
   			<tr>
   			<td>性别：</td>
   			<td><input type="radio" name="sex" value="男" <%=request.getAttribute("man") %>>男
   			<input type="radio" name="sex" value="女" <%=request.getAttribute("woman") %>>女
   			</td>
   			</tr>
   			<tr>
   			<td>年龄：</td>
   			<td><input type="text" name="age" value="<%=request.getAttribute("age") %>"></td>
   			</tr>
   			<tr>
   			<td colspan="2"><center><input type="submit" value="更 新">
   			<input type="reset" value="重 置"></center>
   			</td>
   			</tr>
   		</table>
   	</form>
   	<a href="SearchList.jsp">查询</a>
   </center></body>

</html>
