package student;//Chamada do pacote que a classe pertence


//Classe estudante
public class StudentTester {

	public static void main(String[] args) {
		Student st1 = new Student(1, "Meire" , "2234");
		System.out.println(st1.toString());
		
		Student st2 = new Student(2, "Mercedes" , "7774");
		System.out.println(st2.toString());
		
		st1.setName("Meirellen");
		System.out.println(st1.toString());

	}
}