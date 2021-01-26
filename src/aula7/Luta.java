package aula7;

public class Luta {

	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//construtor
	public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
		super();
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.setAprovada();
	}
	//construtor vazio
	public Luta() {
	}
	
	//setters e getters
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	private boolean setAprovada() {
		if(desafiado.getCategoria()==desafiante.getCategoria() && desafiado!=desafiante) {
			this.aprovada = true;
		}else {
			this.aprovada = false;
		}
		return this.aprovada;
	}

	//métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		this.desafiado=l1;
		this.desafiante=l2;
		this.setAprovada();
		if(this.isAprovada()) {
			this.desafiado=l1;
			this.desafiante=l2;
			System.out.println("Luta marcada!");
		}else {
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Não pode existir luta");
		}
	}

	public void lutar() {
		if(this.isAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			int range = (2-0) + 1;
			int vencedor = (int) (Math.random()*range) + 0;
			System.out.println("\nA LUTA COMEÇOU!");
			System.out.println("E...");
			if(vencedor == 1) { // 1 = desafiado
				desafiado.ganharLuta();
				desafiante.perderLuta();
				System.out.println(desafiado.getNome() +" ganhou!");
			}else if (vencedor == 2) { // 2 = desafiante
				desafiante.ganharLuta();
				desafiado.perderLuta();
				System.out.println(desafiante.getNome() +" ganhou!");
			}else if(vencedor == 0) { // empate
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				System.out.println("Luta acabou empatada!");
			}
		}else {
			System.out.println("Luta não pode acontecer");
		}
	}
}
