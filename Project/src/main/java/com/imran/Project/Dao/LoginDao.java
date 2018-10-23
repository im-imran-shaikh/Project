package com.imran.Project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	String driver="org.h2.Driver";
	String username="imran";
	String password="imran";
	String url="jdbc:h2:tcp://localhost/~/Project";
	String sql="select * from customer where uname =? and pass =?";
	
	public boolean test(String uname,String pass) 
	{
		try 
		{
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs =st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		}
		catch(Exception e)
		{
			
		}
		
		return false;
	}
}
