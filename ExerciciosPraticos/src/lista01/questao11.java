package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor total da compra: ");
		double total = sc.nextDouble();
		
		double prestacao = total/5;
		
		System.out.printf("Valor total da compra: R$ %.2f", total);
		System.out.printf("\nValor das prestações: R$ %.2f", prestacao);
		
		sc.close();
		
	}

}
