package autodromo;

public class Carro extends Veiculo{

	public void ligar() {
		confereCambio(); //Encapsulamento
		conferindoCombustivel();
		
		System.out.println("Carro ligado");
	}
	private void conferindoCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Ponto morto");
	}
	
}
