package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO
{
	public void createTeam(Team team) throws ClassNotFoundException, SQLException
	{
		
		City city=(City) team.getCity();
		ConnectionManager cm=new ConnectionManager();
		if(cm!=null)
		{
	    System.out.println("established");
	    String sql="INSERT INTO TEAM1(NAME,COACHNAME,CITYID,CITYNAME)VALUES(?,?,?,?)";
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1,team.getName());
		st.setString(2,team.getCoach());
		st.setLong(3,city.getCityid());
		st.setString(4, city.getCityname());
		st.executeUpdate();
		st.close();
		}
		return;
		//System.out.println("not established");
	}
}
