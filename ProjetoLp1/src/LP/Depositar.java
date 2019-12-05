package LP;

import java.util.Date;

public class Depositar implements Operacao {

	private Conta contaOrigem;
	private double valor;
	private Date data;

	public Depositar(Conta contaOrigem, double valor) {
		this.contaOrigem = contaOrigem;
		this.valor = valor;
	}

	@Override
	public boolean efetuar() {
		if (this.contaOrigem.depositar(valor)) {
			this.data = new Date(System.currentTimeMillis());
			this.contaOrigem.addOperacao(this);
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		return "Depositar [contaOrigem=" + contaOrigem + ", valor=" + valor + ", data=" + data + "]";
	}
}
