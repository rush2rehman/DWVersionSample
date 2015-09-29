package com.mycompany.DWVersionSample.service;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


public class OrderService {
	
	
	public Response getOrderV20(@PathParam("param") String name)
	{
		JSONObject jsonObj = new JSONObject( new OrderV2("1", name, "Mr", "foid123") );
		return Response.status(200).entity(jsonObj.toString()).build();
	}
	
	public Response getOrderV21(@PathParam("param") String name)
	{
		JSONObject jsonObj = new JSONObject( new OrderV2_1("1", name, "Mr", "foid123", "salesorder") );
		return Response.status(200).entity(jsonObj.toString()).build();
	}
	
	public Response getOrderV10(@PathParam("param") String name)
	{
		JSONObject jsonObj = new JSONObject( new OrderV1("1", name) );
		return Response.status(200).entity(jsonObj.toString()).build();
	}
	
	public Response getOrderV11(@PathParam("param") String name)
	{
		JSONObject jsonObj = new JSONObject( new OrderV1_1("1", name, "Mr") );
		return Response.status(200).entity(jsonObj.toString()).build();
	}
	
	public Response createOrder()
	{
		return Response.status(200).entity("order created").build();
	}
	
	public Response createOrderV2()
	{
		return Response.status(200).entity("order created").build();
	}
	
	public Response updateOrder()
	{
		//new Order("1", name);
		//JSONObject input = (JSONObject)jsonInput;
		//JSONObject jsonObj = new JSONObject( input );
		return Response.status(200).entity("order updated").build();
	}

}
