package string;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "I eat apples";
		String s2= "Bananas are my favorite fruit";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(6) + s2.substring(7,23));
		System.out.println(s1.indexOf("apLE"));
		System.out.println(s1.indexOf("apple"));
		System.out.println(s2.charAt(3));
		
	}

}
