package com.bruno;

public class Main {

	public static void main(String[] args) {
		Cliente bruno= new Cliente("Bruno Neves", "126457891011");

		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaPoupanca(bruno);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
