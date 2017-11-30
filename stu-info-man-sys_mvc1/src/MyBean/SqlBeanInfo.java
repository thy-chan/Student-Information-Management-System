package MyBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlBeanInfo {
	Connection con;
	PreparedStatement pre;
	ResultSet rs;
	public SqlBeanInfo(){
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
	public int getInsert(String sql, JavaBeanInfo jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setInt(2,jBean.getId());
			pre.setString(3,jBean.getPassword());
			pre.setString(4, jBean.getSex());
			pre.setString(5, jBean.getBirthday());
			pre.setString(6,jBean.getGrade());
			pre.setString(7,jBean.getDepartment());
			pre.setString(8,jBean.getMajor());
			pre.setString(9,jBean.getEmail());
			pre.setString(10,jBean.getAddress());
			pre.setString(11,jBean.getHobby());

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

	public JavaBeanInfo getSearchById(String sql, int id){
		JavaBeanInfo jBean=new JavaBeanInfo();
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(2, id);
			rs=pre.executeQuery();

			while(rs.next()){
				jBean.setName(rs.getString("name"));
				jBean.setId(rs.getInt("id"));
				jBean.setPassword(rs.getString("password"));
				jBean.setSex(rs.getString("sex"));
				jBean.setBirthday(rs.getString("birthday"));
				jBean.setGrade(rs.getString("grade"));
				jBean.setDepartment(rs.getString("department"));
				jBean.setMajor(rs.getString("major"));
				jBean.setEmail(rs.getString("email"));
				jBean.setAddress(rs.getString("address"));
				jBean.setHobby(rs.getString("hobby"));
			}

		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return jBean;
	}
	public int getUpdate(String sql, JavaBeanInfo jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setInt(2, jBean.getId());
			pre.setString(3,jBean.getPassword());
			pre.setString(4, jBean.getSex());
			pre.setString(5, jBean.getBirthday());
			pre.setString(6,jBean.getGrade());
			pre.setString(7,jBean.getDepartment());
			pre.setString(8,jBean.getMajor());
			pre.setString(9,jBean.getEmail());
			pre.setString(10,jBean.getAddress());
			pre.setString(11,jBean.getHobby());


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
				JavaBeanInfo jBean=new JavaBeanInfo();
				jBean.setName(rs.getString("name"));
				jBean.setId(rs.getInt("id"));
				jBean.setPassword(rs.getString("password"));
				jBean.setSex(rs.getString("sex"));
				jBean.setBirthday(rs.getString("birthday"));
				jBean.setGrade(rs.getString("grade"));
				jBean.setDepartment(rs.getString("department"));
				jBean.setMajor(rs.getString("major"));
				jBean.setEmail(rs.getString("email"));
				jBean.setAddress(rs.getString("address"));
				jBean.setHobby(rs.getString("hobby"));

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

