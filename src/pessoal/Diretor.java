package pessoal;

import portugol.BalancoPatrimonial;

public class Diretor extends Gerente {

	BalancoPatrimonial balanco = new BalancoPatrimonial();
	
	public Diretor() {
	}

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public Diretor(String nome, String cpf, double salario, int senha, int numFuncionarios) {
		super(nome, cpf, salario, senha, numFuncionarios);
	}
	
	public Diretor(String nome, String cpf, double salario, int senha, int numFuncionarios, BalancoPatrimonial balanco) {
		super(nome, cpf, salario, senha, numFuncionarios);
		this.balanco = balanco;
	}

	public BalancoPatrimonial getBalanco() {
		return balanco;
	}

	public void setBalanco(BalancoPatrimonial balanco) {
		this.balanco = balanco;
	}

	@Override
	public String toString() {
		return "\n*Diretor\nbalanco: " + balanco + "\nsenha: " + senha + "\nnumFuncionarios: " + numFuncionarios
				+ "\nnome: " + nome + "\ncpf: " + cpf + "\nsalario: " + salario;
	}

}
