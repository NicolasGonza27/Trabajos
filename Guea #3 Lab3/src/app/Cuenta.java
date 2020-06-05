package app;

public class Cuenta implements Utiles{
	//un identificador, un balance y un Cliente
	private int id;
	private float balance;
	private Cliente cliente;
	
	public Cuenta() {
		id = randomN();
		balance = 0;
		cliente = null;
	}
	
	public Cuenta(float balance, Cliente cli) {
		id = randomN();
		this.balance = balance;
		this.cliente = cli;
	}
	
	public void depositar(float num) {
		this.balance += num;
	}
	
	public void extraer(float num) {
		if((this.balance -= num)< 0.00) {
			System.out.println("La cuenta no posee saldo suficiente");
		}
		else this.balance -= num;
	}
	
	@Override
	public String toString() {
		return "Id de la cuenta: "+this.id+", balance $"+this.balance+"\n Cliente: "+cliente.toString();
	}
}
