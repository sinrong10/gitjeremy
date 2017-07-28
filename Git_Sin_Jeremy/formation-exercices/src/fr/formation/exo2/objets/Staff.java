package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe permettant de g�rer une collection d'employ�s.
 *
 * @author hb-asus
 *
 */
public class Staff {

	/**
	 * D�claration d'une propri�t� de type Collection avec le type d'�l�ments
	 * Employee. Nous utilisons ici notre classe abstraite afin de pouvoir g�rer
	 * tous les employ�s de la m�me mani�re sans faire de diff�rence sur
	 * l'impl�mentation utilis�e.
	 */

	/**
	 * Staff encapsule une liste de Payrole
	 * 
	 */
	public Collection<Payrole> employees;

	/**
	 * Constructeur par d�faut.
	 */
	public Staff() {
		this.employees = new ArrayList<>();
	}

	/**
	 * M�thode permettant d'ajouter un employ� � la collection.
	 *
	 * @param employee
	 */
	public void addEmployee(Payrole employee) {
		this.employees.add(employee);
	}

	/**
	 * M�thode permettant d'afficher le nom et le salaire de chaque employ�.
	 *
	 * @return String l'affichage de la liste des employ�s.
	 */
	public String displaySalaries() {
		// Utilisation de la classe Java StringBuffer. Cette classe permet de
		// construire de longues, voir tr�s longues cha�nes de caract�res. La
		// classe poss�de une m�thode append() pour chaque type primitif, il
		// n'est donc pas n�cessaire d'utiliser Integer.valueOf() pour
		// transformer le salaire (qui est un int) en String.
		// Il existe aussi une classe quasiment identique StringBuilder. La
		// seule diff�rence entre ces deux classes est que StringBuilder utilise
		// des m�thodes synchronis�s. Nous verrons plus tard la signification de
		// la synchronicit� dans le code Java.
		StringBuffer buffer = new StringBuffer();
		// Utilisation de append avec un objet String.
		buffer.append("Liste des salaires des employ�s :\n");
		for (Payrole employee : this.employees) {
			// Utilisation de append avec un type primitif char.
			buffer.append('\t');
			buffer.append(employee.getName());
			buffer.append(" a un salaire de ");
			// Utilisation de append avec un type primitif int.
			buffer.append(employee.calculateSalary());
			buffer.append('\n');
		}
		// Ici, la m�thode toString() permet de demander � notre buffer de
		// prendre tous les �l�ments pass�s par les appels aux m�thodes append()
		// et de cr�er, instancier un String une seule fois (et non � chaque
		// fois qu'il y a une concat�nation).
		return buffer.toString();
	}

	/**
	 * M�thode permettant de calculer le salaire moyen des employ�s de la soci�t�.
	 *
	 * @return int le salaire moyen.
	 */
	public int getAverageSalary() {
		int total = 0;
		for (Payrole employee : this.employees) {
			// Utilisation de l'op�rateur += qui �quivaux � variable = variable
			// + salaire. Cet op�rateur permet simplement de ne pas avoir �
			// r�p�ter le nom de la variable.
			total += employee.calculateSalary();
		}
		return total / this.employees.size();
	}
}
