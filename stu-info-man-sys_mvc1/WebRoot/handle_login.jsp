<%@page contentType="text/html; charset=gbk" import="java.util.*" %>
<html>
  <head>
      <title>��¼����ҳ</title>
  </head>
<body>

<!-- ��Ƕjava���룬��Ҫ�����߼���ת -->
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean checkOK=false;
    if(username.equals("admin")&&password.equals("admin")){
    	checkOK=true;
    	session.setAttribute("username",username);
    }
    if(checkOK){
    	out.print("<div style=\"color: mediumseagreen;font-size: 35px;text-align: center\">��¼�ɹ�����ӭ ");
%>
        <%=session.getAttribute("username") %></div>
<%
    }
    else{
    	out.print("<div style=\"color: red;font-size: 35px;text-align: center\">�û������������, ��¼ʧ��</h1></div>");
    }
%>
<br><br><br><br><br><br>
<div style="color: mediumseagreen;font-size: 15px;text-align: center"><a href="student_login.jsp">����</a></div>

</body>
</html>