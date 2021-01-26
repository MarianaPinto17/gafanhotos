package aula4;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta p1 = new Conta();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
	
		
		Conta p2 = new Conta();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("cp");
		
	
		p1.depositar(100.0);
		p2.depositar(500.0);
		
		p2.levantar(100.0);
		
		p1.levantar(150.0);
		p1.fecharConta();
		
		p1.estadoAtual(1111);
		p2.estadoAtual(2222);
	}

}
