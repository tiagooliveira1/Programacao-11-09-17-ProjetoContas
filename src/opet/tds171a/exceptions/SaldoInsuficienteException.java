package opet.tds171a.exceptions;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}
	
	public SaldoInsuficienteException() {
		super("Saldo insuficiente!");
	}

}
