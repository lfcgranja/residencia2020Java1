package residencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import departamentoPessoal.DPDiretor;
import departamentoPessoal.DPFuncionario;

public class PrincipalListaOrdenada {

	public static void main(String[] args) {

		//Preenche Lista de funcionarios
		List<DPFuncionario> listFuncionario =  new ArrayList<>();
		DPFuncionario f = new DPDiretor();
		f.setNome("Marcelo");
		listFuncionario.add(f);
		
		f = new DPDiretor();
		f.setNome("Karine");
		listFuncionario.add(f);
		
		f = new DPDiretor();
		f.setNome("Carlos");
		listFuncionario.add(f);
		
		f = new DPDiretor();
		f.setNome("Ronaldo");
		listFuncionario.add(f);
		
		f = new DPDiretor();
		f.setNome("Paulo");
		listFuncionario.add(f);
		
		f = new DPDiretor();
		f.setNome("Tatiane");
		listFuncionario.add(f);
		
		for(int i = 0; i < listFuncionario.size(); i++)
			System.out.print(" - " + listFuncionario.get(i).getNome());
			
		System.out.println("\n");
		
		//Ordena a lista de objetos de acordo com o nome e imprime
		Collections.sort(listFuncionario);
		for(int i = 0; i < listFuncionario.size(); i++)
			System.out.print(" - " + listFuncionario.get(i).getNome());
		
		System.out.println("\n");
		
		//Ordena a lista de objetos de acordo com o nome na ordem inversa e imprime
		Collections.reverse(listFuncionario);
		for(int i = 0; i < listFuncionario.size(); i++)
			System.out.print(" - " + listFuncionario.get(i).getNome());
		
		System.out.println("\n");

	}

}
