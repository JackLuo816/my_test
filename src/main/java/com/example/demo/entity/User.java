package com.example.demo.entity;

public class User {
   private Integer ID;
   private String NAME;
   private String ADDRESS;
   private String CITY;

public Integer getID() {
	return ID;
}
public void setID(Integer iD) {
	ID = iD;
}
public String getNAME() {
	return NAME;
}
public void setNAME(String nAME) {
	NAME = nAME;
}
public String getADDRESS() {
	return ADDRESS;
}
public void setADDRESS(String aDDRESS) {
	ADDRESS = aDDRESS;
}
public String getCITY() {
	return CITY;
}
public void setCITY(String cITY) {
	CITY = cITY;
}
@Override
public String toString() {
	return "User [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + "]";
}
 
   
}