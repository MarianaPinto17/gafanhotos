package aula11;

public class Aluno extends Pessoa{
	//atributos
	private int matricula;
	private String curso;
	
	//getters e setters
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno "+this.getNome());
	}
}
