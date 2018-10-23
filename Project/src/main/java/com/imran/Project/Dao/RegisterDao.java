package com.imran.Project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDao 
{

	String driver="org.h2.Driver";
	String username="imran";
	String password="imran";
	String url="jdbc:h2:tcp://localhost/~/Project";
	String sql="insert into customer values(?,?,?)";
	public int i;
	
	public boolean check(String uname,String pass,String rpass)
	{
		try 
		{
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		i=st.executeUpdate();
		
		con.close();
		st.close();
		
		}
		catch(Exception e)
		{
			
		}
		return false;
	}
}
