package aula10;

public class Aluno extends Pessoa{
	private int mat;
	private String curso;
	
	//getters e setters
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//metodos
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada!");
	}
}
