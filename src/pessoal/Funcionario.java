package pessoal;

public abstract class Funcionario extends Pessoa{

	private String senha;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, String tipo, String senha, double salario) {
		super(nome, cpf, tipo);
		this.senha = senha;
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
