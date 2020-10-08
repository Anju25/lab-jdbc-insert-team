package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import model.Display;
import utility.ConnectionManager;
import java.sql.Connection;

public class CityDAO
{
	public Display getCityByName() throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionManager.getConnection();
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from team1");
	Display display=null;
	while(rs.next())
	{
		    String name1=rs.getString("name");
			String coach=rs.getString("coachname");
			String cityname=rs.getString("cityname");
		    display=new Display(name1,coach,cityname);
		  
	}
	return display;
}
}

