package MyBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlBeanScore {
	Connection con;
	PreparedStatement pre;
	ResultSet rs;
	public SqlBeanScore(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simd?user=root&password=mysql&useUnicode=true&characterEncoding=GB2312&useSSL=true");
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
	}
	public int getInsert(String sql, JavaBeanScore jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setInt(2,jBean.getId());
			pre.setString(3,jBean.getSex());
			pre.setString(4, jBean.getDepartment());
			pre.setString(5, jBean.getMajor());
			pre.setInt(6,jBean.getMath_score());
			pre.setInt(7,jBean.getEnglish_score());
			pre.setInt(8,jBean.getJava_score());
			pre.setInt(9,jBean.getC_score());
			pre.setInt(10,jBean.getOperating_score());
			pre.setInt(11,jBean.getJavaee_score());

			count=pre.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		finally{
			try{
				pre.close();
				con.close();
			}catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}

		}

		return count;
	}

	public int getDelete(String sql,int id){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(2, id);
			count=pre.executeUpdate();

		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		finally{
			try{
				pre.close();
				con.close();
			}catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}

		}

		return count;
	}

	public JavaBeanScore getSearchById(String sql, int id){
		JavaBeanScore jBean=new JavaBeanScore();
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(1, id);
			rs=pre.executeQuery();

			while(rs.next()){
				jBean.setName(rs.getString("name"));
				jBean.setId(rs.getInt("id"));
				jBean.setSex(rs.getString("sex"));
				jBean.setDepartment(rs.getString("department"));
				jBean.setMajor(rs.getString("major"));
				jBean.setMath_score(rs.getInt("math_score"));
				jBean.setEnglish_score(rs.getInt("english_score"));
				jBean.setJava_score(rs.getInt("java_score"));
				jBean.setC_score(rs.getInt("c_score"));
				jBean.setOperating_score(rs.getInt("operating_score"));
				jBean.setJavaee_score(rs.getInt("javaee_score"));
			}

		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return jBean;
	}
	public int getUpdate(String sql, JavaBeanScore jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setInt(2,jBean.getId());
			pre.setString(3,jBean.getSex());
			pre.setString(4, jBean.getDepartment());
			pre.setString(5, jBean.getMajor());
			pre.setInt(6,jBean.getMath_score());
			pre.setInt(7,jBean.getEnglish_score());
			pre.setInt(8,jBean.getJava_score());
			pre.setInt(9,jBean.getC_score());
			pre.setInt(10,jBean.getOperating_score());
			pre.setInt(11,jBean.getJavaee_score());


			count=pre.executeUpdate();

		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		finally{
			try{
				pre.close();
				con.close();
			}catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}

		}

		return count;
	}
	public List getSearch(String sql){
		List list=new ArrayList();
		//获得prepareStatement对象
		try {
			pre=con.prepareStatement(sql);
			rs=pre.executeQuery();
			while(rs.next()){
				JavaBeanScore jBean=new JavaBeanScore();

				jBean.setName(rs.getString("name"));
				jBean.setId(rs.getInt("id"));
				jBean.setSex(rs.getString("sex"));
				jBean.setDepartment(rs.getString("department"));
				jBean.setMajor(rs.getString("major"));
				jBean.setMath_score(rs.getInt("math_score"));
				jBean.setEnglish_score(rs.getInt("english_score"));
				jBean.setJava_score(rs.getInt("java_score"));
				jBean.setC_score(rs.getInt("c_score"));
				jBean.setOperating_score(rs.getInt("operating_score"));
				jBean.setJavaee_score(rs.getInt("javaee_score"));
				list.add(jBean);
			}


		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		finally{
			try{
				pre.close();
				con.close();
			}catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		}
		return list;
	}
}

