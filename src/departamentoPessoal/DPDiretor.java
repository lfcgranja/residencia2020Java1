package departamentoPessoal;

public class DPDiretor extends DPGerente implements DPFuncionarioEspecial{

	private int setor;
	
	public DPDiretor() {
		super();
	}
	
	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	@Override
	public double getPLR() {
		return this.getSalario() * 2;
	}

	@Override
	public String getBonificacao() {
		return " Bonificação: "+ this.getSalario() * 0.15;
	}

	@Override
	public boolean acessoEspecial(String senha) {
		
		if(senha.equalsIgnoreCase("123456") )
			return true;
		else
			return false;
	}
	
	
	
}
