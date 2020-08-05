package departamentoPessoal;

public abstract class DPGerente extends DPFuncionario{

	private int numFuncionarios;

	public DPGerente() {
		super();
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

}
