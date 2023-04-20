package exception;

import java.util.*;

public class ErrorTester  {
	
	public static void main(String[] args)throws Exception  {
		int value=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um menor que 10:");
		value = in.nextInt();
		
		try {
			if(value>10)
				throw new Exception("Valor Inválido");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(value);
		
	}
	
	
}
