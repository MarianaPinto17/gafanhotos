package ultimoguiao;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	//atributos
	private String nome;
	private Localidade capital;
	private int populacao;
	List<Regiao> regioes = new ArrayList<Regiao>();
	
	//construtor
	public Pais(String nome) {
		this(nome, Localidade.NullCap);
	}
	
	public Pais(String nome, Localidade capital) {
		this.nome = nome;
		this.capital=capital;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

	public Localidade getCapital() {
		return capital;
	}

	public void setCapital(Localidade capital) {
		this.capital = capital;
	}

	public int getPopulacao() {
		return populacao;
	}

	public Regiao[] getRegioes() {
		return regioes.toArray(new Regiao[regioes.size()]);
	}

	public void setRegioes(List<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	//metodos
	
	public void addRegiao(Regiao est1) {
		regioes.add(est1);
		populacao+=est1.getPopulacao();
	}

	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + populacao;
		result = prime * result + ((regioes == null) ? 0 : regioes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		if (regioes == null) {
			if (other.regioes != null)
				return false;
		} else if (!regioes.equals(other.regioes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais: " +getNome()+ ", População: "+getPopulacao()+ " (Capital:" +getCapital()+")";
	}
		
	
}
