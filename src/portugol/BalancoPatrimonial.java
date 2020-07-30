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

	/**
	 * @return the gastosJaneiro
	 */
	public int getGastosJaneiro() {
		return gastosJaneiro;
	}

	/**
	 * @param gastosJaneiro the gastosJaneiro to set
	 */
	public void setGastosJaneiro(int gastosJaneiro) {
		this.gastosJaneiro = gastosJaneiro;
	}

	/**
	 * @return the gastosFevereiro
	 */
	public int getGastosFevereiro() {
		return gastosFevereiro;
	}

	/**
	 * @param gastosFevereiro the gastosFevereiro to set
	 */
	public void setGastosFevereiro(int gastosFevereiro) {
		this.gastosFevereiro = gastosFevereiro;
	}

	/**
	 * @return the gastosMarco
	 */
	public int getGastosMarco() {
		return gastosMarco;
	}

	/**
	 * @param gastosMarco the gastosMarco to set
	 */
	public void setGastosMarco(int gastosMarco) {
		this.gastosMarco = gastosMarco;
	}

	/**
	 * @return the gastosAbril
	 */
	public int getGastosAbril() {
		return gastosAbril;
	}

	/**
	 * @param gastosAbril the gastosAbril to set
	 */
	public void setGastosAbril(int gastosAbril) {
		this.gastosAbril = gastosAbril;
	}

	/**
	 * @return the gastosMaio
	 */
	public int getGastosMaio() {
		return gastosMaio;
	}

	/**
	 * @param gastosMaio the gastosMaio to set
	 */
	public void setGastosMaio(int gastosMaio) {
		this.gastosMaio = gastosMaio;
	}

	/**
	 * @return the gastosJunho
	 */
	public int getGastosJunho() {
		return gastosJunho;
	}

	/**
	 * @param gastosJunho the gastosJunho to set
	 */
	public void setGastosJunho(int gastosJunho) {
		this.gastosJunho = gastosJunho;
	}

	/**
	 * @return the gastosJulho
	 */
	public int getGastosJulho() {
		return gastosJulho;
	}

	/**
	 * @param gastosJulho the gastosJulho to set
	 */
	public void setGastosJulho(int gastosJulho) {
		this.gastosJulho = gastosJulho;
	}

	/**
	 * @return the gastosAgosto
	 */
	public int getGastosAgosto() {
		return gastosAgosto;
	}

	/**
	 * @param gastosAgosto the gastosAgosto to set
	 */
	public void setGastosAgosto(int gastosAgosto) {
		this.gastosAgosto = gastosAgosto;
	}

	/**
	 * @return the gastosSetembro
	 */
	public int getGastosSetembro() {
		return gastosSetembro;
	}

	/**
	 * @param gastosSetembro the gastosSetembro to set
	 */
	public void setGastosSetembro(int gastosSetembro) {
		this.gastosSetembro = gastosSetembro;
	}

	/**
	 * @return the gastosOutubro
	 */
	public int getGastosOutubro() {
		return gastosOutubro;
	}

	/**
	 * @param gastosOutubro the gastosOutubro to set
	 */
	public void setGastosOutubro(int gastosOutubro) {
		this.gastosOutubro = gastosOutubro;
	}

	/**
	 * @return the gastosNovembro
	 */
	public int getGastosNovembro() {
		return gastosNovembro;
	}

	/**
	 * @param gastosNovembro the gastosNovembro to set
	 */
	public void setGastosNovembro(int gastosNovembro) {
		this.gastosNovembro = gastosNovembro;
	}

	/**
	 * @return the gastosDezembro
	 */
	public int getGastosDezembro() {
		return gastosDezembro;
	}

	/**
	 * @param gastosDezembro the gastosDezembro to set
	 */
	public void setGastosDezembro(int gastosDezembro) {
		this.gastosDezembro = gastosDezembro;
	}

	/**
	 * @return the gastosTrimestre1
	 */
	public int getGastosTrimestre1() {
		return gastosTrimestre1;
	}

	/**
	 * @param gastosTrimestre1 the gastosTrimestre1 to set
	 */
	public void setGastosTrimestre1(int gastosTrimestre1) {
		this.gastosTrimestre1 = gastosTrimestre1;
	}

	/**
	 * @return the gastosTrimestre2
	 */
	public int getGastosTrimestre2() {
		return gastosTrimestre2;
	}

	/**
	 * @param gastosTrimestre2 the gastosTrimestre2 to set
	 */
	public void setGastosTrimestre2(int gastosTrimestre2) {
		this.gastosTrimestre2 = gastosTrimestre2;
	}

	/**
	 * @return the gastosTrimestre3
	 */
	public int getGastosTrimestre3() {
		return gastosTrimestre3;
	}

	/**
	 * @param gastosTrimestre3 the gastosTrimestre3 to set
	 */
	public void setGastosTrimestre3(int gastosTrimestre3) {
		this.gastosTrimestre3 = gastosTrimestre3;
	}

	/**
	 * @return the gastosTrimestre4
	 */
	public int getGastosTrimestre4() {
		return gastosTrimestre4;
	}

	/**
	 * @param gastosTrimestre4 the gastosTrimestre4 to set
	 */
	public void setGastosTrimestre4(int gastosTrimestre4) {
		this.gastosTrimestre4 = gastosTrimestre4;
	}

}
