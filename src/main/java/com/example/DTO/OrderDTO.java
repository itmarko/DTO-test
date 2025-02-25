package com.example.DTO;

public class OrderDTO {
	private String customerFirstName;
	private String customerLastName;
	private String billingStreet;
	private String billingCity;

	public OrderDTO() {
	}

	public OrderDTO(String customerFirstName, String customerLastName, String billingStreet, String billingCity) {

		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.billingStreet = billingStreet;
		this.billingCity = billingCity;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getBillingStreet() {
		return billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

}
