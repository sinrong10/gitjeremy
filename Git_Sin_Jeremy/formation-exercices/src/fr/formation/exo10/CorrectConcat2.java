package fr.formation.exo10;

/**
 * Solution 2 pour pouvoir modifier correctement la chaine 's'.
 *
 * @author hb-asus
 *
 */
public class CorrectConcat2 {

	/**
	 * Version corrig�e de la m�thode qui utilise un StringBuffer et sa m�thode
	 * append() pour �viter de faire une nouvelle instance de String comme avec
	 * l'op�rateur '+='.
	 *
	 * @param s
	 *            la premi�re chaine � concat�ner.
	 * @param s2
	 *            la deuxi�me chaine � concat�ner.
	 */
	public static void concat(StringBuffer s, String s2) {
		s.append(s2);
	}

	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("China Blue");
		System.out.println(s);
		CorrectConcat2.concat(s, " Express");
		System.out.println(s);
	}
}
