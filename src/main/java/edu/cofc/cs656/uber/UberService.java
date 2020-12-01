package edu.cofc.cs656.uber;

import java.util.ArrayList;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;

@Path("/ubercustomers")
public class UberService {

	private final ArrayList<Customer> cList = CustomerList.getInstance();

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer[] getAllCustomers() {
		return cList.toArray(new Customer[0]);
	}	

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("id") long id) {
		Optional<Customer> match
		= cList.stream()
		.filter(c -> c.getId() == id)
		.findFirst();

		if (match.isPresent()) {
			return match.get();
		} else {
			throw new NotFoundException(new JsonError("Error", "Customer " + id + " not found"));
		}
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCustomer(Customer customer){
		cList.add(customer);
		return Response.status(201).build();
	}   
}
