package pessoal;

public class Diretor extends Gerente {

	public Diretor() {
	}
	
	public Diretor(String nome, String cpf, String tipo, String senha, double salario, int agencia) {
		super(nome, cpf, tipo, senha, salario, agencia);

	}

	@Override
	public String toString() {
		return "\n*Diretor\ngetAgencia(): " + getAgencia() + "\ngetNome(): " + getNome() + "\ngetCpf(): " + getCpf()
				+ "\ngetTipo(): " + getTipo() + "\ngetSenha(): " + getSenha() + "\ngetSalario(): " + getSalario();
	}


	
}
