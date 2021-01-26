package aula12;

public class Reptil extends Animal{
	//atributos
	private String corEscama;

	//getters e setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
	}	
}
