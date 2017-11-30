package MVCServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MyBean.JavaBean;
import MyBean.SqlBean;

public class SearchById extends HttpServlet
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

//获得id
String sid=request.getParameter("id");
int id=Integer.parseInt(sid);

String sql="select * from student where id=?";
SqlBean sBean=new SqlBean();
JavaBean jBean=sBean.getSearchById(sql, id);

//ID
request.setAttribute("id", jBean.getId());
//姓名
request.setAttribute("name",jBean.getName());
//密码
request.setAttribute("password", jBean.getPassword());
//性别
String sex="";
String man="";
String woman="";
if(jBean.getSex()!=null){
	sex=jBean.getSex().trim();
	if(sex.equals("男")){
		man="checked";
	}
	else{
		woman="checked";
	}
	
}
request.setAttribute("man",man);
request.setAttribute("woman",woman);

//年龄
request.setAttribute("age", jBean.getAge());
//转发
request.getRequestDispatcher("Update.jsp").forward(request, response);
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
