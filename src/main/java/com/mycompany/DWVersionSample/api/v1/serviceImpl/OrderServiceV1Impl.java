package com.mycompany.DWVersionSample.api.v1.serviceImpl;
import javax.ws.rs.core.Response;

import com.mycompany.DWVersionSample.api.v1.serviceInterface.OrderServiceV1;
import com.mycompany.DWVersionSample.service.OrderService;;

public class OrderServiceV1Impl implements OrderServiceV1{

	
private OrderService orderService;
	
	public OrderServiceV1Impl()
	{
		this.orderService = new OrderService();
	}
	
	@Override
	public Response getOrder(String name, String accept) {
		
		String version = "";
		if(accept != null & accept.length() > 26)
		{
			 version = accept.substring(22, 26);
		}
	
		System.out.println("Version-->"+version);
		if (version.equalsIgnoreCase("V1.0"))
		{
			return orderService.getOrderV10(name );
		}
		else if(version.equalsIgnoreCase("V1.1"))
		{
			return orderService.getOrderV11(name );
		}
		else
		{
			return orderService.getOrderV11(name );
		}
		
	}

	@Override
	public Response createOrder() {
		return orderService.createOrderV2();
		
	}

}
