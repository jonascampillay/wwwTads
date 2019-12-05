package LP;

import java.util.Date;

public class Saque implements Operacao {

	private Conta contaOrigem;
	private double valor;
	private Date data = new Date();

	public Saque(Conta objConta, double valor) {
		this.contaOrigem = objConta;
		this.valor = valor;
		
	}

	@Override
	public boolean efetuar() {

		if (contaOrigem.sacar(valor)) {
			data = new Date(System.currentTimeMillis());
			contaOrigem.addOperacao(this);
			return true;
		} else
			return false;

	}
	
	@Override
	public String toString() {
		return "Saque [contaOrigem=" + contaOrigem + ", valor=" + valor + ", data=" + data + "]";
	}


}
