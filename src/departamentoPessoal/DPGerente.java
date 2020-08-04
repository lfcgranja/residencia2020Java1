package departamentoPessoal;

public abstract class DPGerente extends DPFuncionario{

	private int numFuncionarios;

	public DPGerente() {
		super();
	}

	public DPGerente(String nome, String cpf, double salario, int numFuncionarios) {
		super(nome, cpf, salario);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

}
