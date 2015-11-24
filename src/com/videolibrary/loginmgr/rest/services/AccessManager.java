package com.videolibrary.loginmgr.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import com.videolibrary.loginmgr.model.SubscriberRequest;
import com.videolibrary.loginmgr.model.SubscriberResponse;

@Consumes("application/json")
@Produces("application/json")
public interface AccessManager {
	
	@POST
	@Path("/LoginById/")
	public SubscriberResponse LoginById(SubscriberRequest request);
	
	@GET
	@Path("/LogOut/{id}")
	public SubscriberResponse LogOut(@PathParam("id") Integer id);

}
