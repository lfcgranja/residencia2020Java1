package residencia;

import enums.PessoasEnum;

public class PrincipalTestaEnums {
	
	public static void main(String[] args) {

	String testaEnum = "PRESIDENTE";
	
	//Posso atribuir a uma vari�vel PessoasEnum
	PessoasEnum presidente = PessoasEnum.MESTRE;
	PessoasEnum gerente = PessoasEnum.GERENTE;
	
	//Posso usar diretamente a uma compara��o dentro de um if
	if( testaEnum.equalsIgnoreCase("PRESIDENTE")) {
		System.out.println("Tipo da Pessoa = " + presidente.name());
	}
	else if( testaEnum.equalsIgnoreCase("GERENTE")) {
		System.out.println("Tipo da Pessoa = " + gerente.name());
	}
	
	}
}	
