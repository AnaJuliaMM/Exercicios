package student; //Chamada do pacote que a classe pertence

//Classe: padrão do objeto
public class Student {
	//Atributos da classe estudante, algo que todo objeto tem
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	
	//Construtor: primeiro método a ser criado quando criamos o objeto estudante
	//Inicializa os atributos;
	//Mas tem que ter, mesmo que não queira inicializar
	public Student(int studentId, String name, String ssn) {
		this.studentId = studentId;
		this.name = name;
		this.ssn = ssn;	
	}
	//Método get 
	public String getName() {
		return this.name;
	}
	//Método set
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", ssn=" + ssn + ", gpa=" + gpa + "]";
	}
	
	
}
