package com.amdocs.propertysearch.dao;
import com.amdocs.propertysearch.pojo.*;
import java.sql.*;
import java.util.ArrayList;

public class PropertyDAO {
	
	DbConnection db = new DbConnection();
	Connection c = db.getConnection();
	
	//add Property
	
	public int addProperty(Property p) {
		int count  = 0;
		try {
			PreparedStatement pst = c.prepareStatement("INSERT INTO property VALUES(?,?,?,?,?,?,?,?,?)");
			pst.setInt(1,p.getpropertyId());
			pst.setString(2, p.getNoOfRooms());
			pst.setDouble(3, p.getArea());
			pst.setInt(4, p.getFloorNo());
			pst.setString(5, p.getCity());
			pst.setString(6, p.getState());
			pst.setDouble(7, p.getCost());
			pst.setString(8, p.getOwnerName());
			pst.setString(9, p.getOwnerContactNo());
			count = pst.executeUpdate();
			System.out.println("Property Added");
		}catch(SQLException e) {
			System.out.println("Unable To Add Property : " + e.getMessage() );
		}
		return count;
	}
	
	//delete property
	
	public int deleteProperty(int id) {
		int count = 0;
		
		try {
			PreparedStatement pst = c.prepareStatement("delete from property where propertyid=?");
			pst.setInt(1, id);
			count = pst.executeUpdate();
			System.out.println("Property Deleted");
		} catch (SQLException e) {
			System.out.println("Unable To Delete Property : " + e.getMessage() );
			}
		
		
		return count;
	}
	
	//update cost of property
	
	public boolean updatePropertyCost(int id , double cost) {

		
		try {
			PreparedStatement pst = c.prepareStatement("update property SET cost=? WHERE propertyid=?");
			pst.setDouble(1, cost);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("Property Price Updated");
			return true;
		} catch (SQLException e) {
			System.out.println("Unable To Update Cost : " + e.getMessage() );
		}
		
		
		return false;
	}
	
	//search by city
	
	public ArrayList<Property> searchByCity(String city){
		
		ArrayList<Property> pr = new ArrayList<Property>();
		try {
			PreparedStatement pst = c.prepareStatement("select * from property where LOWER(city) LIKE LOWER(?)");
			pst.setString(1, city);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Property prop = new Property(rs.getInt("propertyid"),rs.getString("noofrooms"),rs.getInt("floorno"),
						rs.getString("city"),rs.getString("state"),rs.getDouble("cost"),rs.getString("ownername"),rs.getString("ownercontactno"),
						rs.getDouble("area"));
				pr.add(prop);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Search fail : " + e.getMessage() );
		}
		
		return pr;
		
	}
	
	//show all property
	
	public ArrayList<Property> showAllProperty(){
		
		ArrayList<Property> pr = new ArrayList<Property>();
		try {
			PreparedStatement pst = c.prepareStatement("select * from property");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Property prop = new Property(rs.getInt("propertyid"),rs.getString("noofrooms"),rs.getInt("floorno"),
						rs.getString("city"),rs.getString("state"),rs.getDouble("cost"),rs.getString("ownername"),rs.getString("ownercontactno"),
						rs.getDouble("area"));
				pr.add(prop);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Search fail : " + e.getMessage() );
		}
		
		return pr;
		
	}
	
	//search by cost
	
public ArrayList<Property> searchByCost(double low , double high){
		
		ArrayList<Property> pr = new ArrayList<Property>();
		try {
			PreparedStatement pst = c.prepareStatement("select * from property where cost between ? and ?");
			pst.setDouble(1,low);
			pst.setDouble(2,high);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Property prop = new Property(rs.getInt("propertyid"),rs.getString("noofrooms"),rs.getInt("floorno"),
						rs.getString("city"),rs.getString("state"),rs.getDouble("cost"),rs.getString("ownername"),rs.getString("ownercontactno"),
						rs.getDouble("area"));
				pr.add(prop);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Search fail : " + e.getMessage() );
		}
		
		return pr;
		
	}

	//search by room and city
	public ArrayList<Property> searchByRoomAndCity(String noOfRooms,String city){
	
	ArrayList<Property> pr = new ArrayList<Property>();
	try {
		PreparedStatement pst = c.prepareStatement("select * from property where noofrooms=? and LOWER(city) LIKE LOWER(?)");
		pst.setString(1,noOfRooms);
		pst.setString(2,city);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Property prop = new Property(rs.getInt("propertyid"),rs.getString("noofrooms"),rs.getInt("floorno"),
					rs.getString("city"),rs.getString("state"),rs.getDouble("cost"),rs.getString("ownername"),rs.getString("ownercontactno"),
					rs.getDouble("area"));
			pr.add(prop);
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Search fail : " + e.getMessage() );
	}
	
	return pr;
	
}
	
	
	
}
