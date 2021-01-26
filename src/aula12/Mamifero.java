package aula12;

public class Mamifero extends Animal{

	//atributos
	private String corPelo;
	
	//getters e setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");
	}	
}
