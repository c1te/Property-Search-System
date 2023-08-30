package com.amdocs.propertysearch.pojo;

public class Property{
  private int propertyId;
  private String noOfRooms;
  private int floorNo;
  private String city;
  private String state;
  private double cost;
  private String ownerName;
  private String ownerContactNo;
  private double area;

public Property(int propertyId, String noOfRooms, int floorNo, String city, String state, double cost, String ownerName,
		String ownerContactNo, double area) {
	this.propertyId = propertyId;
	this.noOfRooms = noOfRooms;
	this.floorNo = floorNo;
	this.city = city;
	this.state = state;
	this.cost = cost;
	this.ownerName = ownerName;
	this.ownerContactNo = ownerContactNo;
	this.area = area;
	
}
/**
 * @return the proprtyId
 */
public int getpropertyId() {
	return propertyId;
}
/**
 * @param proprtyId the proprtyId to set
 */
public void setpropertyId(int proprtyId) {
	this.propertyId = proprtyId;
}
/**
 * @return the noOfRooms
 */
public String getNoOfRooms() {
	return noOfRooms;
}
/**
 * @param noOfRooms the noOfRooms to set
 */
public void setNoOfRooms(String noOfRooms) {
	this.noOfRooms = noOfRooms;
}
/**
 * @return the floorNo
 */
public int getFloorNo() {
	return floorNo;
}
/**
 * @param floorNo the floorNo to set
 */
public void setFloorNo(int floorNo) {
	this.floorNo = floorNo;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the cost
 */
public double getCost() {
	return cost;
}
/**
 * @param cost the cost to set
 */
public void setCost(double cost) {
	this.cost = cost;
}
/**
 * @return the ownerName
 */
public String getOwnerName() {
	return ownerName;
}
/**
 * @param ownerName the ownerName to set
 */
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
/**
 * @return the ownerContactNo
 */
public String getOwnerContactNo() {
	return ownerContactNo;
}
/**
 * @param ownerContactNo the ownerContactNo to set
 */
public void setOwnerContactNo(String ownerContactNo) {
	this.ownerContactNo = ownerContactNo;
}
/**
 * @return the area
 */
public double getArea() {
	return area;
}
/**
 * @param area the area to set
 */
public void setArea(double area) {
	this.area = area;
}
  
  }

