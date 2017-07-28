package fr.formation.exo2.objets;

public interface Payrole {
	
	/**
	 * M�thode permettant de calculer le salaire de l'employ�. Cette m�thode est
	 * abstraite car elle n'est pas impl�ment�e dans cette classe, mais sera 
	 * impl�ment�e par les classes enfant (qui utilisent "extends Employee")
	 * 
	 * @return int le montant du salaire mensuel de l'employ�
	 */

	public int calculateSalary();
	
	/**
	 * @return String permet de r�cup�rer le nom complet de la personne associ�e � la paye
	 */
	
	public String getName();
}

