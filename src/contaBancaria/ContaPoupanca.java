package contaBancaria;

public class ContaPoupanca extends Conta {

	protected double rendimento;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	public ContaPoupanca(String titular, int numero, double saldo, double rendimento) {
		super(titular, numero, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "\n*ContaPoupanca\nrendimento: " + rendimento + "\ngetNumero(): " + getNumero() + "\ngetSaldo(): "
				+ getSaldo() + "\ngetNumeroContas(): " + getNumeroContas() + "\ngetTitular(): " + getTitular();
	}
	
}
