package Visibilities;

public class Application {

	public static void main(String[] args) {

		AccountBank account = new AccountBank();
		
		account.setActive(true);
		account.depositar(500, account);
		
		account.sacar(100);
		
		System.out.println("Saldo atual: " + account.exibirSaldo());
	
		
	}

}
