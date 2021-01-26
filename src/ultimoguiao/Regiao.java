package ultimoguiao;

import java.util.Objects;

public class Regiao{
	//atributos
	private String nome;
	private int populacao;
	//construtor
	public Regiao(String nome, int populacao) {
		this.nome = nome;
		this.populacao = populacao;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, populacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regiao other = (Regiao) obj;
		return Objects.equals(nome, other.nome) && populacao == other.populacao;
	}

	@Override
	public String toString() {
		return "Regiao [nome=" + nome + ", populacao=" + populacao + "]";
	}
	
	
}
