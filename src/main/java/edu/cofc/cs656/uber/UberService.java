package edu.cofc.cs656.uber;

import java.util.ArrayList;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.edu.cofc.cs656.models.User;

@Path("/ubercustomers")
public class UberService {

	  private final ArrayList<User> cList = UberUserList.getInstance();

	  @GET
	  @Path("/all")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getAllCustomers() {
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    return "---Uber User List---\n" +
	  		  gson.toJson(cList);
	  }	
	  
	  @GET
	  @Path("{id}")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getCustomer(@PathParam("id") long id) {
	    Optional<User> match
	        = cList.stream()
	        .filter(c -> c.getUserID() == id)
	        .findFirst();
	    
	    if (match.isPresent()) {
	    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      return "---Uber User---\n" + gson.toJson(match.get());
	    } else {
	      return "Uber User not found";
	    }
	  }
}
