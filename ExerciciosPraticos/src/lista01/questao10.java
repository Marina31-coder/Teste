package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao10 {

	public static double calculoRendimento(double valor) {
		double x = 0;
		double rendimento = 0;
		
		x = (valor * 0.70)/100;
		rendimento = valor + x;
		
		System.out.printf("O valor com rendimento após 1 mês será de R$ %.2f.", rendimento);
		
		return rendimento;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor depositado: ");
		double deposito = sc.nextDouble();
		
		calculoRendimento(deposito);
		
		/*double x = (deposito * 0.70)/100;
		double rendimento = deposito + x;
		
		System.out.printf("O valor com rendimento após 1 mês será de R$ %.2f.", rendimento);*/
		
		sc.close();

	}

}
