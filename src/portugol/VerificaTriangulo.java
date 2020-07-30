package portugol;

import java.util.Scanner;

public class VerificaTriangulo {

	int angulo1 = 0;
	int angulo2 = 0;
	int angulo3 = 0;
	Scanner input = new Scanner(System.in);

	public void inicio() {
		
		int verificaTriangulo;

		System.out.println("\nDigite o angulo 1: ");
		angulo1 = input.nextInt();

		System.out.println("Digite o angulo 2: ");
		angulo2 = input.nextInt();

		System.out.println("Digite o angulo 3: ");
		angulo3 = input.nextInt();

		verificaTriangulo = angulo1 + angulo2 + angulo3;

		if ((verificaTriangulo == 180) && ((angulo1 > 0) && (angulo2 > 0) && (angulo3 > 0))) {
			System.out.println("\n… um triangulo!");
		} else {
			System.out.println("\nN„o È um triangulo!");
		}
	}
	
}
