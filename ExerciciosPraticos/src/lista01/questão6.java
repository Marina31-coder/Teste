package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questão6 {

	public static void conversao(double valor) {
		double dolar = 0;
		double euro = 0;
		double libra = 0;
		
		dolar = valor / 5.07;
		euro = valor / 5.05;
		libra = valor / 5.79; 
		
		System.out.printf("Valor em Dólar: %.2f", dolar);
		System.out.printf("\nValor em Euro: %.2f", euro);
		System.out.printf("\nValor em Libra: %.2f", libra);
		
		
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		 
		 System.out.println("Dê o valor em Real: ");
		 double real = sc.nextDouble();
		 
		 conversao(real);
		 
		 /*double dolar = real / 5.07;
		 double euro = real / 5.05;
		 double libra = real / 5.79;*/
		 
		 /*System.out.printf("Valor em Dólar: %.2f", dolar);
		 System.out.printf("\nValor em Euro: %.2f", euro);
		 System.out.printf("\nValor em Libra: %.2f", libra);*/
		 
		 sc.close();

	}

}
