package lista02;

import java.util.Scanner;



public class questao2 {
	
	public static void Info(String nome, String endereco, int cep, int fone) {
		System.out.printf("Nome: %s", nome);
		System.out.printf("\nEndere�o: %s", endereco);
		System.out.printf("\nCEP: %d e Telefone: %d", cep,fone);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o seu endere�o: ");
		String endereco = sc.nextLine();
		
		System.out.println("Digite o seu CEP: ");
		int cep = sc.nextInt();
		
		System.out.println("Digite o telefone: ");
		int fone = sc.nextInt();
		
		/*System.out.printf("Nome: %s", nome);
		System.out.printf("Endere�o: %s", endereco);
		System.out.printf("CEP: %d e Telefone: %d", cep,fone);*/
		Info(nome, endereco, cep, fone);
		
		sc.close();
	}

}
