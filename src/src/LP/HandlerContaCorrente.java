package LP;

import java.util.Scanner;

import LP.Util;

public class HandlerContaCorrente extends HandlerConta {
	static Scanner entrada = new Scanner(System.in);

	public static void criarContaCorrente(String saldo,String limite, Cliente cliente) {
			
		Agencia agencia = HandlerAgencia.consultarAgencia();
		double saldod = Integer.valueOf(saldo);
		double limited = Integer.valueOf(limite);
			if (cliente != null && agencia != null) {
				ContaCorrente contaAux = new ContaCorrente( saldod, limited, cliente);
				agencia.inserirConta(contaAux);
				System.out.println("Conta Criada\n");
		}
	}

	public static ContaCorrente consultaContaC(Agencia agencia) {

		System.out.println("Digite o codigo da conta");
		int cod = Util.leInt(entrada);
		ContaCorrente conta = new ContaCorrente(cod);

		if (agencia != null) {
			int index = agencia.lstContas.indexOf(conta);

			if (index > -1)
				conta = (ContaCorrente) agencia.lstContas.get(index);
		}

		if (conta != null)
			return conta;
		else
			return null;
	}

}
