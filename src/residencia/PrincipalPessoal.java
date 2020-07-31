package residencia;

import pessoal.Gerente;

public class PrincipalPessoal {

	public static void main(String[] args) {
		Gerente ge = new Gerente("Marcelo", "123.456.789-10", 20000, 123456, 10);
		System.out.println(ge.toString());
	}
}
