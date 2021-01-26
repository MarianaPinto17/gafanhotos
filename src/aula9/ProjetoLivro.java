package aula9;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p[] = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro",22,"M");
		p[1] = new Pessoa("Maria",25,"F");
		
		l[0] = new Livro("aprender java", "Jose Silva", 300, p[0]);
		l[1] = new Livro("POO", "Pedro Paulo",500, p[1]);
		l[2] = new Livro("Java avançado","Maria Candido",300,p[0]);
		
		l[0].abrir();
		l[0].folhear(400);
		System.out.println(l[0].detalhes());
		System.out.println(l[2].detalhes());
		
		p[0].fazerAniver();
		System.out.println(l[0].detalhes());
	}

}
