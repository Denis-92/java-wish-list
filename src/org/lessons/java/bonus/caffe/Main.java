package org.lessons.java.bonus.caffe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);

		System.out.print("Seleziona bevanda: 0 caffe normale - 1 macchiato - 2 ginseng: ");
		int bevandaSelezionata = Integer.parseInt(inputContainer.nextLine());
		
		MacchinaCaffe bevanda = new MacchinaCaffe();		
		
		System.out.println("Prezzo bevanda: " + bevanda.getPrezzo(bevandaSelezionata));
		
		inputContainer.close();
		// Chiuso inputContainer
		
		bevanda.erogaBevanda(bevandaSelezionata);
		
		System.out.println("Programma terminato!");

	}

}
