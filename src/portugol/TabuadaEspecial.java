package portugol;

import java.util.Scanner;

public class TabuadaEspecial {
	
	Scanner input = new Scanner(System.in);
	int i, numeroEscolhido, quantidade;
	int multiplicador = 10;
	String linha;
	
	public void inicio(){

		System.out.println("Digite o numero da tabuada: ");
		numeroEscolhido = input.nextInt();

		System.out.println("Digite o caracter de sua preferencia: ");
		linha = input.next();

		System.out.println("Digite a quantidade de caracteres: ");
		quantidade = input.nextInt();
        
		escreveLinha(linha, quantidade);
		
		System.out.println("Numeros entre 1 e 5");
		
		escreveLinha(linha, quantidade);
		
		for(i=1; i<= multiplicador; i++){
			multiplicarDoisNumeros(i, multiplicador );
			System.out.println(i + " x " + numeroEscolhido + " = " + i*numeroEscolhido);
		}
		escreveLinha(linha, quantidade);
	}
	
	public void escreveLinha(String linha, int repeticao){
		int i;
		for(i=0;i<repeticao;i++){
			System.out.print(linha + " ");
		}
		System.out.print("\n");
	}
	
	public int multiplicarDoisNumeros(int num1, int num2){
		int calculo = num1 * num2;
		return calculo;
	}
	
}
