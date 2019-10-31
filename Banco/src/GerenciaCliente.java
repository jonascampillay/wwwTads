import java.util.Iterator;
import java.util.Scanner;


public class GerenciaCliente {
	
	public static Cliente selecionarCliente(Scanner entrada) {
		Iterator<Cliente> iterCliente = Principal.lstClientes.iterator();
		String clientes = "Insira o código do cliente desejado\n";
		Cliente clienteAux;
		boolean continuar = true;
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
					int index = Integer.valueOf(entrada.nextLine());
					if (index >= 0 && index <= (Principal.lstClientes.size() - 1)) {
						return Principal.lstClientes.get(index);
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
			Cliente novoCliente = new Cliente();
			
			System.out.println("Insira o nome da nova pessoa");
			novoCliente.setNome(entrada.nextLine());
			System.out.println("Insira o CPF");
			novoCliente.setCPF(entrada.nextLine());
			if(!GerenciaPessoa.buscarPessoa(novoCliente)) {
				System.out.println("Insira o endereço");
				novoCliente.setEndereco(entrada.nextLine());
				novoCliente.setNumeroAg(GerenciaAgencia.selecionarAgencia(entrada).getNumeroAg()); /// quebrando aqui meu parceiro 
				System.out.println("Insira a senha do novo cliente");
				novoCliente.setSenha(Integer.valueOf(entrada.nextLine()));
				return Principal.lstClientes.add(novoCliente);
				
			}else{
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
