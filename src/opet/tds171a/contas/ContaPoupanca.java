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
	
	public void sacar(float valor) throws SaldoInsuficienteException {
		float valorAdicional = (valor * (this.taxaSaque/100));
		float valorAjustado = valor + valorAdicional;
		super.sacar(valorAjustado);
	}
	

}
