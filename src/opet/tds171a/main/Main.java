package opet.tds171a.main;

import opet.tds171a.contas.ContaCorrente;
import opet.tds171a.contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		// Manipulando a conta corrente
		ContaCorrente contaCorrente = new ContaCorrente(1234, 1000f);
		
		try {
			contaCorrente.sacar(100.00f);
			System.out.println("Saldo da conta: "+ contaCorrente.saldo() );
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		} finally {
			System.out.println("Saldo mesmo se der erro: "+ contaCorrente.saldo() );
		}
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(4011, 1000f);
		try {
			contaPoupanca.sacar(1000.00f);
			System.out.println("Saldo da conta: "+ contaPoupanca.saldo() );
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		} finally {
			System.out.println("Saldo mesmo se der erro: "+ contaPoupanca.saldo() );
		}

	}

}
