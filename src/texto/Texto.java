package texto;

public class Texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arq = "teste.txt";
		
		String texto = "ola mundo!\n Sou a mariana";
		
		if(Arquivo.Write(arq,texto)) {
			System.out.println("Salvo com sucesso");
		}else {
			System.out.println("Erro ao salvar!");
		}
		System.out.println(Arquivo.Read(arq));
	}

}
