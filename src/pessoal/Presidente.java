package pessoal;

public class Presidente extends Gerente {

	private int contasPagas = 0;
	
	public Presidente() {
	}
	
	public Presidente(String nome, String cpf, String tipo, String senha, double salario, int agencia, int contasPagas) {
		super(nome, cpf, tipo, senha, salario, agencia);
		this.contasPagas = contasPagas;
	}


	public int getContasPagas() {
		return contasPagas;
	}

	public void setContasPagas(int contasPagas) {
		this.contasPagas = contasPagas;
	}

	@Override
	public String toString() {
		return "\n*Presidente\ncontasPagas: " + contasPagas + "\ngetAgencia(): " + getAgencia() + "\ngetSenha(): "
				+ getSenha() + "\ngetSalario(): " + getSalario() + "\ngetNome(): " + getNome() + "\ngetCpf(): "
				+ getCpf() + "\ngetTipo(): " + getTipo();
	}


}
