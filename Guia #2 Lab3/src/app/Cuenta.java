package app;

public class Cuenta {
	
	private float saldo;
	
	public Cuenta() {
		saldo = 0;
	}
	
	public Cuenta(float saldo){
		this.saldo = saldo;
	}
	
	public void ingresar(float saldo) {
		this.saldo += saldo;
	}

	public void extraer(float extraccion){
		if(this.saldo - extraccion >= 0) {
			this.saldo -= extraccion;
			System.out.println("Saldo extraido con exito");
		}
		else  System.out.println("El saldo actual es menor a lo que desea extrael"); 
	}
	
	public float getSaldo() {
		return saldo;
	}
}
