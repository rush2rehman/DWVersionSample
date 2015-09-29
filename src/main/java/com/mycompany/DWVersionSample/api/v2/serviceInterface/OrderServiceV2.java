package com.mycompany.DWVersionSample.api.v2.serviceInterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/v2/Orders")
@Consumes({"application/vnd.order.v2.0+json","application/vnd.order.v2.1+json"})
@Produces({"application/vnd.order.v2.0+json","application/vnd.order.v2.1+json"})
public interface OrderServiceV2 {
	
	@GET
	@Path("/{param}")
	public Response getOrder(@PathParam("param") String name, @HeaderParam("Accept") String accept);
	
	@POST
	public Response createOrder();
	
	@PUT
	public Response updateOrder();

}
