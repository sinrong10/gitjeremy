package fr.formation.exo9;

import java.util.Scanner;

/**
 * Classe principale.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Calcul du r�sultat du polyn�me du troisi�me degr� avec les valeurs a, b,
	 * c, x donn�es. Tous les arguments sont pass�s en double, car sans cela la
	 * valeur de "(a + b) / 2" sera tronqu�e. En effet, en Java, si l'on divise
	 * des entiers, leur valeur est tronqu�e pour que le r�sultat soit entier
	 * aussi. Dans le but d'obtenir un r�sultat avec un valeur � virgule, il
	 * faut donc que les �l�ments du calcul soient d�j� des variables � virgules
	 * avant de calculer. N'h�sitez pas � me redemander si ce n'est pas clair.
	 *
	 * @param a
	 *            la valeur de a.
	 * @param b
	 *            la valeur de b.
	 * @param c
	 *            la valeur de c.
	 * @param x
	 *            la valeur de x.
	 * @return Double le r�sultat du polyn�me pour les valeurs donn�es.
	 */
	private static Double calculate(double a, double b, double c, double x) {
		return (a + b) / 2 * Math.pow(x, 3) + Math.pow(a + b, 2) * Math.pow(x, 2) + a + b + c;
	}

	/**
	 * Point d'entr�e.
	 */
	public static void main(String args[]) {
		// Initialisation du scanner avec le flux d'entr�e standard.
		final Scanner scanner = new Scanner(System.in);
		// Saisie des valeurs x et y.
		System.out.print("Entrez a (int) : ");
		Integer a = scanner.nextInt();
		System.out.print("Entrez b (int) : ");
		Integer b = scanner.nextInt();
		System.out.print("Entrez c (int) : ");
		Integer c = scanner.nextInt();
		System.out.print("Entrez x (double) : ");
		Double x = scanner.nextDouble();
		// Appel � la m�thode de calcul. Il y a une conversion implicite des
		// variables a, b, c de int vers double.
		System.out.print(
				"La valeur du polyn�me est : ".concat(Main.calculate(a, b, c, x).toString()));
		// Fermeture du flux ouvert par le scanner.
		scanner.close();
	}
}
