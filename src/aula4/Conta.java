package aula4;

public class Conta {
	
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//constutor para abrir conta logo
	public Conta(int numConta, String tipo, String dono, double saldo, boolean status) {
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}
	
	//construtor conta vazia
	public Conta() {
		saldo = 0;
		status = false;
	}
	
	//getters e setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//métodos
	
	//recebe o tipo da conta
	public void abrirConta(String t) {
		this.setStatus(true);
		this.setTipo(t);
		if(t=="cc") {
			this.setSaldo(50);
			System.out.println("Conta corrente de "+getDono()+ " aberta com sucesso");
		}else if(t=="cp") {
			this.setSaldo(150);
			System.out.println("Conta poupança de "+getDono()+ " aberta com sucesso");
		}else {
			System.out.println("Não é um tipo de conta aceitável");
			setStatus(false);
			setTipo(null);
			abrirConta(t);
		}
		
	}
	
	//fechar conta só quando saldo = 0
	public void fecharConta() {
		if(this.getSaldo()<0) {
			System.out.println("Conta em débito, não pode fechar");
		}else if(this.getSaldo()>0){
			System.out.println("Conta com dinheiro, não pode fechar");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(Double deposito) {
		if(this.isStatus()==true) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Depósito realizado com sucesso na conta de "+getDono());
		}else {
			System.out.println("Não pode fazer um deposito, a conta de "+getDono()+ "com o número "+getNumConta()+ "está inativa.");;
		}
	}
	
	public void levantar(Double levantamento) {
		if(this.isStatus()==true) {
			if(this.getSaldo() >= levantamento) {
				this.setSaldo(this.getSaldo() - levantamento);
				System.out.println("Levantamento realizado com sucesso na conta de "+getDono());
			}else if(this.getSaldo()<levantamento && this.getSaldo() >= 0){
				System.out.println("Não tem dinheiro suficiente para fazer o levantamento da conta de "+getDono());
			}else if(this.getSaldo()<0) {
				System.out.println("Está em débito, não pode fazer levantamento da conta de "+getDono());	
			}
		}else {
			System.out.println("Não pode fazer um levantamento, a conta de "+ getDono() +" com o número "+getNumConta()+ "está inativa.");
		}
	}
	
	// se for cp mensalidade é 20
	// se for cc mensalidade é 12
	public void pagarMensalidade() {
		if(this.getTipo() == "cc") {
			if(this.getSaldo()>12) {
				System.out.println("Pagamento mensalidade realizado com sucesso");
				this.setSaldo(this.getSaldo() - 12);
			}else {
				System.out.println("Não pode cobrar porque não tem saldo suficiente.");
			}
		} else if(this.getTipo()=="cp") {
			if(this.getSaldo()>20) {
				this.setSaldo(this.getSaldo()-20);
				System.out.println("Pagamento mensalidade realizado com sucesso");
			}else{
				System.out.println("Não pode cobrar porque não tem saldo suficiente.");
			}
		}
	}
	
	public void estadoAtual(int numconta) {
		System.out.println("-------------------------------------");
		System.out.println("Numero da conta: " +this.getNumConta());
		System.out.println("Tipo: " +this.getTipo());
		System.out.println("Dono: " +this.getDono());
		System.out.println("Saldo: " +this.getSaldo() +" €");
		System.out.println("Status: " +this.isStatus());
	}
}
