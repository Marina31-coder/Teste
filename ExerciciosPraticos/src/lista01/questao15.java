package lista01;

import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos cavalos foram comprados: ");
		int cavalos = sc.nextInt();
		
		int ferraduras = cavalos * 4;
		
		System.out.printf("A quantidade necess�ria de ferraduras � de %d.", ferraduras);
	
		sc.close();
	}

}
