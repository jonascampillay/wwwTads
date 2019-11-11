
public class ContaCorrente extends Conta {
	private double limiteConta;

	public ContaCorrente(int numeroAg, Cliente titular) {
		super(numeroAg, titular);
		this.limiteConta = 150.00;
		this.tipo = "Corrente";
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
	public boolean viraMes(Conta conta) {
		
		return false;
	}
	
	@Override
	public String toString() {
		return  "Titular: " + this.getTitular().getNome() 
				+ "\nConta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nLimite da Conta: " + this.limiteConta;
	}
}
