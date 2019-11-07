import java.util.Date;

public class Deposito implements Operacao{
	private double valor;
	private Date data;
	
	
	public Deposito(Double valor) {
		this.valor = valor;
	}


	public boolean efetuar() {
		return true;
	}
}
