package LP;

import java.util.Date;

public class Transferencia implements Operacao {

	private double valor;
	private Date data;
	private Conta destino, contaOrigem;

	public Transferencia(double valor, Conta contaOrigem, Conta destino) {
		super();
		this.valor = valor;
		this.destino = destino;
		this.contaOrigem = contaOrigem;

	}

	@Override
	public boolean efetuar() {

		if (this.contaOrigem.transferir(valor, destino)) {
			this.data = new Date(System.currentTimeMillis());
			this.contaOrigem.addOperacao(this);
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		return "Transferencia [valor=" + valor + ", data=" + data + ", destino=" + destino + ", contaOrigem="
				+ contaOrigem + "]";
	}

}
