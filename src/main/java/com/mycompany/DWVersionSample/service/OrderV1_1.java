package com.mycompany.DWVersionSample.service;

public class OrderV1_1 {

	private String orderId;
	private String customerName;
	private String title;
	
	public OrderV1_1(String id, String name, String title){
		this.orderId = id;
		this.customerName = name;
		this.title = title;
				
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
