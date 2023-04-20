package operadores;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println(x+m*y-(y+n)*x);
		System.out.println(m/n + m%n);
		System.out.println(5*x - n/5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int)x);
		System.out.println((int)Math.sqrt(x)+(int)Math.sqrt(y));
		System.out.println(m+n);
		System.out.println(1-1-((1-(1-(1-n)))));
	}

}
