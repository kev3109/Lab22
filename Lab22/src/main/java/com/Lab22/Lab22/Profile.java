package com.Lab22.Lab22;

import org.springframework.stereotype.Component;

// this is creating pojo basically packaging all of the data in one thing 
// so i dont have to call everything separately
// create the private fields as so, then generate getters and setters, generate the ToString
// Generate constructors from super class then generate constructors using fields. 
//THIS IS POJO!!!!!!!!!!!
@Component //this antonation is needed to inject the information into the object thats in the controller. 
public class Profile {
private String firstname;
private String lastname;
private String email;
private String phonenumber;
private String password;

	

public Profile(String firstname, String lastname, String email, String phonenumber, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phonenumber = phonenumber;
	this.password = password;
}
public Profile() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Profile [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phonenumber="
			+ phonenumber + ", password=" + password + "]";
}

}
