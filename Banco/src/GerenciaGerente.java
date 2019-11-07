import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class GerenciaGerente {
	public static Gerente selecionarGerente(Scanner entrada) {
		Iterator<Gerente> iterGerente = Principal.lstGerentes.iterator();
		String gerentes = "Insira o código do Gerente desejado\n";
		boolean continuar = true;
		Gerente gerenteAux;

		try {
			while (continuar) {
				if (iterGerente.hasNext()) {
					for (int i = 0; i < Principal.lstGerentes.size(); i++) {
						gerenteAux = Principal.lstGerentes.get(i);
						gerentes += i + "- " + gerenteAux.toString() + "\n";
					}
					System.out.println(gerentes + "ou digite -1 para cancelar");

					int index = Integer.valueOf(entrada.nextLine());
					if (index >= 0 && index <= (Principal.lstGerentes.size() - 1)) {
						return Principal.lstGerentes.get(index);
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

	public static boolean cadastraGerente(Scanner entrada) {
		try {
			Pessoa novaPessoa = GerenciaPessoa.cadastraPessoa(entrada);

			if (novaPessoa != null) {
				
				Gerente novoGerente = new Gerente(novaPessoa);
				Agencia agGerente = GerenciaAgencia.selecionarAgencia(entrada);
				
				if (agGerente != null) {

					novoGerente.setNumeroAg(agGerente.getNumeroAg());
					System.out.println("Insira a matricula do gerente");
					novoGerente.setMatricula(Integer.valueOf(entrada.nextLine()));
					System.out.println("Insira o salário do gerente");
					novoGerente.setSalario(entrada.nextDouble());

					if (agGerente.getGerente() != null) {
						agGerente.setGerente(novoGerente);
					//	Principal.lstPessoas.add((Pessoa)novoGerente);
						return Principal.lstGerentes.add(novoGerente);
					} else {
						System.out.println("Agencia já possui gerente cadastrado!!\nOperação cancelada");
					}
				} else {
					System.out.println("Nenhuma agência selecionada!");
				}

			} else {
				System.out.println("CPF já cadastrado");
			}

		} catch (Exception e) {
			System.err.println("Algo de errado não está certo");
		}
		return false;
	}

	public static boolean cancelarGerente(int codGerente) {
		int indice = -1;
		boolean continuar = true;
		Gerente gerenteAux = new Gerente();

		for (int i = 0; i < Principal.lstGerentes.size() && continuar; i++) {
			gerenteAux = Principal.lstGerentes.get(i);
			if (gerenteAux.getCodGerente() == codGerente) {
				indice = i;
				continuar = false;
			}
		}

		if (indice != -1) {
			Principal.lstGerentes.remove(indice);
			return cancelarGerenteAgencia(gerenteAux);
		}
		return false;
	}

	private static boolean cancelarGerenteAgencia(Gerente gerenteAux) {
		Agencia agenciaAux;
		for (int i = 0; i < Principal.lstAgencias.size(); i++) {
			agenciaAux = Principal.lstAgencias.get(i);
			if (gerenteAux == agenciaAux.getGerente()) {
				agenciaAux.setGerente(null);
				return true;
			}
		}
		return false;
	}

	public static void mostraGerentes() {
		Iterator<Gerente> iterGerente = Principal.lstGerentes.iterator();
		Gerente gerenteAux = iterGerente.next();
		String gerentes = "";
		for (int i = 0; i < Principal.lstGerentes.size(); i++) {
			gerentes += i + "- " + gerenteAux.toString() + "\n";
		}
		System.out.println(gerentes);
	}
}
