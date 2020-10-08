package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Display;
import model.Team;

public class Main
{
	public static void main(String args[]) throws NumberFormatException, IOException, ClassNotFoundException, SQLException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter the cityid");
	
	long  cityid=Long.parseLong(br.readLine());
	
	System.out.println("enter the cityname");
	
	String cityname=br.readLine();
	
	City city=new City(cityid,cityname);

	System.out.println("enter the team name");
	
	String name=br.readLine();
	
	System.out.println("enter the coach name");
	
	String coach=br.readLine();
	
	Team team=new Team(name,coach,city);
	
	TeamDAO teamdao=new TeamDAO();
	
	teamdao.createTeam(team);
	
    CityDAO citydao=new CityDAO();
	
	Display display;
	display=citydao.getCityByName();
	System.out.println("TEAM DETAILS ARE");
	System.out.printf("%1s %10s %10s","Name","Coach","City");
	System.out.println();
	System.out.printf("%1s %13s %13s",display.getName(),display.getCoach(),display.getCityname());
	//System.out.printf(display.getCoach(),"%5s");
	//System.out.printf(display.getCityname());
	
	}
}