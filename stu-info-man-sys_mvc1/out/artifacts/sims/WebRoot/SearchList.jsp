<%@ page language="java" import="java.util.*" contentType="text/html;charset=GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body><center><font color=red size=7>ѧ����Ϣ����</font>
    <hr>
    <table border=1>
    <tr>
    <td>id</td>
    <td>����</td>
    <td>����</td>
    <td>�Ա�</td>
    <td>����</td>
    <td><center>��   ��</center></td>
    </tr>
    <jsp:useBean id="sBean" class="MyBean.SqlBean"/>
    <jsp:useBean id="jBean" class="MyBean.JavaBean"/>
    <%
    	String sql="select * from student order by id";
    	java.util.List list=sBean.getSearch(sql);
    	for(Iterator it=list.iterator();it.hasNext();){
    		//���JavaBean��һ������
    		jBean=(MyBean.JavaBean)it.next();
    		%>
    		<tr>
    		<td><%=jBean.getId() %></td>
    		<td><%=jBean.getName() %></td>
    		<td><%=jBean.getPassword() %></td>
    		<td><%=jBean.getSex() %></td>
    		<td><%=jBean.getAge() %></td>
    		<td>
    		<a href="Delete?id=<%=jBean.getId() %>">ɾ��</a>&nbsp;
    		<a href="SearchById?id=<%=jBean.getId() %>">����</a>
    		</td>
    		</tr><%
    	}
    	
    	
     %>
    </table>
    <a href="Insert.jsp">����</a>
    </center>
</body>

</html>
