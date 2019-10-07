public class ContaPoupanca extends Conta {
	private String dtaAniv;
	private double rendimento;

	public ContaPoupanca(int numeroAg,  int codCliente) {
		super(numeroAg, codCliente);
		this.dtaAniv = "01";
		this.rendimento = 0.05;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta
				+ "\nSaldo: " + this.saldo
				+ "\nData de Aniversário: " 
				+ this.dtaAniv;
	}
}
