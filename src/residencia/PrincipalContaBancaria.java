package residencia;

import contaBancaria.ContaPoupancaEspecial;
import pessoal.Gerente;

public class PrincipalContaBancaria {

	public static void main(String[] args) {

		ContaPoupancaEspecial cpe = new ContaPoupancaEspecial("Marcelo", 123456, 20000, 200, true);
		System.out.println(cpe.toString());
	}

}
