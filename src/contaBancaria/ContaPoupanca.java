package contaBancaria;

public class ContaPoupanca extends Conta {

	private double rendimento;

	public ContaPoupanca() {}
	


	public ContaPoupanca(int numero, String cpf, String tipo, double saldo, double rendimento) {
		super(numero, cpf, tipo, saldo);
		this.rendimento = rendimento;
	}



	@Override
	public boolean sacar(double valor) {
		if (this.getSaldo() < valor) {
			return false;
		} 
		else {
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo(novoSaldo);
			return true;
		}
	}
	
	@Override
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			return false;
		}
		else {
			destino.depositar(valor);
			return true;
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
	public void depositarDeTransferencia(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	//getters e setters

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}



	@Override
	public String toString() {
		return "\n*ContaPoupanca\nrendimento: " + rendimento + "\ngetNumero(): " + getNumero() + "\ngetCpf(): "
				+ getCpf() + "\ngetSaldo(): " + getSaldo();
	}
	
	
	
}
