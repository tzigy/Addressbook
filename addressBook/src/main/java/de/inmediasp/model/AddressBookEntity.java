package de.inmediasp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressBookEntity {
	
	private String firstname;
	private String lastname;
//	private String street;
//	private int postcode;
//	private String city;
//	private String country;
	private String email;
//	private String phone;
	
	
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
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public int getPostcode() {
//		return postcode;
//	}
//	public void setPostcode(int postcode) {
//		this.postcode = postcode;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	
	

}
