package contaBancaria;

public class Conta {

	// o que uma conta tem
	private int numero;
	private String titular;
	private double saldo;
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Conta() {
		System.out.println("\nConta aberta pelo construtor default");
		System.out.println("Numero: " + this.numero);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	}

	public Conta(String titular, int numero, double saldo) {
		
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		
		
		System.out.println("\nConta aberta pelo contrutor com 3 parametro");
		System.out.println("Numero: " + this.numero);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	}


	public boolean sacar(double valor) {
		
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	public boolean transfere(Conta destino, double valor) {
		
		boolean retirou = this.sacar(valor);
		
		if (retirou == false) {
			// não deu pra fazer a transfêrencia!
			return false;
		}
		else {
			destino.depositar(valor);
			return true;
		}
	}
	
	public void depositar(double valor) {
		
		this.saldo = this.saldo + valor;
	}

}
