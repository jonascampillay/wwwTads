public class ContaPoupanca extends Conta {
	private String dtaAniv;
	private double rendimento;

	public ContaPoupanca(int numeroAg, int codCliente) {
		super(numeroAg, codCliente);
		this.dtaAniv = "01";
		this.rendimento = 0.05;
		this.tipo = "Poupança";
	}

	public boolean viraMes(Conta conta) {
		if (this.saldo > 0) {
			this.saldo += this.saldo * this.rendimento;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta + "\nSaldo: " + this.saldo + "\nData de Aniversário: " + this.dtaAniv;
	}
}
