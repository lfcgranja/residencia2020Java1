package contaBancaria;

public class ContaPoupancaEspecial extends ContaPoupanca {

	private boolean cartaoDebito;
	
	public ContaPoupancaEspecial() {
		super();
	}

	public ContaPoupancaEspecial(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}

	public ContaPoupancaEspecial(String titular, int numero, double saldo, double rendimento) {
		super(titular, numero, saldo, rendimento);
	}

	public ContaPoupancaEspecial(String titular, int numero, double saldo, double rendimento, boolean cartaoDebito) {
		super(titular, numero, saldo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public boolean isCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(boolean cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	@Override
	public String toString() {
		return "\n*ContaPoupancaEspecial\ncartaoDebito: " + cartaoDebito + "\nrendimento: " + rendimento + "\nnumero: "
				+ numero + "\ntitular: " + titular + "\nsaldo: " + saldo;
	}


}
