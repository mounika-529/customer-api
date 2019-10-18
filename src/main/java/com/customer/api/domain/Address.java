package com.customer.api.domain;

public class Address {

	private int addressId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	private String customerId;

	public Address() {
	}

	public Address(int addressId, String line1, String line2, String city, String state, String zip,
			String customerId) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.customerId = customerId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", customerId=" + customerId + "]";
	}

}
