package app;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		String nombre;
		String genero = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos del Cliente:");
		System.out.println("Nombre: ");
		nombre = scanner.nextLine();
		//while ((genero!="m") && (genero!="f")) {
			System.out.println("Genero (ingrese m/f): ");
			genero = scanner.nextLine();
		//}
		
		System.out.println("Creando Cliente...");
		Cliente cli = new Cliente(nombre, genero);
		System.out.println("Creando Cuenta...");
		Cuenta cuenta = new Cuenta(10000, cli);
		
		System.out.println(cuenta.toString());
	}

}
