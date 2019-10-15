
public class ContaCorrente extends Conta {
	private double limiteConta;
	private static String tipo = "Corrente";

	public ContaCorrente(int numeroAg,  int codCliente) {
		super(numeroAg, codCliente);
		this.limiteConta = 150.00;
	}
	
	@Override
	public boolean sacar(double valor) {
		double limiteSaque = this.saldo + this.limiteConta;

		if (limiteSaque >= valor) {
			this.saldo -= valor;
			System.out.println("Operação aprovada");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	@Override
	public String toString() {
		return "Conta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nLimite da Conta: " 
				+ this.limiteConta;
	}
}
