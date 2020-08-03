package residencia;

import faculdade.Empregado;
import faculdade.Professor;
import faculdade.RelatoriosFaculdade;

public class PrincipalFaculdade {

	public static void main(String[] args) {

		Empregado empregado = new Empregado();
		empregado.setNome("Gertrudes");
		empregado.setSalario(1045);
		
		Empregado professor = new Professor();
		professor.setNome("Marcelo");
		professor.setSalario(2000);
		((Professor)professor).setHorasDeAula(120);
		
		RelatoriosFaculdade relatorio = new RelatoriosFaculdade();
		relatorio.adiciona(empregado);
		relatorio.adiciona(professor);

		relatorio.imprimeTotalGastos();
	}

}
