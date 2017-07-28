package fr.formation.exo6;

/**
 * Exception permettant de g�rer les cas d'erreurs dans lesquels l'utilisateur
 * n'a pas effectu� une bonne saisie.
 *
 * @author hb-asus
 *
 */
public class WrongInputException extends Exception {

	/**
	 * Serial UUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur avec message.
	 *
	 * @param message
	 *            le message d'erreur li� au contexte dans lequel cette
	 *            exception est lev�e (la cause de l'exception).
	 */
	public WrongInputException(String message) {
		super(message);
	}

	/**
	 * Constructeur avec message, � partir d'une exception d�j� lev�e ailleurs
	 * dans l'application.
	 *
	 * @param message
	 * @param t
	 */
	// La classe Throwable regroupe tous les types d'exceptions et d'errors en
	// Java. Elle correspond aussi � tout objet avec lequel on peut utiliser les
	// instructions throw et throws.
	public WrongInputException(String message, Throwable t) {
		super(message, t);
	}
}
