package departamentoPessoal;

public abstract class DPFuncionario implements Comparable<DPFuncionario>{
	
	private static int compartilhado;
	private String nome;
	private String cpf;
	private double salario;
	
	public DPFuncionario() {}

	public abstract double getPLR();
	
	public abstract String getBonificacao();

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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int getCompartilhado() {
		return compartilhado;
	}

	/**
	 * @param compartilhado the compartilhado to set
	 */
	public static void setCompartilhado(int compartilhado) {
		DPFuncionario.compartilhado = compartilhado;
	}

	@Override
	public int compareTo(DPFuncionario f) {
		return this.getNome().compareToIgnoreCase(f.getNome());
		
//		if(this.getSalario()<f.getSalario()) {
//			return -1;
//		}
//		if(this.getSalario()>f.getSalario()) {
//			return 1;
//		}
//		return 0;
	}

	
}
