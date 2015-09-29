package com.mycompany.DWVersionSample.service;

public class OrderV2_1 {

	private String orderId;
	private String customerName;
	private String title;
	private String fulfilmentOpionId;
	private String orderName;

	

	public OrderV2_1(String id, String name, String title, 
			String fulfilmentOptionId, String ordername){
		this.orderId = id;
		this.customerName = name;
		this.title = title;
		this.fulfilmentOpionId = fulfilmentOptionId;
		this.orderName = ordername;

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


	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
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
