package string;

import java.util.Scanner;

public class ExemploEmail {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite seu e-mail: ");
		String email = terminal.next();
		
		int posicaoA = email.indexOf("@");
		
		System.out.print("O domínio é: ");
		System.out.println(email.substring(posicaoA));
				
	}
	
	
	


}
