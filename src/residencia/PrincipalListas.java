package residencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pessoal.Diretor;
import pessoal.Funcionario;
import pessoal.Gerente;

public class PrincipalListas {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Lista de inteiros ordenada
		Map<String, Funcionario> map = new HashMap<>();
		List<Funcionario> lista = new ArrayList<>();
		
		Funcionario f = null;
		
		f = new Gerente("Marcelo", "123", "GERENTE", "123456", 2000.00, 10);
		map.put(f.getCpf(), f);
		lista.add(f);
		
		f = new Diretor("Romulo", "456", "DIRETOR", "654321", 5000.00, 20);
		map.put(f.getCpf(), f);
		lista.add(f);
		
		f = new Gerente("Ronaldo", "789", "GERENTE", "654321", 3000.00, 10);
		map.put(f.getCpf(), f);
		lista.add(f);
		
		f = new Gerente("Gabriela", "852", "GERENTE", "654321", 8000.00, 20);
		map.put(f.getCpf(), f);
		lista.add(f);
		
		double salarios = 0;
		for(int i=0; i<lista.size(); i++){
			salarios += lista.get(i).getSalario();
		}
		System.out.println("Salarios List: " + salarios);
		
//		double salarios2 = 0;
//		List<String> listaKeySet = (List<String>) map.keySet();		//[123, 456, 789, 852]
//		for(int i=0; i<listaKeySet.size(); i++){					//listaKeySet.size = 4
//			salarios2 += map.get(listaKeySet.get(i)).getSalario();
//		}
//		System.out.println("Salarios Map: " + salarios2);
		
		Funcionario fTemp = null;
		for(int i = 0; i< lista.size(); i++) {
			fTemp = lista.get(i);
			if(fTemp.getCpf().equalsIgnoreCase("123")) {
				System.out.println("Funcionario List: " + fTemp);
			}
		}
		
		Funcionario fTemp2 = null;
		fTemp = map.get("123");
		System.out.println("Funcionario Map: " + fTemp);
		
//		
//		System.out.println(map.get("987654321"));//map.get("987654321") -> Retorna o value associado

	}

}
