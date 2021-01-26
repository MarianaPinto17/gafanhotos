package aula12;

public class Peixe extends Animal {
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
		System.out.println("Nadando");
	}
		
	@Override
	public void alimentar() {
		System.out.println("Comendo peixe");
	}
		
	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}	
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
}
