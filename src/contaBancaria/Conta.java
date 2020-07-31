package contaBancaria;

public class Conta {
	private static int numeroContas = 0;

	// Atributos
	private int numero;
	private String titular;
	private double saldo;
	
	// Construtores
	public Conta() {
		Conta.numeroContas++;
	}

	public Conta(String titular, int numero, double saldo) {
		Conta.numeroContas++;
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	//Metodos
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
			// n�o deu pra fazer a transf�rencia!
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroContas() {
		return numeroContas;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "\n*Conta\nnumero: " + numero + "\ntitular: " + titular + "\nsaldo: " + saldo;
	}
	
	
}
