package portugol;

import java.util.Scanner;

public class VerificaTrianguloEspecial {

	int angulo1 = 0;
	int angulo2 = 0;
	int angulo3 = 0;
	Scanner input = new Scanner(System.in);

	public void inicio()
	{
		int verificaTriangulo;
		do {
			menu();
		} while ((angulo1 <= 0) || (angulo2 <= 0) || (angulo3 <= 0));

		verificaTriangulo = angulo1 + angulo2 + angulo3;
		if (verificaTriangulo == 180) {
			System.out.println("\nÉ um triangulo!");
		} else {
			System.out.println("\nNão é um triangulo!");
		}
	}

	public void menu() {
		System.out.println("\nDigite o angulo 1: ");
		angulo1 = input.nextInt();

		System.out.println("Digite o angulo 2: ");
		angulo2 = input.nextInt();

		System.out.println("Digite o angulo 3: ");
		angulo3 = input.nextInt();

		if ((angulo1 <= 0) || (angulo2 <= 0) || (angulo3 <= 0)) {
			System.out.flush();
			System.out.println("Um dos angulos digitados é negativo");
		}
	}

}
