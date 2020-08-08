package contaBancaria;

public class ContaPoupancaEspecial extends ContaPoupanca {

	private boolean cartaoDebito;
	
	public ContaPoupancaEspecial() {
		super();
	}

	public ContaPoupancaEspecial(int numero, String titular, double saldo, double rendimento, boolean cartaoDebito) {
		super(numero, titular, saldo, rendimento);
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
		return "\n*ContaPoupancaEspecial\ncartaoDebito: " + cartaoDebito + "\nrendimento: " + this.getRendimento() + "\nnumero: "
				+ this.getNumero() + "\ntitular: " + this.getTitular() + "\nsaldo: " + this.getSaldo();
	}


}
