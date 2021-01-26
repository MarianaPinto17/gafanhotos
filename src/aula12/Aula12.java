package aula12;

public class Aula12 {
	public static void main (String [] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
/**		
		m.setPeso(37.3);
		m.setCorPelo("Marrom");
		
		m.locomover();
		m.emitirSom();
**/
		m.alimentar();
		a.locomover();
		p.locomover();
		r.locomover();
		c.locomover();
		k.locomover();
		k.emitirSom();
		j.emitirSom();
		g.alimentar();
		e.fazerNinho();
		t.alimentar();
		
		
	}
}
