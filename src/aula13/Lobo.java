package aula13;

public class Lobo extends Mamifero{
	//atributos
	protected String corPelo;
	
	//getters e setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	//metodos
	@Override
	public void emitirSom() {
		System.out.println("AUUUUUUUUUUUU!");
	}
}
