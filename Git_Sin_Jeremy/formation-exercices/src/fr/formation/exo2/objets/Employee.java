package fr.formation.exo2.objets;

import java.util.Date;

/**
 * Classe abstraite permettant de pr�-d�finir les caract�ristiques d'un employ�
 * et les actions possibles. Cette classe �tant abstraite, il est strictement
 * impossible de faire une nouvelle instance de cette classe ("new
 * Employee(...)" ne compilera pas).
 *
 * @author hb-asus
 *
 */
public abstract class Employee implements Payrole {
	// Propri�t�s communes � tous les employ�s.
	public int age;
	public String firstName;
	public Date hireDate;
	public String name;

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
	 */
	public Employee(String name, String firstName, int age, Date hireDate) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.hireDate = hireDate;
	}

	/**
	 * M�thode permettant de calculer le salaire de l'employ�. Cette m�thode est
	 * abstraite car elle n'est pas impl�ment�e dans cette classe, mais sera
	 * impl�ment�e par les classes enfant (qui utilisent "extends Employee").
	 *
	 * @return int le montant du salaire mensuel de l'employ�.
	 */
	public abstract int calculateSalary();

	/**
	 * M�thode permettant de r�cup�rer une chaine de caract�re repr�santant le
	 * nom de l'employ� utilis� uniquement pour l'affichage.
	 *
	 * @return String l'affichage � utiliser pour cet employ�.
	 */
	public String getName() {
		return "L'employ� ".concat(this.name).concat(" ").concat(this.firstName);
	}
}
