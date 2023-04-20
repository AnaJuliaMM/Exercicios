package array1d;

public class tester{

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70,80,90,100}; 
		
		System.out.println("-Iteração com For Each:");
		for(int n : numbers) {
			System.out.println(n);
		}
		
		System.out.println("\n-Tamanho: " + numbers.length);
		
		System.out.println("\n-Iteração com For Loop:");
		for(int i = numbers.length-1; i>=0;i--){
			System.out.println(numbers[i]);
		}
		
		
		System.out.println("\n-Matriz bidimensional: ");
		int[][] numbers2d = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		
		System.out.println("\n-Dimensões: ");
		
		
		System.out.println(numbers2d.length + " : linhas");
		System.out.println(numbers2d[0].length + " : colunas");
		
		System.out.println("\n-Tamanho dos array: ");
		System.out.println("Matriz 0: " + numbers2d[0].length);
		System.out.println("Matriz 1: "+ numbers2d[1].length);
		
		System.out.println("\n-Exibindo os elementos do array bidimensional: ");
		
		for(int row=0; row<numbers2d.length; row++) {
			for(int column = 0; column< numbers2d[row].length; column++) {
				System.out.println(numbers2d[row][column]);
			}
		}
		
		
		System.out.println("\n-Exibindo os elementos do array bidimensional(FOR EACH): ");
		
		for (int[] row : numbers2d ) {
			for(int item : row) {
				System.out.println(item);
			}
		}
		
		System.out.println("\n-Exibindo a diagonal principal: ");
		for(int i=0; i<numbers2d.length; i++) {
			System.out.println(numbers2d[i][i]);
		}
		
		System.out.println("\n-Exibindo a diagonal secundária: ");
		for(int row=0; row<numbers2d.length; row++) {
			System.out.println(numbers2d[row][(numbers2d.length-1)-row]);
			
		}
		
	
		
		System.out.println("\n-Exibindo girado 90°: ");
		
		for(int column = 0; column< numbers2d.length; column++) {
			for(int row=numbers2d.length-1; row>=0; row--) {
				System.out.println(numbers2d[row][column]);
			}
		}
		
		System.out.println("\n-Exibindo girado 180°: ");
		
		for(int row = numbers2d.length-1; row>=0; row--) {
			for(int column = numbers2d.length-1; column>=0; column--) {
				System.out.println(numbers2d[row][column]);
			}
		}
		
		System.out.println("\n-Exibindo girado 360°: ");
		
		for(int column = numbers2d.length-1; column>=0; column--) {
			for(int row = 0; row<numbers2d.length; row++) {
				System.out.println(numbers2d[row][column]);
			}
		}
		
		System.out.println("\nColocando na matriz: ");

		//Melhorar: valer para qualquer tipo de matriz, não só a quadrada
		
		int[][] numbers2 = {{1,2,3},
							{4,5},
							{7,8,9}};
		
		System.out.println("\n-Exibindo girado 90°: ");
		
		for(int column = 0; column< numbers2.length; column++) {
			for(int row=numbers2[column].length-1; row>=0; row--) {
				System.out.println(numbers2[row][column]);
			}
		}
		
	}
	

	
	
}
