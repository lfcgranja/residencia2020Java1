package departamentoPessoal;

public class DPRelatorio {

	public void preparaFolha() {
		
			
		DPRelatorio dpr = new DPRelatorio();
		DPFuncionario funcionario = null;
		
		DPDiretor diretor = new DPDiretor();
		diretor.setNome("Marcelo");
		diretor.setCpf("123.456.798.-10");
		diretor.setSalario(2000.00);
		funcionario = diretor;
		System.out.println(dpr.calculaFolha(funcionario));
		
		funcionario = null;
		diretor = null;
		
		diretor = new DPDiretor();
		diretor.setNome("Maria Clara");
		diretor.setCpf("987.654.321-90");
		diretor.setSalario(4000.00);
		int teste2 = (int)diretor.getSalario() / 1;
		System.out.println(dpr.calculaFolha(funcionario));

	}
	
	public String calculaFolha(DPFuncionario func) {

		double somaTudo = func.getSalario() + func.getSalario() * 0.15 + func.getPLR();
		return "\n Funcionario: " + func.getNome() + "\n CPF: " + func.getCpf() + "\n Salario: " + func.getSalario()
				+ func.getBonificacao() + "\n PLR: " + func.getPLR() + "\n Total: " + somaTudo;
	}
}
