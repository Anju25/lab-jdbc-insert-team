package model;


public class City
{
	private Long cityid;
	private String cityname;
	
	public City() {
	}
	
	public City(Long cityid, String cityname) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
	}
	public Long getCityid() {
		return cityid;
	}
	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	
}