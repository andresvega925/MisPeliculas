package logic.object;

public class Pelicula {

	
	private String id;
	private String genero;
	private String nombre;

	
	public Pelicula(String id, String nombre, String genero){
		
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", genero=" + genero + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
