package MyBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MyBean.JavaBean;

public class SqlBean {
	Connection con;
	PreparedStatement pre;
	ResultSet rs;
	public SqlBean(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdata?user=root&password=1&useUnicode=true&characterEncoding=GB2312");
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
	}
	public int getInsert(String sql,JavaBean jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setString(2,jBean.getPassword());
			pre.setString(3, jBean.getSex());
			pre.setInt(4, jBean.getAge());
			
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
			pre.setInt(1, id);
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
	
	public JavaBean getSearchById(String sql,int id){
		JavaBean jBean=new JavaBean();
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(1, id);
			rs=pre.executeQuery();
			
			while(rs.next()){
				jBean.setId(rs.getInt("id"));
				jBean.setName(rs.getString("name"));
				jBean.setPassword(rs.getString("password"));
				jBean.setSex(rs.getString("sex"));
				jBean.setAge(rs.getInt("age"));
			}
			
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return jBean;
	}
	public int getUpdate(String sql,JavaBean jBean){
		int count=0;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,jBean.getName());
			pre.setString(2, jBean.getPassword());
			pre.setString(3, jBean.getSex());
			pre.setInt(4, jBean.getAge());
			pre.setInt(5, jBean.getId());
			
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
				JavaBean jBean=new JavaBean();
				jBean.setId(rs.getInt("id"));
				jBean.setName(rs.getString("name"));
				jBean.setPassword(rs.getString("password"));
				jBean.setSex(rs.getString("sex"));
				jBean.setAge(rs.getInt("age"));
				
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

