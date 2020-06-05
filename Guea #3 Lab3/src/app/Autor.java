package app;

public class Autor {
	//nombre, apellido, email y genero ( ‘M’ o ‘F’ ).
	private String nombre;
	private String apellido;
	private String email;
	private String genero;
	
	public Autor() {
		this.nombre = null;
		this.apellido = null;
		this.email = null;
		this.genero = null;
	}
	
	public Autor(String nombre, String apellido, String email, String genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
	}
	
	public Autor(Autor obj) {
		this.nombre = obj.nombre;
		this.apellido = obj.apellido;
		this.email = obj.email;
		this.genero = obj.genero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return "Autor "+this.nombre+" "+this.apellido+", correo electronico "+this.email+", genero "+this.genero;
	}
	
}
