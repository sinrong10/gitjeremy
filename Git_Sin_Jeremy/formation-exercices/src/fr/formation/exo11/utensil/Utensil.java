package fr.formation.exo11.utensil;

/**
 * Classe abstraite repr�sentant un ustensile. Il n'est pas possible de faire
 * une instance d'un ustensile car la classe est abstraite. Pour pouvoir faire
 * un nouvel ustensile il faut utiliser une sous classe concr�te.
 *
 * @author hb-asus
 *
 */
public abstract class Utensil {

	/**
	 * Propri�t� repr�sentant l'ann�e de la cr�ation de l'ustensile.
	 */
	public int year;

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'ann�e de cr�ation de l'ustensile.
	 */
	public Utensil(int year) {
		this.year = year;
	}

	/**
	 * M�thode permettant de calculer la valeur de l'ustensile selon l'ann�e
	 * courante.
	 *
	 * @param currentYear
	 *            l'ann�e pour laquelle calculer la valeur de l'ustensile.
	 * @return int la valeur de l'ustensile.
	 */
	public int calculateValue(int currentYear) {
		return currentYear - this.year - 50;
	}
	
	/**
	 * Permet de remplir la cote correspondant au type d'ustensile.
	 * 
	 * @param obj la valeur � m�moriser dans la propri�t� de l'instance.
	 */
	public abstract void setScore(final Object obj);
}
