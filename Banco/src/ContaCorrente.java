
public class ContaCorrente extends Conta {
	private double limiteConta;
	private double tarifa = 20;
	private double juros = 0.03;

	public ContaCorrente(int numeroAg, Cliente titular) {
		super(numeroAg, titular);
		this.limiteConta = 150.00;
		this.tipo = "Corrente";
	}
	
	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
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

	public void viraMes() {
		this.saldo -= this.saldo * juros;
		this.saldo -= tarifa;
	}

	
	@Override
	public String toString() {
		return  "Titular: " + this.getTitular().getNome() 
				+ "\nConta : " + this.numConta 
				+ "\nSaldo: " + this.saldo
				+ "\nLimite da Conta: " + this.limiteConta;
	}
}
