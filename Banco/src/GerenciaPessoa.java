import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GerenciaPessoa {
	public static int cadastraPessoa(Scanner entrada) {
		Pessoa novaPessoa = new Pessoa();
		
		try {
			System.out.println("Insira o nome da nova pessoa");
			novaPessoa.setNome(entrada.nextLine());
			System.out.println("Insira o CPF");
			novaPessoa.setCPF(entrada.nextLine());
			if(!buscarPessoa(novaPessoa.getCPF())) {
				System.out.println("Insira o endereço");
				novaPessoa.setEndereco(entrada.nextLine());
				Principal.lstPessoas.add(novaPessoa);
				return novaPessoa.getCodPessoa();
			}else{
				System.out.println("CPF já cadastrado");
			}
			
		} catch (Exception e) {
			System.err.println("Entrada inválida");
		}
		return -1;
	}

	public static boolean buscarPessoa(String CPF) {
		// Retorna true se encontra o elemento e false se não encontra
				Pessoa pessoaAux = new Pessoa(CPF);

				int posElem = Principal.lstPessoas.indexOf(pessoaAux);
				if (posElem >= 0) {
					return true;
				}
				return false;
	}

	public Pessoa selecionaPessoa(Scanner entrada) {
		Iterator<Pessoa> iterPessoa = Principal.lstPessoas.iterator();
		String pessoas = "Insira o código da pessoa desejada\n";
		boolean continuar = true;
		Pessoa pessoaAux;

		try {
			while (continuar) {
				if (iterPessoa.hasNext()) {
					for (int i = 0; i < Principal.lstPessoas.size(); i++) {
						pessoaAux = Principal.lstPessoas.get(i);
						pessoas += i + "- " + pessoaAux.toString() + "\n";
					}
					System.out.println(pessoas + "ou digite -1 para cancelar");

					int index = Integer.valueOf(entrada.nextLine());
					if (index >= 0 && index <= (Principal.lstGerentes.size() - 1)) {
						return Principal.lstPessoas.get(index);
					} else if (index == -1) {
						continuar = false;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Entrada Inválida!!");
		}
		return null;
	}
}
