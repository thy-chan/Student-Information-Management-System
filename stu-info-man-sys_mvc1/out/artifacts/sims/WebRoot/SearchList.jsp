<%@ page language="java" import="java.util.*" contentType="text/html;charset=GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body><center><font color=red size=7>学生信息如下</font>
    <hr>
    <table border=1>
    <tr>
    <td>id</td>
    <td>姓名</td>
    <td>密码</td>
    <td>性别</td>
    <td>年龄</td>
    <td><center>操   作</center></td>
    </tr>
    <jsp:useBean id="sBean" class="MyBean.SqlBean"/>
    <jsp:useBean id="jBean" class="MyBean.JavaBean"/>
    <%
    	String sql="select * from student order by id";
    	java.util.List list=sBean.getSearch(sql);
    	for(Iterator it=list.iterator();it.hasNext();){
    		//获得JavaBean的一个对象
    		jBean=(MyBean.JavaBean)it.next();
    		%>
    		<tr>
    		<td><%=jBean.getId() %></td>
    		<td><%=jBean.getName() %></td>
    		<td><%=jBean.getPassword() %></td>
    		<td><%=jBean.getSex() %></td>
    		<td><%=jBean.getAge() %></td>
    		<td>
    		<a href="Delete?id=<%=jBean.getId() %>">删除</a>&nbsp;
    		<a href="SearchById?id=<%=jBean.getId() %>">更新</a>
    		</td>
    		</tr><%
    	}
    	
    	
     %>
    </table>
    <a href="Insert.jsp">返回</a>
    </center>
</body>

</html>
