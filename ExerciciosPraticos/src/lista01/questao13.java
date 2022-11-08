package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o custo de fábrica: ");
		double custoFabrica = sc.nextDouble();
		
		double custoConsumidor = (custoFabrica * 100)/27;
		
		System.out.printf("O custo ao consumidor de um carro novo é de R$ %.2f.", custoConsumidor);
		
		sc.close();
		/*
		 * custoConsumidor - 100
		     custoFabrica  - 27
		     custoConsumidor = (custoFabrica * 100)/27
		 */

	}

}
