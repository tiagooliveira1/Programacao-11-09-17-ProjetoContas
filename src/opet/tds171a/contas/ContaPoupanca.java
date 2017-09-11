package opet.tds171a.contas;

import opet.tds171a.exceptions.SaldoInsuficienteException;

/**
 * Classe para representar a conta poupança
 * @author troli
 *
 */
public class ContaPoupanca extends Conta {
	
	private float taxaSaque = 10.00f;
	
	/**
	 * Construtor da classe
	 * @param numero
	 * @param saldo
	 */
	public ContaPoupanca(int numero, float saldo) {
		super(numero, saldo);
		this.taxaSaque = 10.00f;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Realiza o saque, calculando o adicional com taxa de saque
	 */
	public boolean sacar(float valor) throws SaldoInsuficienteException {

		float valorAjustado = valor + (valor * (this.taxaSaque/100));
		try {
			super.sacar(valorAjustado);
		} catch (Exception e) {
			throw new SaldoInsuficienteException();
		}
		return true;
	}
	

}
