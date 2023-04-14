package largestElementInArray;

import java.util.Random;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[6][6];
		Random value = new Random();
		
		System.out.println("-Matriz:");
		for(int row=0; row< array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				array[row][column] = value.nextInt(10);
				System.out.print(array[row][column] + ", ");
			}
			System.out.println("");
		}
		
		System.out.println("\n-Matriz resultante(*2)");

		for (int[] row : array) {
			for (int element : row) {
				System.out.print(element*2 + ", ");
			}
			System.out.println("");
		}

	}

}
