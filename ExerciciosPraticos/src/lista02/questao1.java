package lista02;

import java.util.Scanner;


public class questao1 {
	
	public static double mediaNotas(double nota1, double nota2, double nota3) {
		double media = 0;
		
		media = (nota1 + nota2 + nota3)/3;
		
		return media;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a Turma: ");
		String turma = sc.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double media = mediaNotas(nota1, nota2, nota3);
		
		System.out.printf("Nome do aluno: %s", nome);
		System.out.printf("\nTurma: %s", turma);
		System.out.printf("\nA média do aluno é %.1f", media);
				
		sc.close();

		
	}

}
