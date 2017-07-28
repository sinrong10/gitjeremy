package fr.formation.exo6;

import java.util.Scanner;

/**
 * Classe principale de l'exercice 6.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Objet Scanner permettant de r�cup�rer des donn�es saisies sur le flux
	 * d'entr�e standard (dans notre cas l'entr�e standard est la console).
	 */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * M�thode permettant de v�rifier les donn�es saisies pour la largeur et la
	 * hauteur. Les valeurs doivent �tre positives et diff�rentes de 0.
	 *
	 * @param width
	 *            la largeur saisie.
	 * @param height
	 *            la hauteur saisie.
	 * @return boolean vrai si les donn�es sont valide, faux sinon.
	 * @throws WrongInputException
	 *             si la largeur ou la hauteur saisie n'est pas correcte.
	 */
	private static boolean checkInputs(double width, double height) throws WrongInputException {
		// D�claration et initialisation d'une variable de retour.
		boolean inputsValid = false;
		// On v�rifie si la largeur et la hauteur sont tous les deux strictement
		// sup�rieur � 0.
		if (width > 0 && height > 0) {
			// Si c'est bien le cas alors on passe notre bool�en de retour �
			// vrai.
			inputsValid = true;
		} else if (width <= 0) {
			// Cas ou la largeur n'est pas correcte.
			throw new WrongInputException("La largeur saisie n'est pas valide.");
		} else {
			// Cas ou la hauteur n'est pas correcte.
			throw new WrongInputException("La hauteur saisie n'est pas valide.");
		}
		return inputsValid;
	}

	/**
	 * M�thode permettant de demander � l'utilisateur si l'application doit
	 * calculer le p�rim�tre ou la surface du rectangle.
	 *
	 * @return boolean vrai si il faut calculer le p�rim�tre, faux si il faut
	 *         calculer la surface.
	 * @throws WrongInputException
	 *             si l'utilisateur n'a pas effectu� une saisie correcte pour
	 *             choisir le type de calcul � faire.
	 */
	private static boolean isPerimeterCalculation() throws WrongInputException {
		boolean isPerimeter = true;
		Main.log("Surface ('s/S') ou p�rim�tre ('p/P') ? ");
		String input = Main.scanner.next();
		// Utilisation de la m�thode matches() de la classe String. Cette
		// m�thode permet de v�rifier si le chaine de caract�res correspond �
		// une expression r�guli�re donn�e.
		if (input.matches("[sS]")) {
			// Si l'utilisateur a saisi 's' ou 'S', alors ce n'est pas le
			// p�rim�tre mais la surface qu'il veut calculer.
			isPerimeter = false;
		} else if (!input.matches("[pP]")) {
			// Si on est dans ce cas, l'utilisateur n'a saisi ni 's' ou 'S', ni
			// 'p' ou 'P'. Il y a donc une erreur car l'application attend
			// forc�ment l'un ou l'autre. Comme il y a une erreur, on l�ve une
			// exception correspondant � cette erreur.
			throw new WrongInputException("Le choix saisi n'est pas correcte.");
		}
		return isPerimeter;
	}

	/**
	 * M�thode d'affichage permettant de ne pas r�p�ter System.out.println()
	 * partout dans l'application. Si � l'avenir, on veut changer l'endroit o�
	 * est fait l'affichage, il n'y aura que le contenu de cette m�thode �
	 *
	 * @param message
	 *            le message � afficher.
	 */
	public static void log(String message) {
		System.out.print(message);
	}

	/**
	 * M�thode d'affichage similaire � log() permettant d'afficher des erreurs
	 * en rouge sur la sortie d'erreur standard.
	 *
	 * @deprecated Cette m�thode ne doit plus �tre utilis�e. A la place il faut
	 *             lever une nouvelle exception.
	 * @param message
	 *            le message d'erreur � afficher.
	 */
	// Annotation permettant de signifier � la personne qui veut utiliser cette
	// m�thode que son utilisation est d�conseill�e. La plupart du temps cette
	// annotation sert � pr�venir que la m�thode sera supprim�e dans une future
	// version. Vous remarquerez qu'Eclipse barre le nom des m�thodes
	// d�pr�ci�es.
	@Deprecated
	public static void logError(String message) {
		System.err.println("Erreur : ".concat(message));
	}

	/**
	 * Point d'entr�e de l'application.
	 *
	 * @throws WrongInputException
	 */
	public static void main(String args[]) throws WrongInputException {
		// Lecture et r�cup�ration de la largeur.
		double width = Main.readInput("largeur");
		// Lecture et r�cup�ration de la longueur.
		double height = Main.readInput("hauteur");

		// V�rification des donn�es saisies. Si une donn�es n'est pas correcte,
		// une exception sera lev�e. Comme il n'y a pas de bloc try/catch, cela
		// signifie que l'on sortira imm�diatement de notre m�thode main(), et
		// donc de notre application (car main() est le point d'entr�e).
		Main.checkInputs(width, height);
		// Instance d'un nouveau rectangle.
		Rectangle rectangle = new Rectangle(width, height);
		// R�cup�ration de l'information sur le type de calcul � faire
		// (p�rim�tre ou sinon surface).
		if (Main.isPerimeterCalculation()) {
			// Affichage du p�rim�tre.
			Main.log("Le p�rim�tre est de "
					.concat(rectangle.calculatePerimeter().toString().concat("m\n")));
		} else {
			// Sinon affichage de la surface.
			Main.log("La surface est de "
					.concat(rectangle.calculateSurface().toString().concat("m�\n")));
		}
	}

	/**
	 * Lecture de la saisie d'un nombre r�el.
	 *
	 * @param input
	 *            le libell� � utiliser.
	 * @return Double le nombre r�el saisi.
	 */
	private static Double readInput(String input) {
		Double result = null;
		Main.log("Entrez la ".concat(input).concat(": "));
		// R�cup�ration d'un double convertit implicitement en Double (wrapper).
		// Cette conversion sp�cifique entre un type primitif et son wrapper
		// correspondant est appel� boxing/unboxing en Java.
		result = Main.scanner.nextDouble();
		return result;
	}
}
