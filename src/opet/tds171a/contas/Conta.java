package opet.tds171a.contas;

import com.sun.javafx.scene.control.skin.TreeTableRowSkin;

import opet.tds171a.exceptions.SaldoInsuficienteException;

/**
 * Classe para representar a conta
 * @author Tiago Roberto de Oliveira
 *
 */
public class Conta {

	private int numeroConta;
	private float saldo;
	private float taxaSaque = 10.00f;
	
	/**
	 * Construtor da classe
	 * @param numero
	 * @param saldo
	 */
	public Conta(int numero, float saldo) {
		this.saldo = saldo;
		this.setNumeroConta(numero);
	}
	
	/**
	 * Realiza um saque na conta 
	 * @return
	 */
	public void sacar(float valor) throws SaldoInsuficienteException {
		if(valor > this.saldo)
			throw new SaldoInsuficienteException();
		else	
			if(this instanceof ContaCorrente)
				this.saldo = this.saldo - valor;
			else
				this.saldo = this.saldo - valor - (valor * (this.taxaSaque/100));
		
	}
	
	/**
	 * Retorna o saldo da conta 
	 * @return
	 */
	public float saldo() {
		
		return this.saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	

	
}
