package portugol;

import java.util.Scanner;

public class SomaNumerosSequenciais {

	Scanner input = new Scanner(System.in);
	
	public void inicio()
	{
		int numero;
		int carteira = 0;
		
		//System.out.println um programa que leia todos os número de 1 até n.
		//e realizar sua soma.
		System.out.println("Digite um numero: ");
		numero = input.nextInt();

		for(int i=1; i <= numero; i++)
		{
			System.out.println(i);
			carteira = carteira + i;
		}
		
		System.out.print("\n" + carteira);
	}
	
}
