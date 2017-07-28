package fr.formation.exo2;

import java.util.Date;

import fr.formation.exo2.objets.Freelance;
import fr.formation.exo2.objets.Producer;
import fr.formation.exo2.objets.ProducerWithRisk;
import fr.formation.exo2.objets.Representant;
import fr.formation.exo2.objets.Salesman;
import fr.formation.exo2.objets.Staff;
import fr.formation.exo2.objets.Warehouseman;
import fr.formation.exo2.objets.WarehousemanWithRisk;

/**
 * Classe principale.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Point d'entrée de l'application.
	 *
	 * @param args
	 *            les arguments système.
	 */
	public static void main(String[] args) {
		if (args.length == 1) {
			final String companyName = args[0];
			System.out.println("Informations sur la société\"" + companyName + ":");
		} else {
			/*mon tableau il est vide (cas d'erreur)*/
			System.out.println("Usage : exo2 <nom_societe>");
			//return;/* marche avec méthode qui envoie void, du coup je sors de ma methode
			System.exit(1);
			/**0 = tout se passe bien 
			 * chiffre positif : erreur gérable dans le programme
			 * break = seulement utilisé pour les boucles while, for...
			 */
		}
		
		// Création d'un objet Date. Le constructeur par défaut (sans argument)
		// utilise la date du jour.
		Date hireDate = new Date();
		// Création d'un objet Staff qui gère une liste d'employés.
		Staff staff = new Staff();
		// Ajout des employés.
		staff.addEmployee(new Salesman("Pierre", "Business", 45, hireDate, 30000));
		staff.addEmployee(new Representant("Léon", "Vendtout", 25, hireDate, 20000));
		staff.addEmployee(new Producer("Yves", "Bosseur", 28, hireDate, 1000));
		staff.addEmployee(new Warehouseman("Jeanne", "Stocketout", 32, hireDate, 45));
		staff.addEmployee(new ProducerWithRisk("Jean", "Flippe", 28, hireDate, 1000));
		staff.addEmployee(new WarehousemanWithRisk("Al", "Abordage", 30, hireDate, 45));
		staff.addEmployee(new WarehousemanWithRisk("Jean", "Aimar", 35, hireDate, 60));
		final Freelance freelance = new Freelance();
		freelance.setName("Jeremy Masson");
		freelance.setSiren("2354125");
		staff.addEmployee(freelance);
		System.out.println(staff.displaySalaries());
		System.out.println("Le salaire moyen dans l'entreprise est de " + staff.getAverageSalary()
				+ " euros.");
	}

}
