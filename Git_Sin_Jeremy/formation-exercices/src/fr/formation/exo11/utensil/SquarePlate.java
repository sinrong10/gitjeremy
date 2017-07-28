package fr.formation.exo11.utensil;

/**
 * Classe repr�sentant une assiette carr�. Cette classe impl�mente Plate car
 * elle poss�de une m�thode permettant de calculer sa surface. Celle classe est
 * aussi une sous classe de Utensil car une assiette est un ustensile.
 *
 * @author hb-asus
 *
 */
public class SquarePlate extends Utensil implements Plate {
	public double score;
	
	public SquarePlate() {
		super(0);
		this.score = 0;
	}

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'ann�e de cr�ation de l'assiette utilis�e dans la classe
	 *            Utensil.
	 * @param score
	 *            la cote de l'assiette (taille d'un c�t�).
	 */
	public SquarePlate(int year, double score) {
		// Appel du constructeur de la classe Utensil.
		super(year);
		this.score = score;
	}

	/**
	 * {@inheritDoc} Calcul de la surface � l'aide de la cote (taille d'un c�t�
	 * de l'assiette).
	 */
	@Override
	public double calculateArea() {
		return Math.pow(this.score, 2);
	}

	/**
	 * {@inheritDoc} La valeur d'une assiette carr� est 5 fois la valeur d'un
	 * ustensile commun.
	 */
	@Override
	public int calculateValue(int currentYear) {
		return super.calculateValue(currentYear) * 5;
	}

	@Override
	public void setScore(Object obj) {
		this.score = (double) obj;
	}

}
