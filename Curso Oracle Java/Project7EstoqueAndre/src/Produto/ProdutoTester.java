package Produto;

import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.interfaces.DHPublicKey;

import Produto.Produto;

public class ProdutoTester {
	
	private static ArrayList<Produto> listaProdutos;
	private static Scanner in;

	public static void main(String[] args) {
		int opcao;
		in = new Scanner(System.in);
		
		listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(new Produto(1, "Mouse", 25.99, 10, true));
		listaProdutos.add(new Produto(2, "Teclado", 45.00, 24, true));
		
		
		do {
			opcao = menu();
			switch(opcao) {
			case 1: 
				cadastrar();
				break;
			case 2:
				adicionar();
				break;
			case 3:
				remover();
				break;
			case 4:
				modificar();
				break;
			case 5:
				listar();
				break;
			}
		
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
		
		System.out.print("Informe sua opção: ");
		
		try {		
			opcao = in.nextInt();
		} catch (Exception e) {
			System.err.println("Valor inválido");
			opcao = 0;
		}
		clearCache();
		return opcao;
	}
	
	public static void clearCache() {
		if (in.hasNextLine()) {
            in.nextLine(); //Limpar a linha
        }
	}
	
	public static void cadastrar() {
		int tempIdProduto;
		String tempNome;
		double tempPreco;
		int tempQuantidade; 
		boolean tempEstado;
		Produto produto;
		
		try {
			
			System.out.println("* Estoque do livro ");
			System.out.print("Digite o Id do livro:" );
			tempIdProduto = in.nextInt();
			clearCache();

			System.out.print("Digite o nome do livro:" );
			tempNome = in.nextLine();
			clearCache();
			
			System.out.print("Digite o preço do livro:" );
			tempPreco = in.nextDouble();
			clearCache();
			
			System.out.print("Digite a quantidade de livros:" );
			tempQuantidade = in.nextInt();
			clearCache();
			
			System.out.print("Ativo ou Descontinuiado: " );
			tempEstado = in.nextBoolean();
			clearCache();

		}catch(Exception e){
			System.err.println("Erro no valor informado");
			return;
		}
		produto = new Produto();
		produto.setIdProduto(tempIdProduto);
		produto.setNome(tempNome);
		produto.setQuantidade(tempQuantidade);
		produto.setPreco(tempPreco);
		produto.setAtivo(tempEstado);
		listaProdutos.add(produto);
	}
	public static void adicionar(){
		int idInformado;
		int quantidadeInformado;
		
		System.out.print("Informe o Id do produto: ");
		idInformado = in.nextInt();
		clearCache();
		
		for (Produto produto : listaProdutos) {
			if(produto.getIdProduto()== idInformado){
				System.out.println("Adicionar quantos items: ");
				quantidadeInformado = in.nextInt();
				clearCache();
				produto.setQuantidade(quantidadeInformado+produto.getQuantidade());
				//TODO: 	Mudar o preço do estoque
				return;
			}
		}
		System.err.println("Produto não encontrado!");
	}
	public static void remover(){
		int idInformado;
		int quantidadeInformado;
		
		System.out.print("Informe o Id do produto: ");
		idInformado = in.nextInt();
		clearCache();
		
		for (Produto produto : listaProdutos) {
			if(produto.getIdProduto()== idInformado){
				System.out.println("Remover quantos items: ");
				quantidadeInformado = in.nextInt();
				clearCache();
				
				if(quantidadeInformado >= produto.getQuantidade()) {
					produto.setQuantidade(0);
					return;
				}else{
					produto.setQuantidade(produto.getQuantidade()- quantidadeInformado);
					System.out.println(produto.getQuantidade());
					return;
				}
			}
		}
		System.err.println("Produto não encontrado!");
	}
	public static void listar() {
		System.out.println("\n Estoque:");
		for (Produto produto : listaProdutos) {
			System.out.println(produto.toString() + "\n");
		}
		
	}
	public static void modificar() {
		int idInformado;
		int itemAlterado;
		
		System.out.print("Informe o Id do produto: ");
		idInformado = in.nextInt();
		clearCache();
		
		for (Produto produto : listaProdutos) {
			if(produto.getIdProduto()== idInformado){
				System.out.println("Alterar qual item: ");
				System.out.println("1. Id do produto");
				System.out.println("2. Nome do produto");
				System.out.println("3. Preço do produto");
				System.out.println("4. Quantidade em estoque");
				System.out.println("5. Status do produto");
				
				System.out.print("Informe sua opção: ");
				itemAlterado = in.nextInt();
				clearCache();
			
				try {
					switch(itemAlterado) {
					case 1:
						int idNovo;
						System.out.print("Digite o novo Id: ");
						idNovo = in.nextInt();
						clearCache();
						produto.setIdProduto(idNovo);
						return;
		
					case 2:
						String nomeNovo;
						System.out.print("Digite o novo nome: ");
						nomeNovo = in.next();
						clearCache();
						produto.setNome(nomeNovo);
						return;
						
					case 3:
						Double precoNovo;
						System.out.print("Digite o novo preço: ");
						precoNovo = in.nextDouble();
						clearCache();
						produto.setPreco(precoNovo);
						return;
						
					case 4:
						int quantidadeNovo;
						System.out.print("Digite a nova quantidade: ");
						quantidadeNovo = in.nextInt();
						clearCache();
						produto.setQuantidade(quantidadeNovo);
						return;
						
					case 5:
						boolean estadoNovo;
						System.out.print("Digite o novo estado:(1-Ativo 2- Descontinuado");
						estadoNovo = in.nextInt()==1? true: false;
						clearCache();
						produto.setAtivo(estadoNovo);
						return;
						
					case 6:
						System.err.println("Opção Inválida");
						return;
					}
				}catch(Exception e){
					System.err.println("Erro no valor informado");
					return;
				}
			}
		}
		System.err.println("Produto não encontrado!");
	}
}



