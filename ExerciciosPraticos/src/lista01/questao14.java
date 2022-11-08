package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao14 {
	
	public static double calculoArea(double raioF) {
		double area = 0;
		
		double R = Math.pow(raioF, 2);
		area = 3.14 * R;
		
		System.out.printf("O valor da área é %.2f.", area);
		
		return area;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		
		/*double R = Math.pow(raio, 2);
		double area = 3.14 * R;
		
		System.out.printf("O valor da área é %.2f.", area);*/
		calculoArea(raio);
		
		sc.close();
	}

}
