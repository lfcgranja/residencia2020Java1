package departamentoPessoal;

/*
Implementar uma classe abstrata funcionario - OK
Implementar uma interface fucionarioEspecial - OK
Implementar uma classe gerente derivada de funcionario - OK
Implementar uma classe diretor derivada de gerente - OK
Experimentem usar abstract na classe gerente sem implementar os métodos abstratos da classe funcionario. - OK
Experimentem implementar os metodos abstratos na classe gerente mesmo esta classe sendo abstrata - OK
Adiciona a implementação da interface funcionarioEspecial na classe diretor. - OK
*/

public class DPPrincipal {

	public static void main(String[] args){
		
			DPRelatorio dpr = new DPRelatorio();
			dpr.preparaFolha();
	}
}
