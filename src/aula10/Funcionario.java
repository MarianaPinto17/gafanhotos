package aula10;

public class Funcionario extends Pessoa {
	
	//atributos
	private String setor;
	private boolean trabalhando;

	//getters e setters
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//metodos
	public void mudarTrabalho() {
		this.trabalhando = !this.trabalhando;
	}
}
