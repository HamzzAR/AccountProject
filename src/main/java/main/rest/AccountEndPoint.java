package main.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.service.AccountService;

@Path("/account")
public class AccountEndPoint {

	@Inject
	private AccountService service;
	
	public void setService(AccountService service) {
		this.service = service;
	}
	
	@Path("/addAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	
	@Path("/getAccount/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAccount(@PathParam("id") Integer id) {
		return service.getAccount(id);
	}
}
 