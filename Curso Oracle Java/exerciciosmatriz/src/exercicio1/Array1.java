package exercicio1;

import java.util.Random;

public class Array1 {
	public static void main(String[] args) {
		
		int[][] array = new int[3][3];
		Random values = new Random();
		
		for (int[] row : array) {
			for (int item : row) {
				item = values.nextInt(100);
				System.out.println(item + ",");

			}
		}
		
		System.out.println("Exercício 1:");
		
		
		
		
		System.out.println("Exercício 2:");
		System.out.println("Exercício 3:");
		
		int[][] array3 = {{1,2,3,4,5},
						{1,2,3,4,5},
						{1,2,3,4,5}, 
						{1,2,3,4,5},
						{1,2,3,4,5}};
		int sum = 0;
		int[][] array2 = {{1,2,3,4},
						{1,2,3,4},
						{1,2,3,4},
						{1,2,3,4},
						{1,2,3}};
		
		int aux= array2[0][0];
		int maior = 0;
		int rowSum = 0;
		
		
		
		for(int row = 0; row < array2.length; row++){
			for(int column = 0; column < array2[row].length; column++) {
				maior = array2[row][column];
				if(aux> maior) {
					maior=aux;
				}
			}
		}
		System.out.println(aux);

		
		
		

		
		for(int row = 0; row < array2.length; row++){
			for(int column = 0; column < array2[row].length; column++) {
				rowSum += array2[row][column];
				
				if(column == array2[row].length-1) {
					System.out.println(rowSum);
					rowSum=0;
				}
			}
			sum += array3[row][row];
		}
		
		System.out.println("\n-Soma Diagonal Principal");
		System.out.println(sum);
		System.out.println("\n-Media Diagonal Principal");
		System.out.println((double)sum/array3.length);
		
		
		
		
		
	}

}
