package aula7;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double altura, peso;
	
	// construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura,
			double peso, int vitorias, int derrotas, int empates) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	//setters e getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.getPeso()<52.2) {
			this.categoria = "Inválido";
		}else if(this.getPeso()<=70.3) {
			this.categoria = "Leve";
		}else if(this.getPeso()<=83.9) {
			this.categoria = "Médio";
		}else if(this.getPeso()<=120.2){
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	private void setEmpates(int empates) {
		this.empates = empates;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	// metodos
	public void apresentar() {
		System.out.println("----------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " +this.getNome()+".");
		System.out.println("Diretamente de " + this.getNacionalidade()+ " com " + this.getIdade()+ 
				" anos e " + this.getAltura() + "m , pensando " + this.getPeso() + "kg.");
		System.out.println("Com " +this.getVitorias()+ " vitórias, " +this.getEmpates()+ " empates e "
				+this.getDerrotas()+ " derrotas!");
	}
		
	public void status() {
		System.out.println( this.getNome() + " é um peso " +this.getCategoria()+ "." );
		System.out.println("Ganhou " +this.getVitorias() + " vezes, perdeu " +this.getDerrotas()+
				" vezes e empatou " +this.getEmpates()+ " vezes.");
	}
		
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
		
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
		
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
}
