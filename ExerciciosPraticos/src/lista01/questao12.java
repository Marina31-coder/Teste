package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao12 {
	
	public static void ValorComAcres(double vc) {
		double acrescimo = vc * 0.15;
		double valorVenda = vc + acrescimo;
		
		System.out.printf("Valor de Venda: R$ %.2f.", valorVenda);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o preço de custo: ");
		double valorCusto = sc.nextDouble();
		
		/*double acrescimo = valorCusto * 0.15;
		double valorVenda = valorCusto + acrescimo;*/
		ValorComAcres(valorCusto);
		
		sc.close();
		
	}

}
