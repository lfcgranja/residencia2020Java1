package departamentoPessoal;

public abstract class DPFuncionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public DPFuncionario() {}

	public DPFuncionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public abstract double getPLR();
	
	public abstract String getBonificacao();

}
