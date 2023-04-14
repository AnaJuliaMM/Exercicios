package largestElementInArray;

import java.util.Random;

public class SimmetricArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[3][3];
		Random value = new Random();
		int aux = 0;
		
		System.out.println("\n-Matriz");	
		

		for(int row = 0; row < array.length; row++) {
			for(int column =0; column<array[row].length; column++) {
				array[row][column] = value.nextInt(100);
				System.out.print(array[row][column] + ", ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n-Comparando");	
 
		for(int row = 0; row < array.length; row++) {
			for(int column =0; column<array[row].length; column++) {
				if(array[row][column] == array[column][row]){
					aux ++;
				}	
			}
		}
		System.out.println(aux);
		
		//Criar a matriz transposta
	
		
	}

}
