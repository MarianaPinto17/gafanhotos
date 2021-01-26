package aula12;

public abstract class Animal {
	
	//atributos
	private double peso;
	private int idade;
	private int membros;
	
	//getters e setters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	//metodos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
}
