package residencia;

import java.util.Scanner;

public class PrincipalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tamanho do array desejado!");
		int tamanho = input.nextInt();
		
		double[] array = new double[tamanho];
		
		for(int i=0; i<array.length; i++)
			array[i] = i+1;
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);

	}

}
