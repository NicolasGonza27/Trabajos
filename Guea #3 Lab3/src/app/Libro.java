package app;

public class Libro {
	private String titulo;
	private float precio;
	private int stock;
	private Autor autor;
	
	public Libro() {
		this.autor = new Autor();
	}
	
	public Libro(String titulo,float precio, int stock, Autor obj) {
		this.titulo = titulo;
		this.precio = precio;
		this.stock = stock;
		this.autor = new Autor(obj);
	}
	
	@Override
	public String toString() {
		return this.titulo+" del Autor "+this.autor.getNombre()+" que cuesta "+this.precio+" con una cantidad de "+this.stock+" copias";
	}

}
