package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoTester {
	
	private ArrayList<Produto> productList;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			
		} while(opcao != 6);
		
	}
	
	public static int menu() {
		int opcao;
		
		System.out.println("**** Controle de Inventário ****");
		System.out.println("1. Cadastrar");
		System.out.println("2. Adicionar");
		System.out.println("3. Remover");
		System.out.println("4. Modificar");
		System.out.println("5. Listar");
		System.out.println("6. Encerrar Programa");
		
		try {		
			opcao = scanner.nextInt();
		} catch (Exception e) {
			opcao = 0;
		}
		clearCache();
		return opcao;
	}
	
	public static void clearCache() {
		if (scanner.hasNextLine()) {
            scanner.nextLine(); //Limpar a linha
        }
	}
}



