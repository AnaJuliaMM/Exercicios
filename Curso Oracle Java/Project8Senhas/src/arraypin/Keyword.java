package arraypin;

import java.util.*;

public class Keyword {
	public static void main(String[] args) throws Exception {
		
		String[] password = {"p@ssw0rd", "sEnh@", "1234", "adim", "paralelepipedo", "321", "010203"};
		Scanner in = new Scanner(System.in);
		int index = 0;
		
		do {
			try{
				System.out.println("Digite o índice:");
				index = in.nextInt();
				if(index>=4 && index<=6) {
					throw new Exception("Senha restrita"); //Reescrevemos o método toString desse objeto
				}else if(index<0) {
					throw new Exception("Programa encerrado");
				}
				System.out.println(password[index]);
						
			}catch(InputMismatchException e){ //else if
				in.nextLine();
				System.out.println("Entrada inválida, novamente");	
			}catch(ArrayIndexOutOfBoundsException e){ //else if
				System.out.println("Senha inexistente, tente novamente");
			}catch(Exception e) { //else
				System.out.println("Senha restrita"); //Não usa o objeto 
				System.out.println(e); //Usa o objeto, assim, usará o método toString dele,que foi reescrito
			}
			
		}while(index>=0);
		
		
		

		
		
		
		
		
		
		

	}
	
}
