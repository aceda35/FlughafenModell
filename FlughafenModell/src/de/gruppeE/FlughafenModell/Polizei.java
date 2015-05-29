package de.gruppeE.FlughafenModell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Polizei {

	Collection<String> strafregister = new ArrayList<>();

	public Polizei() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Strafregister"));
		String register;

		while ((register = br.readLine()) != null) {
			strafregister.add(register);
			System.out.println(register);
		}

	}

	public void checkForCriminal() {

	}

	public static void main(String[] args) throws IOException {
		Polizei polizei = new Polizei();

	}

}