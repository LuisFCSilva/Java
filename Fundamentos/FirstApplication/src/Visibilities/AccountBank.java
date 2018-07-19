package Visibilities;

public class AccountBank {

	private int numberAccount;
	private String numberAgency;

	private float value;
	private boolean active;

	public void sacar(float value) {
		if (this.value >= value && this.active == true) {
			this.value -= value;
			System.out.println("Valor sacado: " + value);
		} else if (this.value <= value && this.active == true) {
			System.out.println("Saldo insuficiente.");
		} else if (this.active == false) {
			System.out.println("Account is inative. Impossível sacar.");
		}
	}

	public void depositar(float value, AccountBank account) {
		if (value > 0 && account.active == true) {
			account.value += value;
			System.out.println("Valor depositado: " + value);
		} else {
			System.out.println("Impossível depositar");
		}

	}
	
	public float exibirSaldo() {
		return this.value;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getNumberAgency() {
		return numberAgency;
	}

	public void setNumberAgency(String numberAgency) {
		this.numberAgency = numberAgency;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
