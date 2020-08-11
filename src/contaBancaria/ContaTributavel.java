package contaBancaria;

public abstract class ContaTributavel extends Conta {

	static final double tributo = 0.10;

	public ContaTributavel() {super();}
	public ContaTributavel(int numero, String cpf, String tipo, double saldo) {
		super(numero, cpf, tipo, saldo);
		// TODO Auto-generated constructor stub
	}

	
}
