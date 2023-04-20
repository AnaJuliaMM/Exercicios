package estoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int maxSize = -1;
		
		int tempIdProduto = 0;
		String tempNome = "";
		double tempPreco = 0;
		int tempQuantidade = 0;
		
		do{
			try {
				System.out.println("Insira o número de produtos que gostaria de adicionar:");
				System.out.println("(insira 0 (zero) se não quiser adicionar produtos)");
				maxSize = in.nextInt();
				if(maxSize < 0)
					throw new Exception();
					
			}catch(InputMismatchException e) {
				in.nextLine();
				System.err.println("Tipo incorreto de dados inserido!\n");
			}catch(Exception e){
				System.err.println("Valor inserido incorreto\n");
			}
		
		}while(maxSize<0);
		
		if(maxSize == 0) {
			System.out.println("Não há produtos para registrar!");
		}else {
			Produto [] produtos = new Produto [maxSize];
			
			for(int i = 0; i<maxSize; i++) {
				tempIdProduto = 0;
				tempNome = "";
				tempPreco = 0;
				tempQuantidade = 0;
				
				try {
					in.nextLine();
					System.out.println("\n*Registro do livro " + (i+1) );
					System.out.println("Digite o Id do livro " + (i+1) + " :" );
					tempIdProduto = in.nextInt();
					in.nextLine();
					System.out.println("Digite o nome do livro " + (i+1) + " :" );
					tempNome = in.nextLine();
					System.out.println("Digite o preço do livro " + (i+1) + " :" );
					tempPreco = in.nextDouble();
					System.out.println("Digite a quantidade de livros "+ (i+1) + " :" );
					tempQuantidade = in.nextInt();	
					
				}catch(Exception e) {
					System.err.println("Tipo incorreto de dado inserido!");
				}
				produtos[i] = new Produto (tempIdProduto, tempNome, tempPreco, tempQuantidade);
				System.out.println(" ");
				
				
			}
			in.close();
			
			System.out.println("%Estoque:\n");
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
		
	
	
		
		
	}
}


