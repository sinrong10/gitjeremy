package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� dans le domaine de la production.
 *
 * @author hb-asus
 *
 */
public class Producer extends Employee {
	// Propri�t� sp�cifique � un employ� dans la production.
	int unitProduced;

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
	 * @param unitProduced
	 *            le nombre d'unit�s produites par l'employ� pour le mois
	 *            courant.
	 */
	public Producer(String name, String firstName, int age, Date hireDate, int unitProduced) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.unitProduced = unitProduced;
	}

	/**
	 * {@inheritDoc} Calcul du salaire � partir du nombre d'unit�s produites et
	 * du coup d'une unit�.
	 */
	@Override
	public int calculateSalary() {
		return this.unitProduced * Constants.EMPLOYE_PRODUCER_UNITCOST;
	}

}
