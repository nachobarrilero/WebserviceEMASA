import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/proveedor")
public class ProveedoresWS {

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Proveedor getProveedorById(@PathParam("id") String id) {

	   Proveedor p = new Proveedor();
	   p.setNombre("BARRILERO");
	   p.setDireccion("FENIX8");
	   
	   return p;

	}

}