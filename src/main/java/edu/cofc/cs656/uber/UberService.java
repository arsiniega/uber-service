package edu.cofc.cs656.uber;

import java.util.ArrayList;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.edu.cofc.cs656.models.User;

@Path("/ubercustomers")
public class UberService {

	  private final ArrayList<User> cList = UberUserList.getInstance();

	  @GET
	  @Path("/all")
	  @Produces(MediaType.APPLICATION_JSON)
	  public User[] getAllCustomers() {
		  return cList.toArray(new User[0]);
	  }	
	  
	  @GET
	  @Path("{id}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public User getCustomer(@PathParam("id") long id) {
	    Optional<User> match
	        = cList.stream()
	        .filter(c -> c.getUserID() == id)
	        .findFirst();
	    
	    if (match.isPresent()) {
	    	return match.get();
	    }
	    return null;
	  }
}
