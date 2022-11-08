package lista01;

import java.util.Locale;
import java.util.Scanner;

public class questao9 {

	public static double calculoMedia(String aluno, double a, double b, double c) {
		double media = 0;
		
		media = (a + b + c)/3;
		
		System.out.printf("Nome: %s", aluno);
		System.out.printf("\nNota da primeira prova: %.1f", a);
		System.out.printf("\nNota da segunda prova: %.1f", b);
		System.out.printf("\nNota da terceira prova: %.1f", c);
		System.out.printf("\nMédia final: %s", media);
		
		return media;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota da terceira prova: ");
		double nota3 = sc.nextDouble();
		
		calculoMedia(nome, nota1, nota2, nota3);
		
		sc.close();
	}

}
