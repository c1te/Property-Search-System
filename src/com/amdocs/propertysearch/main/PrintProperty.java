package com.amdocs.propertysearch.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.amdocs.propertysearch.pojo.Property;

public class PrintProperty {
	public void printProperty(ArrayList<Property> res) {
		
		Iterator<Property> i = res.iterator();
	
		
		while(i.hasNext()) {
			Property curr = i.next() ;
			
			System.out.format("%5s %5s %10s %5s %10s %10s %5s %5s %10s",
					curr.getpropertyId(),curr.getNoOfRooms(),curr.getArea(),curr.getFloorNo(),
					curr.getCity(),curr.getState(),curr.getCost(),curr.getOwnerName(),curr.getOwnerContactNo());
			System.out.println();
		}
		
	}
	
}
