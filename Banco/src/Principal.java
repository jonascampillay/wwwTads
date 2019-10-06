import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	protected static ArrayList<Agencia> lstAgencias = new ArrayList();
	protected static ArrayList<Conta> lstContas = new ArrayList();
	protected static ArrayList<Cliente> lstClientes = new ArrayList();
	protected static ArrayList<Gerente> lstGerentes = new ArrayList();
	protected static ArrayList<Pessoa> lstPessoas = new ArrayList();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		int menu1;

		try {

			do {
				System.out.println("Informe a opção desejada senhor(a)" + "\n1 - Cadastro" + "\n2 - Exclusão"
						+ "\n3 - Exibir relatório" + "\n4 - Consultar dados" + "\n5 - Alterar dados"
						+ "\n6 - Operações bancárias" + "\n0 - Sair do sistema");
				menu1 = Integer.valueOf(entrada.nextLine());

				switch (menu1) {
				case 1:
					menuCadastro(entrada);

					break;
				case 2:
					menuExclusao(entrada);

					break;
				case 3:

					menuRelatorio(entrada);

					break;
				case 4:
					menuConsultaDados(entrada);
					break;
				case 5:
					menuAlterarDados(entrada);
					break;
				case 6:
					menuOperacoesBancarias(entrada);

					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida meu parciero, se oriente!");
					break;
				}

			} while (!sair);

		} catch (Exception e) {
			System.err.println("Isso não me cheira bem!!!");
		}

	}

	private static void menuOperacoesBancarias(Scanner entrada) {
		boolean sair = false;
		System.out.println("Qual operação bancária desejas??" + "\n1- Ver saldo" + "\n2 - Depositar " + "\n3 - Sacar"
				+ "\n4 - Trasferir" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

	private static void menuAlterarDados(Scanner entrada) {
		boolean sair = false;
		System.out.println("O que deseja cadastrar?" + "\n1- Clientes" + "\n2 - Agências" + "\n3 - Gerentes"
				+ "\n4 - Contas" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:
					System.out.println("Em manutenção");

					break;
				case 2:
					System.out.println("Em manutenção");

					break;
				case 3:
					System.out.println("Em manutenção");

					break;
				case 4:
					System.out.println("Em manutenção");

					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

	private static void menuConsultaDados(Scanner entrada) {
		boolean sair = false;
		System.out.println("O que deseja consultar?" + "\n1- Clientes" + "\n2 - Agências" + "\n3 - Gerentes"
				+ "\n4 - Contas" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:
					System.out.println(GerenciaCliente.selecionarCliente(entrada).toString());
					break;
				case 2:
					System.out.println(lstAgencias.toString());
					break;
				case 3:
					System.out.println(GerenciaGerente.selecionarGerente(entrada).toString());
					break;
				case 4:
					System.out.println(GerenciaConta.selecionarConta(entrada).toString());
					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

	private static void menuRelatorio(Scanner entrada) {
		boolean sair = false;
		System.out.println("O que deseja exibir relatório?" + "\n1- Clientes" + "\n2 - Agências" + "\n3 - Gerentes"
				+ "\n4 - Contas" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:
					System.out.println("Em manutenção");
					break;
				case 2:
					GerenciaAgencia.mostraAgencias();
					break;
				case 3:
					GerenciaGerente.mostraGerentes();
					break;
				case 4:
					GerenciaConta.mostraContas();
					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

	private static void menuExclusao(Scanner entrada) {
		boolean sair = false;
		System.out.println("O que deseja Excluir?" + "\n1- Clientes" + "\n2 - Agências" + "\n3 - Gerentes"
				+ "\n4 - Contas" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:
					GerenciaCliente.excluirCliente(entrada);

					break;
				case 2:
					System.out.println("informe o número da agencia");
					int numAgencia = Integer.valueOf(entrada.nextLine());
					if (GerenciaAgencia.cancelarAgencia(numAgencia)) {
						System.out.println("Agencia cancelada com sucesso");
					} else {
						System.out.println("Falha ao cancelar agencia");
					}

					break;
				case 3:

					System.out.println("Inforem o número do gerente");
					GerenciaGerente.mostraGerentes();
					if (GerenciaGerente.cancelarGerente(Integer.valueOf(entrada.nextLine()))) {
						System.out.println("Gerente esxluido com sucesso");
					} else {
						System.out.println("Falha ao excluir gerente");
					}

					break;
				case 4:
					GerenciaConta.mostraContas();
					System.out.println("Informe o número da conta");
					int numConta = Integer.valueOf(entrada.nextLine());
					if (GerenciaConta.CancelarConta(numConta)) {
						System.out.println("Conta excluida com sucesso");
					} else {
						System.out.println("Falha ao excluis conta");
					}
					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

	private static void menuCadastro(Scanner entrada) {
		boolean sair = false;
		System.out.println("O que deseja cadastrar?" + "\n1- Clientes" + "\n2 - Agências" + "\n3 - Gerentes"
				+ "\n4 - Contas" + "\n0 - Sair da ramificação");

		int menu2 = Integer.valueOf(entrada.nextLine());
		try {
			do {
				switch (menu2) {
				case 1:
					
					if (GerenciaCliente.criarCliente(entrada)) {
						System.out.println("Agência cadastrada com sucesso");
					}
					
					break;
				case 2:
					if (GerenciaAgencia.criarAgencia(entrada)) {
						System.out.println("Agência cadastrada com sucesso");
					}

					break;
				case 3:
					if (GerenciaGerente.cadastraGerente(entrada)) {
						System.out.println("Gerente Cadastrado com sucesso!");
					} else {
						System.out.println("Falha ao cadastrar o gerente!");
					}

					break;
				case 4:
					GerenciaConta.cadastraConta(entrada);

					break;
				case 0:
					sair = true;

					break;

				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (sair);

		} catch (Exception e) {
			System.err.println("Deu ruim");
		}

	}

}
