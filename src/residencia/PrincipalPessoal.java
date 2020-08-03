package residencia;

import contaBancaria.FolhaPagamento;
import pessoal.Diretor;
import pessoal.Funcionario;
import pessoal.Gerente;

public class PrincipalPessoal {

	public static void main(String[] args) {
		Funcionario func = new Gerente("Marcelo", "123.456.789-10", 2000, 123456, 10);
		System.out.println(func.toString());
		System.out.println("bonificacao: "+func.getBonificacao());
		
		FolhaPagamento folha = new FolhaPagamento();
		
		Funcionario funcionario = new Diretor();
		funcionario.setSalario(5000.0);
		folha.calcularFolhaPagamento(func);
	}
}
