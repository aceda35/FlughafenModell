package de.gruppeE.FlughafenModell;

import java.io.IOException;

public class Bank {

String str;	
	
	public Bank() throws IOException {

	}

	public void checkBonitaet(OnlineCustomer oC) {
		if (oC.balance < 500) {
			oC.setBonitaet(false);

		} else {
			oC.setBonitaet(true);
		}

	}

	public void transferMoney() {

	}

}