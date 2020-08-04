package departamentoPessoal;

public class DPDiretor extends DPGerente implements DPFuncionarioEspecial{

	int setor;
	
	public DPDiretor() {
		super();
	}
	
	public DPDiretor(String nome, String cpf, double salario, int numFuncionarios) {
		super(nome, cpf, salario, numFuncionarios);
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	@Override
	public double getPLR() {
		return this.salario * 2;
	}

	@Override
	public String getBonificacao() {
		return " Bonificação: "+ this.salario * 0.15;
	}

	@Override
	public boolean acessoEspecial(String senha) {
		
		if(senha.equalsIgnoreCase("123456") )
			return true;
		else
			return false;
	}
	
	
	
}
