package fr.formation.exo10;

/**
 * Solution 1 pour pouvoir modifier correctement la chaine 's'.
 *
 * @author hb-asus
 *
 */
public class CorrectConcat {

	/**
	 * Version corrig�e de la m�thode qui renvoi la nouvelle chaine de caract�re
	 * produite par l'op�rateur '+='.
	 *
	 * @param s
	 *            la premi�re chaine � concat�ner.
	 * @param s2
	 *            la deuxi�me chaine � concat�ner.
	 * @return String la nouvelle chaine.
	 */
	public static String concat(String s, String s2) {
		return s += s2;
	}

	public static void main(String args[]) {
		String s = "China Blue";
		System.out.println(s);
		// Il ne faut pas oublier de stocker la nouvelle chaine produite dans
		// notre variable 's' pour que cela fonctionne.
		s = CorrectConcat.concat(s, " Express");
		System.out.println(s);
	}
}
