package com.mycompany.DWVersionSample.api.v2.serviceImpl;

import javax.ws.rs.core.Response;

import com.mycompany.DWVersionSample.api.v2.serviceInterface.OrderServiceV2;
import com.mycompany.DWVersionSample.service.OrderService;


public class OrderServiceV2Impl implements OrderServiceV2{


	private OrderService orderService;
	
	public OrderServiceV2Impl()
	{
		this.orderService = new OrderService();
	}
	
	@Override
	public Response getOrder(String name,String accept) {
		
		
		String version = "";
		if(accept != null & accept.length() > 26)
		{
			 version = accept.substring(22, 26);
		}
	
		System.out.println("Version-->"+version);
		if (version.equalsIgnoreCase("V2.0"))
		{
			return orderService.getOrderV20(name );
		}
		else if(version.equalsIgnoreCase("V2.1"))
		{
			return orderService.getOrderV21(name );
		}
		else
		{
			return orderService.getOrderV21(name );
		}
		
	}

	@Override
	public Response createOrder() {
		return orderService.createOrder();
		
	}

	@Override
	public Response updateOrder() {
		// TODO Auto-generated method stub
		return orderService.updateOrder();
	}

}
