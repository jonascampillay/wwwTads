import java.util.Date;

public class Saque implements Operacao{
	private double valor;
	private Date data;
	
	public Saque(Double valor) {
		this.valor = valor;
	}
	
	public boolean efetuar() {
		return true;
	}
}
