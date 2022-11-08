package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;
		double sub = num1 - num2;
		double multi = num1 * num2;
		double div = num1/num2;
		
		System.out.printf("Soma: %.1f", soma);
		System.out.printf("\nSubtração: %.1f", sub);
		System.out.printf("\nMultiplicação: %.2f", multi);
		System.out.printf("\nDivisão: %.2f", div);
		 
		sc.close();
	}

}
