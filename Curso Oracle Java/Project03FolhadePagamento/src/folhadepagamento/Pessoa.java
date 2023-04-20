package folhadepagamento;

public class Pessoa {
	private String nome;
	private double salarioBruto;
	private boolean  valeTransporte;

	public Pessoa ( String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public boolean isValeTransporte() {
		return valeTransporte;
	}


	public void setValeTransporte(boolean valeTransporte) {
		this.valeTransporte = valeTransporte;
	}


	public double getSalarioLiquido() {
		if(valeTransporte) {
			return salarioBruto * 0.94;}
		else {
			return salarioBruto;
		}
	}
	
	@Override
	public String toString() {
		return "FolhaDePagamento [nome=" + nome + ", salarioBruto=" + salarioBruto + ", valeTransporte="
				+ valeTransporte + "]";
	}
	
}
