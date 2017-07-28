package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� dans le domaine de la manutention.
 *
 * @author hb-asus
 *
 */
public class Warehouseman extends Employee {
	// Propri�t� sp�cifique � un employ� manutentionnaire.
	int workHours;

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
	public Warehouseman(String name, String firstName, int age, Date hireDate, int workHours) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.workHours = workHours;
	}

	/**
	 * {@inheritDoc} Calcul � partir du nombre d'heure et du co�t d'une heure de
	 * travail.
	 */
	@Override
	public int calculateSalary() {
		return this.workHours * Constants.EMPLOYE_WAREHOUSE_HOURCOST;
	}

}
