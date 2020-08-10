package pessoal;

public class Gerente extends Funcionario{

	private int agencia;

	public Gerente() {super();}
	
	public Gerente(String nome, String cpf, String tipo, String senha, double salario, int agencia) {
		super(nome, cpf, tipo, senha, salario);
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "\n*Gerente\nagencia: " + agencia + "\ngetNome(): " + getNome() + "\ngetCpf(): " + getCpf()
				+ "\ngetTipo(): " + getTipo() + "\ngetSenha(): " + getSenha() + "\ngetSalario(): " + getSalario();
	}

	
	
}
