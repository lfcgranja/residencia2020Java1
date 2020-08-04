package departamentoPessoal;

public class DPRelatorio {

	public String calculaFolha(DPFuncionario funcionario) {
		double somaTudo = funcionario.salario + funcionario.salario*0.15 + funcionario.getPLR();
		return "Salario: " + funcionario.salario + funcionario.getBonificacao() + " PLR: "+ funcionario.getPLR() + " - Total: " + somaTudo;
	}
}
