package com.unisys.SpringCoreDemo;

public class Address {
	private String street;
	private String city;
	private long postalCode;
	
	public Address() {
		
	}

	public Address(String street, String city, long postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	
	
}
