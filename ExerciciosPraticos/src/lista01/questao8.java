package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a distância total percorrida: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Digite o total de combustível gasto: ");
		double comb = sc.nextDouble();
		
		double consumoMedio = distancia/comb;
		
		System.out.printf("O consumo médio de uma automóvel é de %.2f Km/l.", consumoMedio);

		sc.close();
	}

}
