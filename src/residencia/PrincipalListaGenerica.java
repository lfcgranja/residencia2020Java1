package residencia;

import java.util.ArrayList;
import java.util.List;

import contaBancaria.ContaCorrente;
import departamentoPessoal.DPDiretor;
import departamentoPessoal.DPFuncionario;

public class PrincipalListaGenerica {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		//Lista genérca com varios tipos de objetos
		double inteiro = 1243;
		DPFuncionario f = new DPDiretor();
		ContaCorrente cc = new ContaCorrente();
		List lista = new ArrayList();
		lista.add("Marcelo");
		lista.add(inteiro);
		lista.add(cc);
		lista.add(f);
		int nome = (int) lista.get(1);
		System.out.println(nome);

	}

}
