package turtle;

import java.util.Scanner;

public class TurtleJourney {

	public static void main(String[] args) {
		
		int latitude = 0;
		int longitude= 0;
		
		Scanner in = new Scanner(System.in);
		String[][] ocean = {{"water","water", "water"},
							{"water", "water", "water"},
							{"water", "water", "water"}};
		
		
		try {
			
			System.out.println("Digite a coordenada:");
			latitude = in.nextInt();
			in.nextLine();
			longitude = in.nextInt();
			
			System.out.println("A tartaruga foi para " + ocean[latitude][longitude]);

			
		}catch(Exception e) {
			
			System.out.println("Caiu na exceção");
			
			if(latitude>=ocean.length||longitude>=ocean.length) {
				System.out.println("Digite novamente");
			}
			
		
			
		}
		
		
		

		
	}

}
