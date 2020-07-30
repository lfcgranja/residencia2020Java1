package portugol;

import java.util.Scanner;

public class NumeroRepeticoes {
	
	Scanner xpto = new Scanner(System.in);
	
	public void inicio()
	{
		int n;
		System.out.println("Digite o numero de repetições: ");
		n = xpto.nextInt();

		for(int i=1; i <= n; i=i+1){
			
			System.out.print(i + "\n");
		}

	}
	
}
