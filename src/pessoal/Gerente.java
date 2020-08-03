package pessoal;

public class Gerente extends Funcionario{

	protected int senha;
	protected int numFuncionarios;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public Gerente(String nome, String cpf, double salario, int senha, int numFuncionarios) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numFuncionarios = numFuncionarios;
	}

	public Gerente() {
		super();
	}

	@Override
	public double getBonificacao() {
		return (super.getBonificacao() * 0.10) + (this.salario * 0.15);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public String toString() {
		return "\n*Gerente\nsenha: " + senha + "\nnumFuncionarios: " + numFuncionarios + "\nnome: " + nome + "\ncpf: "
				+ cpf + "\nsalario: " + salario;
	}



}
