package residencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalListas {

	public static void main(String[] args) {
		
		//Lista de inteiros ordenada
		List<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(1);
		lista.add(10);
		// repare que o toString de ArrayList foi sobrescrito:
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);

	}

}
