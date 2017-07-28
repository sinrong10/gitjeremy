package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� � la fois vendeur et repr�sentant de la soci�t�.
 *
 * @author hb-asus
 *
 */
public class Representant extends Salesman {

	/**
	 * Constructeur.
	 *
	 * @param name
	 *            le nom de l'employ�.
	 * @param firstName
	 *            le pr�nom de l'employ�.
	 * @param age
	 *            l'age de l'employ�.
	 * @param hireDate
	 *            la date � laquelle l'employ� a �t� embauch�.
	 * @param turnover
	 *            le chiffre d'affaires permettant de calculer le salaire.
	 */
	public Representant(String name, String firstName, int age, Date hireDate, int turnover) {
		// Appel au constructeur de la classe parent Salesman.
		super(name, firstName, age, hireDate, turnover);
	}

	/**
	 * {@inheritDoc} Calcul � partir du chiffre d'affaires et ajout d'une prime
	 * mensuelle fixe.
	 */
	@Override
	public int calculateSalary() {
		return this.calculateTurnoverPart() + Constants.EMPLOYE_REPRESENTANT_PRIME;
	}

}
