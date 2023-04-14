package largestElementInArray;

import java.util.Random;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[3][2];
		Random value = new Random();
		int largest = array[0][0];
		int averageSum = 0;
		
		System.out.println("-Exibindo o array");
		
		for(int row = 0; row < array.length; row++) {
			int rowSum = 0;
			for(int column =0; column<array[row].length; column++) {
				array[row][column] = value.nextInt(100);
				rowSum += array[row][column];
				System.out.print(array[row][column] + ", ");
				
				if(array[row][column] > largest) {
					largest = array[row][column];
				}
			}
			System.out.println("\t soma: " + rowSum);
			
			if(array[0].length == array.length)
				//Se for quadrada
				averageSum += array[row][row];

		}
		
		System.out.println("\n-O maior elemento e " + largest);
		System.out.println("\n-A media da diagonal principal e " + (double)averageSum/array.length);

		
		System.out.println("\n-Matriz transposta");	
		
		
		for(int column = 0; column < array[0].length; column++) {
			for(int row=0; row< array.length; row++) {
				System.out.print(array[row][column] + ",");
			}
			System.out.println("");
		}
		
		
		
	}

}
