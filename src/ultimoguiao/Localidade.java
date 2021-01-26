package ultimoguiao;

import java.util.Objects;

public class Localidade extends Regiao{
	
	//atributos
	private TipoLocalidade tipo;
	
	//localidade nao definida
	final static Localidade NullCap = new Localidade("Nao definida", 0, TipoLocalidade.Indefinida);
	
	//construtor
	public Localidade(String nome, int populacao, TipoLocalidade tipo) {
		super(nome,populacao);
		this.tipo = tipo;
	}
	
	//getters e setters
	public TipoLocalidade getTipo() {
		return tipo;
	}

	public void setTipo(TipoLocalidade tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		if (this == NullCap) return "*Indefinida*";
		return tipo + " " + getNome() + ", populacao " + getPopulacao();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localidade other = (Localidade) obj;
		return tipo == other.tipo;
	}
	
	
}
