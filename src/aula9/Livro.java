package aula9;

public class Livro implements Publicacao {

	//atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//construtor
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}

	//getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//metodos
	public String detalhes() {
		return "Livro: " + titulo + " do autor " +autor+ "\ncom "
				+ totalPaginas + " páginas, está a ser lido na página \n"
				+ pagAtual + " pelo leitor " +leitor.getNome()+ " com " +leitor.getIdade()+
				" anos.\nEstá aberto? " +aberto+"!\n";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(this.getTotalPaginas()>p && p>0) {
			this.setPagAtual(p);
		}else{
			System.out.println("Não pode folhear até uma página inexistente!!!!\n");
		}
	}

	@Override
	public void avançarPag() {
		// TODO Auto-generated method stub
		this.setPagAtual(this.getPagAtual()+1);
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.setPagAtual(this.getPagAtual()-1);
	}
	
	
}
