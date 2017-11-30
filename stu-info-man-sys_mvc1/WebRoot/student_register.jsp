<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <title>学生注册页面</title>
  </head>

  <body>
  <center>
   	<font size="7" color="mediumseagreen">录入/查看学生学籍信息</font>

   	<hr>
   	<form action="MVCServlet/InsertInfo" method="post">
   		<table border="1">
   			<tr>
                <td align="center">姓名:</td>
                <td align="center"><input type="text" name="name"></td>
   			</tr>

            <tr>
                <td align="center">学号:</td>
                <td align="center"><input type="text" name="id"></td>
            </tr>

   			<tr>
                <td align="center">密码:</td>
                <td align="center"><input type="password" name="password"></td>
   			</tr>

   			<tr>
                <td align="center">性别:</td>
                <td align="center"><input type="radio" name="sex" value="男">男
                    <input type="radio" name="sex" value="女">女
                </td>
   			</tr>


            <tr>
                <td align="center">出生日期:</td>
                <td align="center"><input type="text" name="birthday"></td>
            </tr>

            <tr>
                <td align="center">年级:</td>
                <td align="center"><input type="text" name="grade"></td>
            </tr>

            <tr>
                <td align="center">院系:</td>
                <td align="center">
                    <select name="department">
                        <option value="信息院">信息院</option>
                        <option value="物理院">物理院</option>
                        <option value="化工院">化工院</option>
                        <option value="数学院">数学院</option>
                        <option value="文学院">文学院</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td align="center">专业:</td>
                <td align="center">
                    <select name="major">
                    <option value="计算机">计算机</option>
                    <option value="物理">物理</option>
                    <option value="化学">化学</option>
                    <option value="数学">数学</option>
                    <option value="中文">中文</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td align="center">邮箱:</td>
                <td align="center"><input type="text" name="email"></td>
            </tr>

            <tr>
                <td align="center">地址:</td>
                <td align="center"><input type="text" name="address"></td>
            </tr>


            <tr>
                <td align="center">爱好:</td>
                <td align="center">
                    <input name="hobby" type="checkbox" value="登山"/>登山
                    <input name="hobby" type="checkbox" value="游泳"/>游泳
                    <input name="hobby" type="checkbox" value="摄影"/>摄影
                </td>
            </tr>

            <td colspan="2" align="center"><input type="submit" value="提 交">
                <input type="reset" value="重 置">
            </td>
            </tr>
   		</table>
   	</form>
      <div style="text-align: center;"><a href="/score_manage_content.jsp">返回</a> </div>
   </center>
  </body>

</html>
