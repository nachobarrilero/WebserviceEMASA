
public class Proveedor {

	String nombre;
	String direccion;



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

}