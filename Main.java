package TP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Adherent> adherent = new ArrayList<Adherent>();
		Adherent a = new Adherent("a", "a");
		adherent.add(a);
		affichePersonnes(adherent);
		ArrayList<? extends Personne> personnes = new ArrayList<Personne>();
		personnes.add(a);
	}
	public static void affichePersonnes(List<? extends Personne> liste) {
		Iterator<? extends Personne> it = liste.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static <T> void remplace(List<T> list) {
		T a;
		List<T> copyList = new ArrayList<T>();
		for (Object o : list) {
			o = a;
			copyList.add(a);
		}
	}
	
	public static <T> T minimun(List<T> list) {
		
	}
		
		
		
		
	
	

}
