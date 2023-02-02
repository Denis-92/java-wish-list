package org.lessons.java.bonus.caffe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap; 

public class MacchinaCaffe {

	ArrayList<Bevanda> elencoBevande = new ArrayList<Bevanda>();
	
	HashMap <BigDecimal, Integer> mappaMonete = new HashMap<BigDecimal, Integer>();
	
	public MacchinaCaffe() {
		
		elencoBevande.add(new Bevanda("caffe normale", new BigDecimal ("0.5")));
		elencoBevande.add(new Bevanda("caffe macchiato", new BigDecimal ("0.6")));
		elencoBevande.add(new Bevanda("caffe ginseng", new BigDecimal ("0.7")));
		
		mappaMonete.put(new BigDecimal("0.05"), 0);
		mappaMonete.put(new BigDecimal("0.1"), 0);
		mappaMonete.put(new BigDecimal("0.2"), 0);
		mappaMonete.put(new BigDecimal("0.5"), 0);
		mappaMonete.put(new BigDecimal("1"), 0);
		mappaMonete.put(new BigDecimal("2"), 0);
	}
	
	public void aggiungiMoneta(BigDecimal moneta) {
		Integer n= mappaMonete.get(moneta);
		n++;
	}
	
	public void erogaBevanda(int numeroBevanda) {
		String b= elencoBevande.get(numeroBevanda).getNome();
		System.out.println("Bevanda: " + b + " erogata.");
	}
	
	
	
}
