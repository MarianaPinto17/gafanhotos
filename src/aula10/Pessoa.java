package aula10;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//métodos
	public void fazerAniv() {
		this.setIdade(this.getIdade()+1);
	}
	
	public String toString() {
		return "Pessoa{nome=" +getNome()+ ", idade=" +getIdade()+",sexo="+getSexo()+"}";
	}
}
