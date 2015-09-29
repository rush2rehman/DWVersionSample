package com.mycompany.DWVersionSample.api.v1.serviceInterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/v1/Orders")
@Consumes({"application/vnd.order.v1.0+json","application/vnd.order.v1.1+json"})
@Produces({"application/vnd.order.v1.0+json","application/vnd.order.v1.1+json"})
public interface OrderServiceV1 {
	
	@GET
	@Path("/{param}")
	public Response getOrder(@PathParam("param") String name, @HeaderParam("Accept") String accept);
	
	@POST
	public Response createOrder();

}
