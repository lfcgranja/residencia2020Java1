package faculdade;

public class RelatoriosFaculdade {
	
	double totalGastos;

	public void adiciona(Empregado empregado) {
		totalGastos += empregado.getGastos();
		System.out.println();
		System.out.println(empregado.getInfo());
		System.out.println("Gasto total de: "+empregado.getGastos());
	}

	public double getTotalGastos() {
		return totalGastos;
	}

	public void setTotalGastos(double totalGastos) {
		this.totalGastos = totalGastos;
	}
	
	public void imprimeTotalGastos() {
		System.out.println("O total de gastos da faculdade é: "+this.totalGastos);
	}

}
