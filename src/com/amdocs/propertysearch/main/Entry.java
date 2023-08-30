package com.amdocs.propertysearch.main;

import java.util.Scanner;
import com.amdocs.propertysearch.dao.PropertyDAO;
import com.amdocs.propertysearch.pojo.Property;

public class Entry {
			private PropertyDAO acs = new PropertyDAO();
			private PrintProperty pr = new PrintProperty();
			
			//insert property
			Scanner sc = new Scanner(System.in);
		    public void insertProperty() {
			
			
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Enter No of Rooms : ");
			String noOfRooms = sc.next();
			System.out.print("Enter area in sqft : ");
			int area = sc.nextInt();
			System.out.print("Enter Floor No : ");
			int floor = sc.nextInt();
			System.out.print("Enter City : ");
			String city = sc.next();
			System.out.print("Enter State : ");
			String state = sc.next();
			System.out.print("Cost:");
			double cost = sc.nextDouble();
			System.out.print("Enter Owner Name : ");
			String ownerName = sc.next();
			System.out.print("Enter Contact Number : ");
			String contactNo = sc.next();
			Property newProp = new Property(id , noOfRooms , floor , city , state , cost , ownerName , contactNo , area );
			acs.addProperty(newProp);
		    }
		    
		    //delete property
		    
		    public void deleteProperty() {
		    	
		    	System.out.print("Enter Property id : ");
		    	int id = sc.nextInt();
		    	acs.deleteProperty(id);
		    	
		    }
		    
		    //update property cost
		    
		    public void updatePropertyCost() {
		    	
		    	System.out.print("Enter Property id To Update : ");
		    	int id = sc.nextInt();
		    	System.out.print("Enter Updated Price : ");
		    	double cost = sc.nextDouble();
		    	acs.updatePropertyCost(id,cost);
		    	
		    }
		    
		    //show all property
		    
		    public void showAllProperty() {
		    	pr.printProperty(acs.showAllProperty());
		    }
		    
		  //search by city
			
			 public void searchByCity() {
			    	
			    	System.out.print("Enter City : ");
			    	String city = sc.next();
			    	pr.printProperty(acs.searchByCity(city));;
			    	
			    }
			//search by cost
			
			public void searchByCost() {
		    	
		    	System.out.print("Enter low : ");
		    	double low = sc.nextDouble();
		    	System.out.print("Enter high : ");
		    	double high = sc.nextDouble();
		    	pr.printProperty(acs.searchByCost(low, high));;
		    	
		    }
			
			//search by room and city
			
			public void searchByRoomAndCity() {
		    	
		    	System.out.print("Enter No Of Rooms : ");
		    	String noRoom = sc.next();
		    	System.out.print("Enter City : ");
		    	String city = sc.next();
		    	pr.printProperty(acs.searchByRoomAndCity(noRoom , city));
		    	
		    }
			
			static void choice() {
				System.out.println("Property Search System");
				System.out.println("1 Add New Property");
				System.out.println("2 Update Property Cost");
				System.out.println("3 Delete Property");
				System.out.println("4 Search Property By City");
				System.out.println("5 View All Property");
				System.out.println("6 Search Property By Cost");
				System.out.println("7 Search Property By Rooms and City");
				System.out.println("8 Exit");
				
				System.out.print("Enter Choice : ");
			}
		
			
			//main
			
			public static void main(String args[]){
				Entry obj = new Entry();
				Scanner sc = new Scanner(System.in);
				choice();
				while(sc.hasNext()) {
					
					int option = sc.nextInt();
					
					switch(option) {
					case 1:
						obj.insertProperty();
						break;
					case 2:
						obj.updatePropertyCost();
						break;
					case 3:
						obj.deleteProperty();
						break;
					case 4:
						obj.searchByCity();
						break;
					case 5:
						obj.showAllProperty();
						break;
					case 6:
						obj.searchByCost();
						break;
					case 7:
						obj.searchByRoomAndCity();
						break;
					case 8:
						return;
					default:
						System.out.println("Invalid Option");
						
					}
					choice();
				}
				
				sc.close();
					
			}
}
			
