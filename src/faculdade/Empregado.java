package faculdade;

public class Empregado {
	private String nome;
	private double salario;

	public double getGastos() {
		return this.salario;
	}

	public String getInfo() {
		return "Nome: " + this.nome + " com sal�rio " + this.salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
