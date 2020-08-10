package pessoal;

public class Operador extends Funcionario {

	private double fundoCaixa;
	
	public Operador() {
	}

	public Operador(String nome, String cpf, String tipo, String senha, double salario) {
		super(nome, cpf, tipo, senha, salario);
	}

	public double getFundoCaixa() {
		return fundoCaixa;
	}

	public void setFundoCaixa(double fundoCaixa) {
		this.fundoCaixa = fundoCaixa;
	}

}
