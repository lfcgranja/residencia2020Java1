package pessoal;

public class Funcionario {

	private String nome;
	private String cpf;
	private String tipo;
	private String senha;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, String tipo, String senha, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
		this.senha = senha;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
