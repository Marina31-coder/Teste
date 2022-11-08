package lista02;

import java.util.Scanner;

/*
 * Leia 4 (quatro) números calcule o quadrado para cada um (n²) some
todos e exiba o resultado
 */
public class questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		System.out.println("Digite o quarto número: ");
		int num4 = sc.nextInt();
		
		int a = (int) Math.pow(num1, 2);
		int b = (int) Math.pow(num2, 2);
		int c = (int) Math.pow(num3, 2);
		int d = (int) Math.pow(num4, 2);
		
		int resultado = a + b + c + d;
		
		System.out.printf("A soma dos quadrados do número é: %d", resultado);

		sc.close();
	}

}
