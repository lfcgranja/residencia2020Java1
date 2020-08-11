package residencia;

import departamentoPessoal.DPFuncionario;
import departamentoPessoal.DPGerente;
import departamentoPessoal.DPRelatorio;

public class PrincipalPessoal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DPFuncionario func = new DPGerente("Marcelo", "123", 2000.00);
		//System.out.println(func.toString());
		
//		DPRelatorio relatorio = new DPRelatorio();
//		relatorio.setTeste(20);
//		relatorio.preparaFolha();
		
		DPRelatorio.setTeste(20);
		DPRelatorio.preparaFolha();
	}
}
