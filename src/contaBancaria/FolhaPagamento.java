package contaBancaria;

import pessoal.Funcionario;

public class FolhaPagamento {

	public double calcularFolhaPagamento(Funcionario funcionario) {
		return funcionario.getSalario() + funcionario.getBonificacao();
	}
	
}
