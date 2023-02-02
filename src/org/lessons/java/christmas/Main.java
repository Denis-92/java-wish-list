package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> listaDesideri = new ArrayList<>();
		boolean continua;
		String desiderio;
		System.out.print("Inserisci il tuo desiderio: ");
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		do {
			desiderio = inputContainer.nextLine();
			continua = !desiderio.equals("STOP");
			if (continua) {
				listaDesideri.add(desiderio);
				System.out.println("Inserisci un altro desiderio o scrivi \"STOP\" per terminare la lista: ");
			}
		} while (continua);
		
		inputContainer.close();
		// Chiuso inputContainer

	}

}
