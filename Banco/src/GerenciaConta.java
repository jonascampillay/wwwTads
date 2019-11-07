import java.util.Iterator;
import java.util.Scanner;

public class GerenciaConta {
	public static Conta selecionarConta(Cliente clientx, Scanner entrada) {
		Iterator<Conta> iterConta = Principal.lstContas.iterator();
		String contas = "Insira o código da conta desejada\n";
		Conta contaAux;
		boolean continuar = true;
		try {
			while (continuar) {
				if (iterConta.hasNext()) {
					contaAux = iterConta.next();
					for (int i = 0; i < Principal.lstContas.size(); i++) {
						contaAux = Principal.lstContas.get(i);
						if (clientx.equals(contaAux.getTitular())) {
							contas += i + "- " + contaAux.toString() + "\n";
						}
					}
					contas += "ou digite -1 para cancelar";
					System.out.println(contas);
					int index = Integer.valueOf(entrada.nextLine());
					if (index >= 0 && index <= (Principal.lstContas.size() - 1)) {
						return Principal.lstContas.get(index);
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

	protected static void cadastraConta(Scanner entrada) {
		boolean sair = false;
		do {
			try {
				System.out.println("Que tipo de conta?\n1- Corrente\n2- Poupança\n0- Voltar ao menu anterior");
				int tipoConta = Integer.valueOf(entrada.nextLine());

				switch (tipoConta) {
				case 1:
					if(GerenciaConta.cadastraContaCorrente(entrada)) {
						sair = true;
					}
					break;
				case 2:
					if(GerenciaConta.cadastraContaPoupanca(entrada)) {
						sair = true;
					}
					break;
				case 0:
					sair = true;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			} catch (Exception e) {
				System.err.println("Erro ao cadastrar conta!");
			}
		} while (!sair);
	}

	// cadastra a conta no array list
	public static boolean cadastraContaCorrente(Scanner entrada) {
		Cliente clientezinho = GerenciaCliente.selecionarCliente(entrada);
		int agencia = clientezinho.getNumeroAg();
		Conta novaConta = new ContaCorrente(agencia, clientezinho);
		try {
			if (Principal.lstContas.add(novaConta)) {
				System.out.println("Conta cadastrada com sucesso");
				return true;
			} else {
				System.out.println("A conta não foi cadastrada");
			}

		} catch (Exception e) {
			System.err.println("Quebrou");
		}
		return false;
	}

	// cadastra a conta no array list
	public static boolean cadastraContaPoupanca(Scanner entrada) {
		Cliente clientezinho = GerenciaCliente.selecionarCliente(entrada);
		int agencia = clientezinho.getNumeroAg();
		Conta novaConta = new ContaPoupanca(agencia, clientezinho);
		try {
			if (Principal.lstContas.add(novaConta)) {
				System.out.println("Conta cadastrada com sucesso");
				return true;
			} else {
				System.out.println("A conta não foi cadastrada");
			}

		} catch (Exception e) {
			System.err.println("Quebrou");
		}
		return false;
	}

	// exclui uma conta desejada
	public static boolean CancelarConta(int numConta) {
		int indice = LocalizarConta(numConta);
		if (indice != -1) {
			Principal.lstContas.remove(indice);
			return true;
		} else {
			return false;
		}
	}

	// metodo que busca uma bonta dentro do arraylist e retorna sua posição
	private static int LocalizarConta(int numero) {
		for (int cont = 0; cont < Principal.lstContas.size(); cont++) {
			Conta conta = Principal.lstContas.get(cont);

			if (conta.getNumConta() == numero) {
				return cont;
			}
		}
		return -1;
	}

	// método para mostrar todas as contas que estão cadastradas no sistema
	public static void mostraContas() {
		Iterator<Conta> iterConta = Principal.lstContas.iterator();
		Conta contaAux = iterConta.next();
		String contas = "";
		for (int i = 0; i < Principal.lstContas.size(); i++) {
			contas += i + "- " + contaAux.toString() + "\n";
		}
		System.out.println(contas);
	}


}
