package departamentoPessoal;

public class DPDiretor extends DPGerente{

	private int setor;
	
	public DPDiretor() {
		super();
	}
	
	public DPDiretor(String string, String string2, double d) {
		this.setNome(string);
		this.setCpf(string);
		this.setSalario(d);
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
	public String toString() {
		return "\n*DPDiretor\nsetor: " + setor;
	}
	
	
	
}
