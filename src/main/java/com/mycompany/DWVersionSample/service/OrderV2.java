package com.mycompany.DWVersionSample.service;

public class OrderV2 {

	private String orderId;
	private String customerName;
	private String title;
	private String fulfilmentOpionId;


	public OrderV2(String id, String name, String title, String fulfilmentOptionId){
		this.orderId = id;
		this.customerName = name;
		this.title = title;
		this.fulfilmentOpionId = fulfilmentOptionId;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFulfilmentOpionId() {
		return fulfilmentOpionId;
	}

	public void setFulfilmentOpionId(String fulfilmentOpionId) {
		this.fulfilmentOpionId = fulfilmentOpionId;
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
