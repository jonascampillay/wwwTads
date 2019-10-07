
public class ContaCorrente extends Conta {
	private double limiteConta;

	public ContaCorrente(int numeroAg,  int codCliente) {
		super(numeroAg, codCliente);
		this.limiteConta = 150.00;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nLimite da Conta: " 
				+ this.limiteConta;
	}
}
