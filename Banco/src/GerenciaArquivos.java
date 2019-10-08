import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciaArquivos {
	//Método para salvar os dados de uma string em um arquivo de texto
	public static void salvarComAppend(String fileName, String texto) throws IOException { 
		// Neste m�todo, concatena-se o novo texto
		// ao final do arquivo
		// Aten��o para segundo parametro "true" (append)
		FileWriter arquivo = new FileWriter(fileName, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.newLine();
		gravador.close();
		arquivo.close();

	}

	public static int[] Ler(String caminho) {
		int[] vet;
		FileReader arquivo;// CRIA VARIAVEL DE ARQUIVO P LEITURA
		BufferedReader leitor;// CRIA VARIAVEL DO LEITOR DE ARQUIVO
		String linha = "", texto = "";// VARIAVEIS QUE VAO RECEBER O TEXTO
		try {
			arquivo = new FileReader(caminho);// ABRE ARQUIVO
			leitor = new BufferedReader(arquivo);// CRIA LEITOR DE ARQUIVO
			while (linha != null) {// COPIA LINHA A LINHA AT� LINHA SER NULA
				linha = leitor.readLine();// COPIA UMA LINHA DO ARQUIVO P VARIAVEL
				if (linha != null) {
					texto += linha;
					String[] palavras = linha.split(";");  //Ainda é necessário implementar o método para ler os arryas list
					                                       // esta´apenas com o esqueleto
					
					//vetCaes[contquestao++] = novoCao2;
					
					
				}
			}
			leitor.close();
			arquivo.close();
			System.out.println(texto);

		} catch (IOException e) {
			System.out.println("Erro na abertura do arquivo");
		}
		return null;
	}
}
