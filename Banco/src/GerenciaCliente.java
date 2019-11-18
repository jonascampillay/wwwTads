import java.util.Iterator;
import java.util.Scanner;

public class GerenciaCliente {

	public static Cliente selecionarCliente(Scanner entrada) {
		Iterator<Cliente> iterCliente = Principal.lstClientes.iterator();
		String clientes = "Insira o código do cliente desejado\n";
		Cliente clienteAux;
		boolean continuar = true;
		int index = 0;
		try {
			while (continuar) {
				if (iterCliente.hasNext()) {
					clienteAux = iterCliente.next();
					for (int i = 0; i < Principal.lstClientes.size(); i++) {
						clienteAux = Principal.lstClientes.get(i);
						clientes += i + "- " + clienteAux.toString() + "\n";
					}
					clientes += "ou digite -1 para cancelar";
					System.out.println(clientes);

					int codCliente = Integer.valueOf(entrada.nextLine());

					for (int i = 0; i < Principal.lstClientes.size(); i++) {
						clienteAux = Principal.lstClientes.get(i);
						if (codCliente == clienteAux.getCodCliente()) {
							return Principal.lstClientes.get(i);
						}else if(codCliente == -1) {
							continuar = false;
						}
					}
				} else if (Principal.lstClientes.isEmpty()) {
					System.out.println("Nenhum cliente cadastrado!");
					return null;
				}
			}
		} catch (Exception e) {
			System.out.println("Entrada Inválida!!");
		}
		return null;
	}

	public static void excluirCliente(Scanner entrada) {
		try {
			Cliente ClienteAux = selecionarCliente(entrada);

			if (ClienteAux != null) {
				Principal.lstAgencias.remove(ClienteAux);

				System.out.println("Agência excluida!");
			}

		} catch (Exception e) {

		}

	}

	public static boolean criarCliente(Scanner entrada) {
		try {
			Pessoa novaPessoa = GerenciaPessoa.cadastraPessoa(entrada);

			if (novaPessoa != null) {
				Cliente novoCliente = new Cliente(novaPessoa);

				novoCliente.setNumeroAg(GerenciaAgencia.selecionarAgencia(entrada).getNumeroAg()); /// quebrando aqui
																									/// meu parceiro
				System.out.println("Insira a senha do novo cliente");
				novoCliente.setSenha(entrada.nextLine());
				return Principal.lstClientes.add(novoCliente);

			} else {
				System.out.println("CPF já cadastrado");
			}

		} catch (Exception e) {
			System.err.println("Algo de errado não está certo");
		}
		return false;
	}

	public static boolean buscarCliente(int i) {
		// Retorna true se encontra o elemento e false se não encontra
		Cliente clienteAux = new Cliente();

		int posElem = Principal.lstClientes.indexOf(clienteAux);
		if (posElem > -1) {
			return true;
		}

		return false;
	}

}
