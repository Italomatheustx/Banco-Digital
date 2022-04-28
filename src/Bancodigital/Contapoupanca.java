package Bancodigital;

public class Contapoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		
	}
}
