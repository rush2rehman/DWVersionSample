package com.mycompany.DWVersionSample.service;

public class OrderV1 {

	private String orderId;
	private String customerName;
	
	public OrderV1(String id, String name){
		this.orderId = id;
		this.customerName = name;
				
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
