package folhadepagamento;

import java.util.ArrayList;

public class FolhaTest {

	static ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Rafael");
		pessoa1.setSalarioBruto(2000);
		pessoa1.setValeTransporte(true);
		System.out.println(pessoa1.toString());
		System.out.println(pessoa1.getSalarioLiquido());
		
		listaPessoa.add(pessoa1);
		
		
		
	}

}
