package contaBancaria;

public class ContaCorrente extends Conta {

	protected double tarifa;
	protected double limite;
	
	public ContaCorrente() {
	}

	public ContaCorrente(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}
	
	public ContaCorrente(String titular, int numero, double saldo, double tarifa, double limite) {
		super(titular, numero, saldo);
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "\n*ContaCorrente\ntarifa: " + tarifa + "\nlimite: " + limite + "\ngetNumero(): " + getNumero()
				+ "\ngetSaldo(): " + getSaldo() + "\ngetNumeroContas(): " + getNumeroContas() + "\ngetTitular(): "
				+ getTitular();
	}

}
