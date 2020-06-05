package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.Crear una cuenta vacia");
		System.out.println("2.Crear cuenta saldo inicial");
		System.out.println("3.Ingresar dinero");
		System.out.println("4.Sacra dinero");
		System.out.println("5.Ver saldo");
		System.out.println("6.Salir");
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		int op = 1;
		Cuenta cuenta = null;
		while(op !=0) {
			switch (scanner.nextInt()) {
			case 1:
				cuenta = new Cuenta();
				break;
			case 2:
				System.out.println("Ingrese el saldo inicial: ");
				cuenta = new Cuenta(scanner2.nextFloat());
				break;
			case 3:
				if(cuenta != null) {
					System.out.println("Dinero ha ingresar: ");
					cuenta.ingresar(scanner2.nextFloat());
				}
				else System.out.println("No ha creado una cuenta.");
				break;
			case 4:
				if(cuenta != null) {
					System.out.println("Dinero ha extraer: ");
					cuenta.extraer(scanner2.nextFloat());
				}
				else System.out.println("No ha creado una cuenta.");
				break;
			case 5:
				if(cuenta != null) {
					System.out.println(cuenta.getSaldo());
				}
				else System.out.println("No ha creado una cuenta.");
				break;
			case 6:
				System.out.println("Saliendo...");
				op = 0;
				break;
			default:
				System.out.println("Opcion no valida.");
				break;
			}
		}

	}

}
