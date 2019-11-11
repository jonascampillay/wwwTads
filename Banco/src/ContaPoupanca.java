public class ContaPoupanca extends Conta {
	private String dtaAniv;
	private double rendimento;

	public ContaPoupanca(int numeroAg, Cliente titular) {
		super(numeroAg, titular);
		this.dtaAniv = "01";
		this.rendimento = 0.05;
		this.tipo = "Poupança";
	}

	public void viraMes() {
		if (this.saldo > 0) {
			this.saldo += this.saldo * this.rendimento;
		}
	}

	@Override
	public String toString() {
		return "Titular: " + this.getTitular().getNome() + "\nConta : " + this.numConta + "\nSaldo: " + this.saldo + "\nData de Aniversário: " + this.dtaAniv;
	}
}
