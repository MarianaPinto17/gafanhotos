package aula11;

public class Professor extends Pessoa {
	//atributos
	private String especialidade;
	private double salario;
	
	//getters e setters
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodos
	public void receberAumento(double aumento) {
		this.setSalario(this.getSalario()+aumento);
	}
	

}
