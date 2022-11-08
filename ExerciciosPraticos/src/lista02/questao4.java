package lista02;

public class questao4 {

	public static void main(String[] args) {
		
		/*int praiaDoVento = 6;
		int praiaDoFogo = 12;
		int praiaDaLua = 14;
		int praiaDoSol =20;
		int praiaDaMontanha = 25;*/

		String[] praias = {"praia do Vento", "praia do Fogo", "praia da Lua", "praia do Sol", "praia da Montanha"};
		System.out.println(praias);
		
		int[] distancias;
		distancias = new int[5];
		
		distancias[0] = 6;
		distancias[1] = 12;
		distancias[2] = 14;
		distancias[3] = 20;
		distancias[4] = 25;
		
		System.out.println(distancias[2]);
	}

}
