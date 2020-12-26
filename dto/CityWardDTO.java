package com.xworkz.xworkzapp.dto;

public class CityWardDTO {
	
	private  int wardNumber;
	private String wardName;
	private String corporatorName;
	private int population;
	private String area;
	
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber=wardNumber;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName=wardName;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporateName(String corporatorName) {
		this.corporatorName=corporatorName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population=population;
		
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area=area;

}
}
