package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre;
		String apellido;
		String email;
		String genero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos del Autor:");
		System.out.println("Nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Apellido: ");
		apellido = scanner.nextLine();
		System.out.println("Email: ");
		email = scanner.nextLine();
		System.out.println("Genero: ");
		genero = scanner.nextLine();
		
		System.out.println("Creando Autor...");
		Autor aut = new Autor(nombre, apellido, email, genero);
		
		System.out.println(aut.toString());
		
		String titulo;
		float precio;
		int stock;
		Autor autor;
		
		System.out.println("Ingrese los datos del Libro:");
		System.out.println("Titulo: ");
		titulo = scanner.nextLine();
		System.out.println("Precio: ");
		precio = scanner.nextFloat();
		System.out.println("Stock: ");
		stock = scanner.nextInt();
		
		Libro libro = new Libro(titulo, precio, stock, aut);
		
		System.out.println(libro.toString());
	}

}
