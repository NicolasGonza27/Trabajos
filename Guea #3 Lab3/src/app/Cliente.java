package app;

public class Cliente implements Utiles{
	// id, nombre y género (M o F) 
	private int id;
	private String nombre;
	private String genero;
	
	public Cliente() {
		id = randomN();
		nombre = "";
		genero = "";
	}
	
	public Cliente(String nombre, String genero) {
		id = randomN();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public String getGeneroString() {
		if(genero == "m") {
			return "Masculino";
		}
		if(this.genero == "f") {
			return "Femenino";
		}
		else return "Genero no ingresado";
	}
	
	@Override
	public String toString() {
		return "Id del cliente: "+this.id+"\n Nombre: "+this.nombre+"\n Genero: "+this.getGeneroString();
	}
}
