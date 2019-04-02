package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	String parola;
	List<String> parole = new LinkedList<String>();
	double inizio=0;
	double fine=0;
		
	public Parole() {
		
	}
	
	public void addParola(String p) {
		if(!parole.contains(p)) {
			parole.add(p);
		}
	}
	
	public List<String> getElenco() {
		Collections.sort(parole, new ComparatoreString());
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void cancella(String p) {
		parole.remove(p);
	}
	
	

}
