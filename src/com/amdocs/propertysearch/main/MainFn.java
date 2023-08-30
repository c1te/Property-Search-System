
package com.amdocs.propertysearch.main;

import java.util.Scanner;
import com.amdocs.propertysearch.dao.PropertyDAO;
import com.amdocs.propertysearch.pojo.Property;

public class MainFn {
	public static void main(String args[]){
		Entry obj = new Entry();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
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
			
			int option = sc.nextInt();
		}
		
		sc.close();
			
	}
}
