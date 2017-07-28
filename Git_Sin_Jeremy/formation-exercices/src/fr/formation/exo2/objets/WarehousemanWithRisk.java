package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employ� dans le domaine de la manutention et manipulant des produits �
 * risque.
 *
 * @author hb-asus
 *
 */
public class WarehousemanWithRisk extends Warehouseman {
	/** public class Warehousemanwithrisk extends warehouseman implement employeewithrisk
	 * 
	 */

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
	 * @param workHours
	 *            le nombre d'heures travaill�es dans le mois.
	 */
	public WarehousemanWithRisk(String name, String firstName, int age, Date hireDate,
			int workHours) {
		// Appel au constructeur de la classe parent Warehouseman.
		super(name, firstName, age, hireDate, workHours);
	}

	/**
	 * {@inheritDoc} Ajout de la prime de risque.
	 */
	@Override
	public int calculateSalary() {
		return super.calculateSalary() + Constants.EMPLOYE_RISK_PRIME;
	}

}
