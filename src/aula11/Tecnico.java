package aula11;

public class Tecnico extends Aluno {
	//atributos
	private int registoProfissional;
	
	//getters e setters
	public int getRegistoProfissional() {
		return registoProfissional;
	}

	public void setRegistoProfissional(int registoProfissional) {
		this.registoProfissional = registoProfissional;
	}

	//metodos
	public void praticar() {
		System.out.println("Praticando...");
	}
}
