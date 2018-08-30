package nu.java.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("app")
public class APIService {

	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name) {

		String output = "Welcome : " + name;

		return Response.status(200).entity(output).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json-string")
	public String jsonString() {

		return "{\"name\" : \"Insert Name Here\"}";

	}
}
