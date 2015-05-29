package de.gruppeE.FlughafenModell;

public class OnlineCustomer {

	int balance;
	String lastName;
	String firstName;
	String street;
	int strNumber;
	int zipCode;
	String country;
	boolean bonitaet;

	public void setBonitaet(boolean bon) {
		bonitaet = bon;
	}

	public OnlineCustomer() {
		balance = (int) (Math.random() * 2000);
	}

	public int getBalance() {
		return balance;
	}
}