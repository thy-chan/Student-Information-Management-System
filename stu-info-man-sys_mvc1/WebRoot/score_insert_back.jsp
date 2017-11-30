<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8" %>
<%@ page import="MyBean.JavaBeanScore" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>注册返回页</title>
</head>

<body>
<center><font color="mediumseagreen" size=7>学生成绩信息如下</font>
    <hr>
    <table border=1>
        <tr>
            <td>姓名</td>
            <td>学号</td>
            <td>性别</td>
            <td>院系</td>
            <td>专业</td>
            <td>数学</td>
            <td>英语</td>
            <td>Java</td>
            <td>C</td>
            <td>操作系统</td>
            <td>JavaEE</td>
        </tr>
        <jsp:useBean id="sBean" class="MyBean.SqlBeanScore"/>
        <jsp:useBean id="jBean" class="MyBean.JavaBeanScore"/>
        <%
            String sql = "select * from student_score order by id";
            java.util.List list = sBean.getSearch(sql);
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                //获得JavaBean的一个对象
                jBean = (JavaBeanScore) it.next();
        %>
        <tr>
            <td><%=jBean.getName() %>
            </td>
            <td><%=jBean.getId() %>
            </td>
            <td><%=jBean.getSex()%>
            </td>
            <td><%=jBean.getDepartment() %>
            </td>
            <td><%=jBean.getMajor() %>
            </td>
            <td><%=jBean.getMath_score() %>
            </td>
            <td><%=jBean.getEnglish_score() %>
            </td>
            <td><%=jBean.getJava_score() %>
            </td>
            <td><%=jBean.getC_score()%>
            </td>
            <td><%=jBean.getOperating_score() %>
            </td>
            <td><%=jBean.getJavaee_score()%>
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
