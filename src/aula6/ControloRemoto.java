package aula6;

public class ControloRemoto implements Controlador{
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//construtor
	public ControloRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}
	
	//getters e setters
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// metodos abstratos
	// override = reescrever
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}
	
	@Override
	public void abrirMenu() {
		System.out.println("---------------------------------");
		System.out.println("Está ligado? " +this.isLigado());
		System.out.println("Está tocando? " +this.isTocando());
		System.out.println("Volume: " +this.getVolume());
		for(int i = 1; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("\nFechando Menu...");
	}

	@Override
	public void menosVolume() {
		if(this.isLigado() == true) {
			this.setVolume(this.getVolume()-5);
		}else {
			System.out.println("Está desligado!");
		}
	}

	@Override
	public void maisVolume() {
		if(this.isLigado()== true) {
			this.setVolume(this.getVolume()+5);
		}else {
			System.out.println("Está desligado!");
		}
	}
	
	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}else {
			System.out.println("Já está mutado!");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume()==0) {
			this.setVolume(50);
		}else {
			System.out.println("Já está com som!");
		}
	}

	@Override
	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}else if(!this.isLigado()) {
			System.out.println("Não está ligado!");
		}else if(this.isTocando()){
			System.out.println("Já está em play!");
		}
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Já está em pausa!");
		}
	}
}
