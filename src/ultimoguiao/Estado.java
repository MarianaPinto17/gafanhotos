package ultimoguiao;

import java.util.Objects;

public class Estado extends Regiao {
	
	//atributos
	private Localidade capital;
	
	//construtor
	public Estado(String nome, int populacao, Localidade capital) {
		super(nome,populacao);
		setCapital(capital);
	}
	
	//getters e setters
	public Localidade getCapital() {
		return capital;
	}
	
	public void setCapital(Localidade capital) {
		if(capital.getTipo().equals(TipoLocalidade.Cidade)) {
			this.capital = capital;
		}else {
			System.out.println("A capital tem de ser do tipo CIDADE!");
		}	
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(capital, other.capital);
	}
	
	
	
	
	
}
