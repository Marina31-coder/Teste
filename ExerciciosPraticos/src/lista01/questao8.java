package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a dist�ncia total percorrida: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Digite o total de combust�vel gasto: ");
		double comb = sc.nextDouble();
		
		double consumoMedio = distancia/comb;
		
		System.out.printf("O consumo m�dio de uma autom�vel � de %.2f Km/l.", consumoMedio);

		sc.close();
	}

}
