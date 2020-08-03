package faculdade;

public class Professor extends Empregado{
	private int horasDeAula;
	
	@Override
	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + " horas de aula: " + this.horasDeAula;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	
}
