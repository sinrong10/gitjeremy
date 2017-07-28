package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� vendeur.
 *
 * @author hb-asus
 *
 */
public class Salesman extends Employee {
	// Propri�t� sp�cifique au vendeur.
	int turnover;

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
	public Salesman(String name, String firstName, int age, Date hireDate, int turnover) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.turnover = turnover;
	}

	/**
	 * {@inheritDoc} Calcul � partir du chiffre d'affaires et ajout d'une prime
	 * mensuelle fixe.
	 */
	@Override
	public int calculateSalary() {
		return this.calculateTurnoverPart() + Constants.EMPLOYE_SALES_PRIME;
	}

	/**
	 * Calcul du montant provenant du pourcentage du chiffre d'affaires.
	 *
	 * @return int le montant calcul�.
	 */
	protected int calculateTurnoverPart() {
		return this.turnover * Constants.EMPLOYE_SALES_TURNOVER_PART / 100;
	}

}
