package fr.formation.exo11.utensil;

/**
 * Classe repr�sentant une cuilli�re qui a une longueur et qui est un ustensile.
 *
 * @author hb-asus
 *
 */
public class Spoon extends Utensil {
	public double length;
	
	public Spoon() {
		super(0);
		this.length = 0;
	}

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'ann�e de cr�ation de l'assiette utilis�e dans la classe
	 *            Utensil.
	 * @param length
	 *            la longueur de la cuilli�re.
	 */
	public Spoon(int year, double length) {
		super(year);
		this.length = length;
	}

	@Override
	public void setScore(Object obj) {
		this.length = (double) obj;
	}

}
