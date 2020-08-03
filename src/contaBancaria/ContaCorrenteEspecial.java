package contaBancaria;

public class ContaCorrenteEspecial extends ContaCorrente {

	private boolean cartaoDeCredito;
	private boolean investimento;
	
	public ContaCorrenteEspecial() {
		super();
	}

	public ContaCorrenteEspecial(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}

	public ContaCorrenteEspecial(String titular, int numero, double saldo, double tarifa, double limite) {
		super(titular, numero, saldo, tarifa, limite);
	}	

	public ContaCorrenteEspecial(String titular, int numero, double saldo, double tarifa, double limite, boolean cartaoDeCredito, boolean investimento) {
		super(titular, numero, saldo, tarifa, limite);
		this.cartaoDeCredito = cartaoDeCredito;
		this.investimento = investimento;
	}

	public boolean isCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(boolean cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public boolean isInvestimento() {
		return investimento;
	}

	public void setInvestimento(boolean investimento) {
		this.investimento = investimento;
	}

	@Override
	public String toString() {
		return "\n*ContaCorrenteEspecial\ncartaoDeCredito: " + cartaoDeCredito + "\ninvetimento: " + investimento
				+ "\ntarifa: " + tarifa + "\nlimite: " + limite + "\ngetNumero(): " + getNumero() + "\ngetSaldo(): "
				+ getSaldo() + "\ngetNumeroContas(): " + getNumeroContas() + "\ngetTitular(): " + getTitular();
	}
}
