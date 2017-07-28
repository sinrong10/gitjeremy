package fr.formation.exo10;

/**
 * D�monstration d'une tentative de modification de String incorrecte.
 *
 * @author hb-asus
 *
 */
public class IncorrectConcat {

	/**
	 * Dans cette m�thode, l'op�rateur '+=' produit implicitement un 'new
	 * String()' et de ce fait le String 's' en dehors de la m�thode n'est pas
	 * du tout modifi�.
	 *
	 * @param s
	 *            la premi�re chaine � concat�ner.
	 * @param s2
	 *            la deuxi�me chaine � concat�ner.
	 */
	public static void concat(String s, String s2) {
		s += s2;
	}

	public static void main(String args[]) {
		String s = "China Blue";
		System.out.println(s);
		IncorrectConcat.concat(s, " Express");
		System.out.println(s);
	}
}
