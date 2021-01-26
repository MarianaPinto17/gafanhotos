package texto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public static String Read(String Caminho) {
		String conteudo = "";
		try {
			//primeiro vai tentar ler o arquivo que metemos no caminho
			FileReader arquivo = new FileReader(Caminho);
			//fazemos o buffer para ler o arquivo
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			String linha = "";
			try {
				linha = lerArquivo.readLine();
				while(linha!=null) {
					conteudo += linha+"\r\n";
					linha = lerArquivo.readLine();
				}
				arquivo.close();
			}catch(IOException ex) {
				conteudo = "Erro: Não foi possive ler o arquivo";
			}
		}catch(FileNotFoundException ex) {
			conteudo = "Erro: Arquivo não encontrado";
		}
		if(conteudo.contains("Erro")) {
			return "";
		}else {
			return conteudo;
		}
	}
	
	public static boolean Write(String Caminho, String Texto) {
		try {
			FileWriter arquivo = new FileWriter (Caminho);
			PrintWriter gravarArq = new PrintWriter(arquivo);
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}catch(IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
