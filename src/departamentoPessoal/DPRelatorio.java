package departamentoPessoal;

public class DPRelatorio {

	public void preparaFolha(){
	
			DPDiretor diretor = new DPDiretor();
			diretor.setNome("Maria Clara");
			diretor.setCpf("987.654.321-90");
			diretor.setSalario(4000.00);
			diretor.setSetor(10);
			diretor.setNumFuncionarios(10);
			DPFuncionario.setCompartilhado(2);
			
			DPDiretor diretor2 = new DPDiretor();
			diretor2.setNome("Marcelo");
			diretor2.setCpf("123.456.789-10");
			diretor2.setSalario(2000.00);
			diretor2.setSetor(5);
			diretor2.setNumFuncionarios(5);
			DPFuncionario.setCompartilhado(5);
			
			System.out.println(diretor.getNome());
			System.out.println(diretor2.getNome());
			System.out.println(DPFuncionario.getCompartilhado());

	}
	
	public String calculaFolha(DPFuncionario func) {

		double somaTudo = func.getSalario() + func.getSalario() * 0.15 + func.getPLR();
		return "\n Funcionario: " + func.getNome() + "\n CPF: " + func.getCpf() + "\n Salario: " + func.getSalario()
				+ func.getBonificacao() + "\n PLR: " + func.getPLR() + "\n Total: " + somaTudo;
	}
}
