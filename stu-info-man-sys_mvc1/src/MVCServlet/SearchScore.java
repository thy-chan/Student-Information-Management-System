package MVCServlet;

import MyBean.JavaBeanScore;
import MyBean.SqlBeanScore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchScore extends HttpServlet
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
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
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
		request.setCharacterEncoding("UTF-8");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);

		String sql="select * from student_score where id=?";
		SqlBeanScore sBean=new SqlBeanScore();
		JavaBeanScore jBean=sBean.getSearchById(sql, id);
		//response.setContentType("text/hmtl;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><meta charset=\"utf-8\"/></HEAD>");
		out.println("  <BODY>");
		out.println("       <center><font color=red size=7>学生成绩信息如下</font>");
		out.println("           <hr>");
		out.println("           <table border=1>");
		out.println("               <tr>");
		out.println("                   <td>姓名</td>");
		out.println("                   <td>学号</td>");
		out.println("                   <td>性别</td>");
		out.println("                   <td>院系</td>");
		out.println("                   <td>专业</td>");
		out.println("                   <td>数学</td>");
		out.println("                   <td>英语</td>");
		out.println("                   <td>Java</td>");
		out.println("                   <td>C</td>");
		out.println("                   <td>操作系统</td>");
		out.println("                   <td>JavaEE</td>");
		out.println("               </tr>");
		out.println("               <tr>");
		out.println("                   <td>"+jBean.getName()+"</td>");
		out.println("                   <td>"+jBean.getId()+"</td>");
		out.println("                   <td>"+jBean.getSex()+"</td>");
		out.println("                   <td>"+jBean.getDepartment()+"</td>");
		out.println("                   <td>"+jBean.getMajor()+"</td>");
		out.println("                   <td>"+jBean.getMath_score()+"</td>");
		out.println("                   <td>"+jBean.getEnglish_score()+"</td>");
		out.println("                   <td>"+jBean.getJava_score()+"</td>");
		out.println("                   <td>"+jBean.getC_score()+"</td>");
		out.println("                   <td>"+jBean.getOperating_score()+"</td>");
		out.println("                   <td>"+jBean.getJavaee_score()+"</td>");
		out.println("");
		out.println("                </tr>");
		out.println("            </table>");
		out.println("            <div style=\"text-align: center;\"><a href=\"/score_search.jsp\">返回</a> </div>");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
        //转发
		//request.getRequestDispatcher(".jsp").forward(request, response);
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
