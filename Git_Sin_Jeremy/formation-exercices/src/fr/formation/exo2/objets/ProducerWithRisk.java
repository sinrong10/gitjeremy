package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� dans le domaine de la production et manipulant des produits � risque.
 *
 * @author hb-asus
 *
 */
public class ProducerWithRisk extends Producer {

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
	public ProducerWithRisk(String name, String firstName, int age, Date hireDate,
			int unitProduced) {
		// Appel au constructeur de la classe parent Producer.
		super(name, firstName, age, hireDate, unitProduced);
	}

	/**
	 * {@inheritDoc} Ajout de la prime de risque.
	 */
	@Override
	public int calculateSalary() {
		return super.calculateSalary() + Constants.EMPLOYE_RISK_PRIME;
	}
}
