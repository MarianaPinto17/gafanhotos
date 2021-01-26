package aula13;

public class Cachorro extends Lobo {	
	//metodos
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU!");
	}
	
	//polimorfismo por sobrecarga
	public void reagir(String frase) {
		
	}
	
	public void reagir(int hora, int minuto) {
		
	}
	
	public void reagir(boolean dono) {
		
	}
	
	public void reagir(int idade, double peso) {
		
	}
}