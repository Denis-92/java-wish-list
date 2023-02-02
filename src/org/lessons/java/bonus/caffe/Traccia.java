package org.lessons.java.bonus.caffe;

public class Traccia {
	
//	 Esercizio: macchina del caffé
//	 Scrivere una classe MacchinaCaffe contenente i seguenti attributi:
//		- elenco bevande: lista di oggetti della classe Bevanda
//		- mappaMonete: mappa di <BigDecimal, Integer>

//	 E i seguenti metodi:
//		- aggiungiMoneta(BigDecimal moneta)
//		- erogaBevanda(int numeroBevanda)
//		- Bevanda getBevanda(int numeroBevanda) : ritorna la bevanda associata a quel numero
		
//	 (elenco bevande) contiene nome bevanda e costo, fare con una lista, come un vettore
//	 - costruttore inizializza l'elencoBevanda con
//		(caffe normale: costo 0,50 - caffe macchiato: costo 0,60 - caffe ginseng: costo 0,70)
//	 - mappaMonete: con le seguenti coppie
//		key		valore
//		0,05	0
//		0,10	0
//		0,20	0
//		0,50	0
//		1,00	0
//		2,00	0
		
// 	Quando l'utente inserisce la moneta corrispondente alla key, il rispettivo value aumenta come un contatore
// 	Ciclo che chiede all'utente di inserire un'altra moneta, fin quando il totale non è uguale o superiore al costo della bevanda.
		
// 	nella classe main:
//		-chiedere all'utente il numero della bevanda desiderata (da 0 a 2)
//		-mostrare il costo della bevanda
//		-chiedere all'utente di inserire monete (vedi sopra) chiamando di volta in volta il metodo aggiungiMoneta
//		-chiamare il metodo erogaBevanda, che mostra un messggio "bevanda <nomeBevanda> selezionata"
		
//	 La classe Bevanda avrà gli attributi (nome, prezzo, e mettere getters e setters)
	
// PS. per incrementare un Integer nella presente in un HashMap, bisogna usare il put, ad esempio:
//	mappaMonete.put(moneta, mappaMonete.get(moneta)+1)
//	(dove moneta è la chiave)

}
