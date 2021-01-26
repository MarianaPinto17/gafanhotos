package aula11;

public class Bolsista extends Aluno{
	//atributos
	private double bolsa;
	
	//getters e Setters
	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}

	//metodos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " +this.getNome());
	}
	
	@Override
	public final void pagarMensalidade() {
		System.out.println(this.getNome()+ " é bolsista! Mensalidade paga!");
	}
	
}
