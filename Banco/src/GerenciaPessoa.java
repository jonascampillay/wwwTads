import java.util.Iterator;
import java.util.Scanner;

public class GerenciaPessoa {
	public static Pessoa cadastraPessoa(Scanner entrada) {
		Pessoa novaPessoa = new Pessoa();

		try {
			System.out.println("Insira o nome da nova pessoa");
			novaPessoa.setNome(entrada.nextLine());
			System.out.println("Insira o CPF");
			novaPessoa.setCPF(entrada.nextLine());
			if (!buscarPessoa(novaPessoa)) {
				System.out.println("Insira o endereço");
				novaPessoa.setEndereco(entrada.nextLine());
				if (Principal.lstPessoas.add(novaPessoa)) {
					return novaPessoa;
				}
			} else {
				System.out.println("CPF já cadastrado");
			}

		} catch (Exception e) {
			System.err.println("Entrada inválida");
		}
		return null;
	}

	public static boolean buscarPessoa(Pessoa pessoa) {
		// Retorna true se encontra o elemento e false se não encontra
		Pessoa pessoaAux = new Pessoa(pessoa.getCPF());

		int posElem = Principal.lstPessoas.indexOf(pessoaAux);
		if (posElem >= 0) {
			return true;
		}
		return false;
	}

	public Pessoa selecionaPessoa(Scanner entrada) {
		Iterator<Pessoa> iterPessoa = Principal.lstPessoas.iterator();
		String pessoas = "Insira o CPF da pessoa desejada\n";
		boolean continuar = true;
		Pessoa pessoaAux;
		int index = 0;

		try {
			while (continuar) {
				if (iterPessoa.hasNext()) {
					for (int i = 0; i < Principal.lstPessoas.size(); i++) {
						pessoaAux = Principal.lstPessoas.get(i);
						pessoas += i + "- " + pessoaAux.toString() + "\n";
					}
					System.out.println(pessoas + "ou digite -1 para cancelar");

					String CPF = entrada.nextLine();

					for (int i = 0; i < Principal.lstPessoas.size(); i++) {
						pessoaAux = Principal.lstPessoas.get(i);
						if (CPF.equalsIgnoreCase(pessoaAux.getCPF())) {
							index = i;
						}
					}

					index = Integer.valueOf(entrada.nextLine());
					if (index >= 0 && index <= (Principal.lstPessoas.size() - 1)) {
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
