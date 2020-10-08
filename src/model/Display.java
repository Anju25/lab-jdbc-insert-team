package model;

public class Display {
	private String name;
	private String coach;
	private String cityname;
	
	public Display(String name, String coach, String cityname) {
		super();
		this.name = name;
		this.coach = coach;
		this.cityname = cityname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	

}
