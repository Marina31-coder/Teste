package lista02;

import java.util.Scanner;

/*
 * Escreva um programa para calcular a quantidade de litros de
combust�vel necess�ria para se fazer uma viagem, sabendo-se que o carro
faz 12 Km com um litro. Dever�o ser fornecidos o tempo gasto na viagem e a
velocidade m�dia.
utilizar as seguintes f�rmulas:
dist�ncia = tempo x velocidade
12 - 1
d  - y
12y - 1d
y = 1d/12
 */

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double distancia;
		double litros;
		
		System.out.println("Digite o tempo gasto: ");
		int tempo = sc.nextInt();
		
		System.out.println("Digite a velocidade m�dia: ");
		double veloc = sc.nextDouble();
		
		distancia = tempo * veloc;
		
		litros = distancia/12;
		
		System.out.printf("A quantidade de litros necess�ria �: %.1f L", litros);
		
		sc.close();
	}

}
