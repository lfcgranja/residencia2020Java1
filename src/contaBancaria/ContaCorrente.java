package contaBancaria;

public class ContaCorrente extends ContaTributavel {

	//Atributos

	private double tarifa;
	private double limite;
	static int numeroContas;
	
	//Construtores
	public ContaCorrente() {super(); numeroContas++;}
	

	public ContaCorrente(int numero, String cpf, String tipo, double saldo, double tarifa, double limite) {
		super(numero, cpf, tipo, saldo);
		this.tarifa = tarifa;
		this.limite = limite;
		numeroContas++;
	}

	@Override
	public boolean sacar(double valor) {
		if (this.getSaldo() < valor + tributo) {
			return false;
		} 
		else {
			double novoSaldo = this.getSaldo() - valor - tributo;
			this.setSaldo(novoSaldo);
			return true;
		}
	}
	
	@Override
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.sacar(valor + tributo);
		if (retirou == false) {
			return false;
		}
		else {
			destino.depositarDeTransferencia(valor);
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
				+ "\ngetCpf(): " + getCpf() + "\ngetSaldo(): " + getSaldo();
	}


}
