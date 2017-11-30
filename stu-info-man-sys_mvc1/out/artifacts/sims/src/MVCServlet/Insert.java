package MVCServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MyBean.JavaBean;
import MyBean.SqlBean;

public class Insert extends HttpServlet
{

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy()
	{
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {		

//获取前台页面信息
String name=request.getParameter("name");
String password=request.getParameter("password");
String sex=request.getParameter("sex");
String Sage=request.getParameter("age");
int age=Integer.parseInt(Sage);

//封装到JavaBean对象中
MyBean.JavaBean jBean=new MyBean.JavaBean();
jBean.setName(name);
jBean.setPassword(password);
jBean.setSex(sex);
jBean.setAge(age);

//调用模型层
String sql="insert into student values(?,?,?,?)";
SqlBean sBean=new SqlBean();
int count=sBean.getInsert(sql, jBean);
String url="";
if(count>0){
	url="SearchList.jsp";
}
else{
	url="Error.jsp";
	request.setAttribute("error","注册");
}
//转发
request.getRequestDispatcher(url).forward(request, response);
}


	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
