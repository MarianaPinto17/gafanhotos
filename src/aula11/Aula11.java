package aula11;

public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p1 = new Pessoa(); não pode ser construído
		//pois a classe é abstrata
		
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5);
		b1.setSexo("M");
		b1.setIdade(19);
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
		Professor p1 = new Professor();
		p1.setEspecialidade("LABI");
		p1.setNome("Barraca");
		p1.setSexo("M");
		p1.setIdade(29);
		System.out.println(p1.toString());
	}
}
