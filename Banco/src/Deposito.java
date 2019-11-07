import java.util.Date;

public class Deposito implements Operacao{
	private Conta contaOrigem;
	private double valor;
	private Date data;

	public Deposito(Conta contaOrigem, double valor) {
		this.contaOrigem = contaOrigem;
		this.valor = valor;
		this.data = new Date();
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
}
