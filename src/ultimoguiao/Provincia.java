package ultimoguiao;

import java.util.Objects;

public class Provincia extends Regiao{
	//atributos
	private String governador;
	//construtor
	public Provincia(String nome, int populacao, String governador) {
		super(nome,populacao);
		this.governador=governador;
	}
	//getters e setters
	public String getGovernador() {
		return governador;
	}
	public void setGovernador(String governador) {
		this.governador = governador;
	}
	
	//hashcode e equals
	@Override
	public int hashCode() {
		return Objects.hash(governador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(governador, other.governador);
	}
}
