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
			Gerente novoGerente = new Gerente(GerenciaPessoa.cadastraPessoa(entrada));
			System.out.println("Insira a número da agência do gerente");
			int numeroAg = Integer.valueOf(entrada.nextLine());
			novoGerente.setNumeroAg(numeroAg);
			System.out.println("Insira a matricula do gerente");
			novoGerente.setMatricula(Integer.valueOf(entrada.nextLine()));
			System.out.println("Insira o salário do gerente");
			novoGerente.setSalario(entrada.nextDouble());

			return Principal.lstGerentes.add(novoGerente);

		} catch (Exception e) {
			System.err.println("Algo de errado não está certo");
		}
		return false;
	}

	public static boolean cancelarGerente(int codGerente) {
		int indice = localizarGerente(codGerente);
		if (indice != -1) {
			Principal.lstGerentes.remove(indice);
			return true;
		}
		return false;
	}

	private static int localizarGerente(int codGerente) {
		for (int index = 0; index < Principal.lstAgencias.size(); index++) {
			Gerente gerenteaux = Principal.lstGerentes.get(index);

			if (gerenteaux.getNumeroAg() == codGerente) {
				return index;
			}
		}
		return -1;
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
