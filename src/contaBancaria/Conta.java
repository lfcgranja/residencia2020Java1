package contaBancaria;

public abstract class Conta {
	
	static final int numeroBanco = 237;
	
	private int numero;
	private String cpf;
	private String tipo;
	private double saldo;
	
	
	public abstract boolean sacar(double valor);
	public abstract boolean transfere(Conta destino, double valor);
	public abstract void depositar(double valor);
	public abstract void depositarDeTransferencia(double valor);
	
	public Conta() {}
	
	public Conta(int numero, String cpf, String tipo, double saldo) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public static int getNumerobanco() {
		return numeroBanco;
	}
	
	
}
