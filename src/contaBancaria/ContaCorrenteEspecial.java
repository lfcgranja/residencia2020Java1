package contaBancaria;

public class ContaCorrenteEspecial extends ContaCorrente {

	private boolean cartaoDeCredito;
	private boolean invetimento;
	
	public ContaCorrenteEspecial() {
	}

	public ContaCorrenteEspecial(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
	}

	public ContaCorrenteEspecial(String titular, int numero, double saldo, double tarifa, double limite) {
		super(titular, numero, saldo, tarifa, limite);
	}	

	public ContaCorrenteEspecial(String titular, int numero, double saldo, double tarifa, double limite, boolean cartaoDeCredito, boolean invetimento) {
		super(titular, numero, saldo, tarifa, limite);
		this.cartaoDeCredito = cartaoDeCredito;
		this.invetimento = invetimento;
	}

	public boolean isCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(boolean cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public boolean isInvetimento() {
		return invetimento;
	}

	public void setInvetimento(boolean invetimento) {
		this.invetimento = invetimento;
	}

	@Override
	public String toString() {
		return "\n*ContaCorrenteEspecial\ncartaoDeCredito: " + cartaoDeCredito + "\ninvetimento: " + invetimento
				+ "\ntarifa: " + tarifa + "\nlimite: " + limite + "\ngetNumero(): " + getNumero() + "\ngetSaldo(): "
				+ getSaldo() + "\ngetNumeroContas(): " + getNumeroContas() + "\ngetTitular(): " + getTitular();
	}
}
