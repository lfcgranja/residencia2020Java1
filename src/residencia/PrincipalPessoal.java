package residencia;

import contaBancaria.FolhaPagamento;
import pessoal.Diretor;
import pessoal.Funcionario;
import pessoal.Gerente;

public class PrincipalPessoal {

	public static void main(String[] args) {
		Funcionario func = new Gerente("Marcelo", "12345678910", "GERENTE", "123456" , 2000.00, 10);
		System.out.println(func.toString());
		
		FolhaPagamento folha = new FolhaPagamento();
		
		Funcionario funcionario = new Diretor();
		funcionario.setSalario(5000.0);
		folha.calcularFolhaPagamento(func);
	}
}
