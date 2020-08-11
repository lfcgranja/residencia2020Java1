package departamentoPessoal;

public class DPGerente extends DPFuncionario{

	private int numFuncionarios;

	public DPGerente() {
		super();
	}
	
	

	public DPGerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);

	}



	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}



	@Override
	public double getPLR() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String getBonificacao() {
		// TODO Auto-generated method stub
		return null;
	}

}
