package Bancodigital;

public class Main {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		
		Contapoupanca poupanca = new Contapoupanca();
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
