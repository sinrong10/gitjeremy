package fr.formation.exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principale permettant d'impl�menter une solution � l'exercice 1.
 * 
 * @author hb-asus
 *
 */
public class Exo1 implements Runnable {

	/**
	 * Objet Java permettant de lire diff�rent types de donn�es dans un objet
	 * InputStream (flux d'entr�e).
	 */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Point d'entr�e de l'application. Construit une nouvelle instance de la
	 * class Exo1 et appelle sa m�thode start().
	 * 
	 * @param args
	 *            les arguments pass�s en param�tre de l'ex�cution par le
	 *            syst�me.
	 */
	public static void main(String args[]) {
		(new Exo1()).run();
	}

	/**
	 * M�thode permettant de lire un entier sur le flux standard et d'identifier
	 * si il est positif, n�gatif, pair ou impair.
	 */
	public void run() {
		boolean quit = false;
		while (!quit) {
			log("Entrez un nombre entier :");
			// L'appel � la m�thode nextInt() du Scanner permet de r�cup�rer
			// directement un entier sous forme de type primitif. Dans le cas ou la
			// saisie n'est pas un entier, une exception Java est lev�e et stoppe le
			// programme.
			int number = 0;
			try {
				number = scanner.nextInt();				
			} catch (InputMismatchException e) {
				if (scanner.next().equals("exit")) {
					quit = true;
				} else {
					System.err.println("La valeur saisie est invalide, veuillez recommencer.");
				}
				continue;
			}
			// Utilisation de l'instruction if (si), permettant d'ex�cuter le code
			// se trouvant � l'int�rieur des accolades seulement si la condition
			// entre les parenth�se est vraie.
			if (number == 0) { // Utilisation de l'op�rateur == (�quivaut �) permettant de faire une comparaison entre deux valeurs.
				log("Le nombre choisi est 0 et est pair");
				// Utilisation de l'instruction else if (sinon si). La condition ne
				// sera �valu�e que si, et seulement si, la condition de
				// l'instruction if qui pr�c�de est fausse.
			} else if (number > 0) { // Utilisation de l'op�rateur > (sup�rieur �) permettant de comparer l'ordre de deux valeurs.
				log("Le nombre choisi est positif et ".concat(number % 2 == 0 ? "pair" : "impair"));
				// Utilisation de l'instruction else (sinon). La condition ne sera
				// �valu�e que si, et seulement si, les deux conditions des
				// instructions if et else if sont fausses.
			} else {
				// Appel � la fonction concat(), disponible m�me avec une chaine de
				// caract�res d�clar�e entre guillemets, car elle est implicitement
				// transform� en objet String.
				// Utilisation de l'op�rateur % (modulo) et de l'op�rateur ternaire
				// (condition ? valeur_cas_vrai : valeur_cas_faux).
				log("Le nombre choisi est n�gatif et ".concat(number % 2 == 0 ? "pair" : "impair"));
			}
		}
		log("Fermeture du programme.");
	}

	/**
	 * M�thode permettant d'encapsuler l'appel de l'affichage sur la sortie
	 * standard. Elle permet d'�viter d'�crire System.out.println() � plusieurs
	 * endroits et donc de changer facilement le flux de sortie de l'affichage.
	 * 
	 * @param message
	 *            le message � afficher.
	 */
	private void log(String message) {
		System.out.println(message);
	}
}
