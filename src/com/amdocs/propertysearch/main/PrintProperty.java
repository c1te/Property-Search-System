package com.amdocs.propertysearch.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.amdocs.propertysearch.pojo.Property;

public class PrintProperty {
	public void printProperty(ArrayList<Property> res) {
		
		Iterator<Property> i = res.iterator();
	
		System.out.printf("%5s %5s %5s %5s %7s %10s %14s %6s %12s","propertyId","Room No","Area(sqft)","Floor","City","State","Cost(Lakh)","Owner","Contact No");
		System.out.println();
		while(i.hasNext()) {
			Property curr = i.next() ;
			
			System.out.format("%5s %8s %11s %6s %10s %12s %8s %8s %14s",
					curr.getpropertyId(),curr.getNoOfRooms(),curr.getArea(),curr.getFloorNo(),
					curr.getCity(),curr.getState(),curr.getCost(),curr.getOwnerName(),curr.getOwnerContactNo());
			System.out.println();
		}
		
	}
	
}
