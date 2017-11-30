<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8" %>
<%@ page import="MyBean.JavaBeanInfo" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>注册返回页</title>
</head>

<body>
<center><font color="mediumseagreen" size=7>学生信息如下</font>
    <hr>
    <table border=1>
        <tr>
            <td>姓名</td>
            <td>学号</td>
            <td>密码</td>
            <td>性别</td>
            <td>出生日期</td>
            <td>年级</td>
            <td>院系</td>
            <td>专业</td>
            <td>邮箱</td>
            <td>地址</td>
            <td>爱好</td>
        </tr>
        <jsp:useBean id="sBean" class="MyBean.SqlBeanInfo"/>
        <jsp:useBean id="jBean" class="MyBean.JavaBeanInfo"/>
        <%
            String sql = "select * from student_info order by id";
            java.util.List list = sBean.getSearch(sql);
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                //获得JavaBean的一个对象
                jBean = (JavaBeanInfo) it.next();
        %>
        <tr>
            <td><%=jBean.getName() %>
            </td>
            <td><%=jBean.getId() %>
            </td>
            <td><%=jBean.getPassword() %>
            </td>
            <td><%=jBean.getSex() %>
            </td>
            <td><%=jBean.getBirthday() %>
            </td>
            <td><%=jBean.getGrade() %>
            </td>
            <td><%=jBean.getDepartment() %>
            </td>
            <td><%=jBean.getMajor() %>
            </td>
            <td><%=jBean.getEmail() %>
            </td>
            <td><%=jBean.getAddress() %>
            </td>
            <td><%=jBean.getHobby() %>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <div style="text-align: center;"><a href="/score_manage_content.jsp">返回</a> </div>
</center>
</body>

</html>
