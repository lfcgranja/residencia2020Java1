package portugol;

public class BalancoPatrimonial {
	
	private int gastosJaneiro;
	private int gastosFevereiro;
	private int gastosMarco;
	private int gastosAbril;
	private int gastosMaio;
	private int gastosJunho;
	private int gastosJulho;
	private int gastosAgosto;
	private int gastosSetembro;
	private int gastosOutubro;
	private int gastosNovembro;
	private int gastosDezembro;

	private int gastosTrimestre1;
	private int gastosTrimestre2;
	private int gastosTrimestre3;
	private int gastosTrimestre4;
	
	private double mediaAnual;

	public BalancoPatrimonial() {
		System.out.println("Criei o Balanço Default: ");
	}
	
	public BalancoPatrimonial(int gastosJaneiro, int gastosFevereiro, int gastosMarco) {

		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
	}
	
	public BalancoPatrimonial(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,	int gastosJunho, int gastosJulho) {
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
		this.gastosMaio = gastosMaio;
		this.gastosJunho = gastosJunho;
		this.gastosJulho = gastosJulho;
	}

	public void calcularGastosTrimestrais() {
		this.gastosTrimestre1 = this.gastosJaneiro + this.gastosFevereiro + this.gastosMarco;
		this.gastosTrimestre2 = this.gastosAbril + this.gastosMaio + this.gastosJunho;
		this.gastosTrimestre3 = this.gastosJulho + this.gastosAgosto + this.gastosSetembro;
		this.gastosTrimestre4 = this.gastosOutubro + this.gastosNovembro + this.gastosDezembro;
	}
	
	public void calcularMediaGastosAnual() {
		this.mediaAnual = (this.gastosTrimestre1 + this.gastosTrimestre2 + this.gastosTrimestre3 + this.gastosTrimestre4)/12;
	}
	
	public void imprimirGastos() {
		System.out.println("Gastos Trimestre 1: " + this.gastosTrimestre1);
		System.out.println("Gastos Trimestre 2: " + this.gastosTrimestre2);
		System.out.println("Gastos Trimestre 3: " + this.gastosTrimestre3);
		System.out.println("Gastos Trimestre 4: " + this.gastosTrimestre4);
		System.out.println("Média Anual: " + this.mediaAnual);

		}

	public int getGastosJaneiro() {
		return gastosJaneiro;
	}

	public void setGastosJaneiro(int gastosJaneiro) {
		this.gastosJaneiro = gastosJaneiro;
	}

	public int getGastosFevereiro() {
		return gastosFevereiro;
	}

	public void setGastosFevereiro(int gastosFevereiro) {
		this.gastosFevereiro = gastosFevereiro;
	}

	public int getGastosMarco() {
		return gastosMarco;
	}

	public void setGastosMarco(int gastosMarco) {
		this.gastosMarco = gastosMarco;
	}

	public int getGastosAbril() {
		return gastosAbril;
	}

	public void setGastosAbril(int gastosAbril) {
		this.gastosAbril = gastosAbril;
	}

	public int getGastosMaio() {
		return gastosMaio;
	}

	public void setGastosMaio(int gastosMaio) {
		this.gastosMaio = gastosMaio;
	}

	public int getGastosJunho() {
		return gastosJunho;
	}

	public void setGastosJunho(int gastosJunho) {
		this.gastosJunho = gastosJunho;
	}

	public int getGastosJulho() {
		return gastosJulho;
	}

	public void setGastosJulho(int gastosJulho) {
		this.gastosJulho = gastosJulho;
	}

	public int getGastosAgosto() {
		return gastosAgosto;
	}

	public void setGastosAgosto(int gastosAgosto) {
		this.gastosAgosto = gastosAgosto;
	}

	public int getGastosSetembro() {
		return gastosSetembro;
	}

	public void setGastosSetembro(int gastosSetembro) {
		this.gastosSetembro = gastosSetembro;
	}

	public int getGastosOutubro() {
		return gastosOutubro;
	}

	public void setGastosOutubro(int gastosOutubro) {
		this.gastosOutubro = gastosOutubro;
	}

	public int getGastosNovembro() {
		return gastosNovembro;
	}

	public void setGastosNovembro(int gastosNovembro) {
		this.gastosNovembro = gastosNovembro;
	}

	public int getGastosDezembro() {
		return gastosDezembro;
	}

	public void setGastosDezembro(int gastosDezembro) {
		this.gastosDezembro = gastosDezembro;
	}

	public int getGastosTrimestre1() {
		return gastosTrimestre1;
	}

	public void setGastosTrimestre1(int gastosTrimestre1) {
		this.gastosTrimestre1 = gastosTrimestre1;
	}

	public int getGastosTrimestre2() {
		return gastosTrimestre2;
	}

	public void setGastosTrimestre2(int gastosTrimestre2) {
		this.gastosTrimestre2 = gastosTrimestre2;
	}

	public int getGastosTrimestre3() {
		return gastosTrimestre3;
	}

	public void setGastosTrimestre3(int gastosTrimestre3) {
		this.gastosTrimestre3 = gastosTrimestre3;
	}

	public int getGastosTrimestre4() {
		return gastosTrimestre4;
	}

	public void setGastosTrimestre4(int gastosTrimestre4) {
		this.gastosTrimestre4 = gastosTrimestre4;
	}

	public double getMediaAnual() {
		return mediaAnual;
	}

	public void setMediaAnual(double mediaAnual) {
		this.mediaAnual = mediaAnual;
	}

}
