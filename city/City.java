package com.xworkz.xworkzapp.city;

import com.xworkz.xworkzapp.dto.CityWardDTO;

public class City {
	public CityWardDTO[] cityWardDTO=new CityWardDTO[100];
 public int index;
 
 public   void addCityWards(CityWardDTO cityWardDTO)
		 {
	   	if(cityWardDTO!=null)
	   	{
	   		System.out.println(this.index);
	   		this.cityWardDTO[index++]=cityWardDTO;
	   		System.out.println(cityWardDTO.getWardNumber()+" "+cityWardDTO.getWardName()+" "
	   				+ cityWardDTO.getCorporatorName()+" "+cityWardDTO.getPopulation()+" "
	   				+cityWardDTO.getArea());
	   	}
	}

public CityWardDTO[] displayAllCityWard() {
	System.out.println("All city Wards");
	for(int i=0;i<cityWardDTO.length;i++) {
		if(cityWardDTO[i]!=null) {
			System.out.println(cityWardDTO[i].getWardNumber()+" "+cityWardDTO[i].getWardName()+" "
					+ cityWardDTO[i].getCorporatorName()+" "+cityWardDTO[i].getPopulation()+" "
					+cityWardDTO[i].getArea());
		}
	}
	return cityWardDTO;
		
	}
public void searchCityWardByName() {
	System.out.println("Enter name of the city");
	for(int i=0;i<cityWardDTO.length;i++) {
		if(cityWardDTO[i]!=null) {
			
			Object wardName = null;
			if(cityWardDTO[i].getWardName().equals(wardName)) {
				System.out.println(cityWardDTO[i].getWardNumber()+" "+cityWardDTO[i].getWardName()+" "
			+ cityWardDTO[i].getCorporatorName()+" "+cityWardDTO[i].getPopulation()+" "
			+cityWardDTO[i].getArea());
			}
		}
	}
}
public void returnCorporatorByWardNumber() {
	System.out.println();
}


}




                                         
																    
			