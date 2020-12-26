package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.city.City;
import com.xworkz.xworkzapp.dto.CityWardDTO;


public class CityUtil {
	public static void main(String[] args) {
		City city =new City();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of  cityward ");
		
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
		
		CityWardDTO cityWardDTO= new CityWardDTO();
		System.out.println("Enter the Ward number");
		int wardNumber=sc.nextInt();
		System.out.println("Enter the ward name ");
		String wardName=sc.next();
		System.out.println("Enter the corporator name");
		String corporatorName=sc.next();
		System.out.println("Enter the population");
		int population=sc.nextInt();
		System.out.println("Enter the area in sq kilo meters");
		String area=sc.next();
		cityWardDTO.setWardNumber(wardNumber);
		cityWardDTO.setWardName(wardName);
		cityWardDTO.setCorporateName(corporatorName);
		cityWardDTO.setPopulation(population);
		cityWardDTO.setArea(area);
		
		city.addCityWards(cityWardDTO);
		city.displayAllCityWard();
		city.searchCityWardByName();
		
		
	}
		sc.close();

}
}