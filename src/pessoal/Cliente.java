package pessoal;

public class Cliente extends Pessoa{

	private String senha;
	private int agencia;
	
	public Cliente() {
	}

	public Cliente(String nome, String cpf, String tipo, String senha, int agencia) {
		super(nome, cpf, tipo);
		this.senha = senha;
		this.agencia = agencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "\n*Cliente\nsenha: " + senha + "\nagencia: " + agencia + "\ngetNome(): " + getNome() + "\ngetCpf(): "
				+ getCpf() + "\ngetTipo(): " + getTipo();
	}

	 
	
}
