package pessoal;

public class Operador extends Funcionario {

	private double fundoCaixa;
	
	public Operador() {
	}

	public Operador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getFundoCaixa() {
		return fundoCaixa;
	}

	public void setFundoCaixa(double fundoCaixa) {
		this.fundoCaixa = fundoCaixa;
	}

	@Override
	public String toString() {
		return "\n*Operador\nfundoCaixa: " + fundoCaixa + "\nnome: " + nome + "\ncpf: " + cpf + "\nsalario: " + salario;
	}

	
}
