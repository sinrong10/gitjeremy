package fr.formation.exo2;

/**
 * Classe regroupant les diff�rentes constantes de l'application. Cela permet
 * d'�viter d'avoir des valeurs en dur partout dans l'application, ainsi que de
 * les changer qu'a un seul endroit.
 *
 * @author hb-asus
 *
 */
public class Constants {

	/**
	 * Salaire par unit� pour un employ� dans la production.
	 */
	public static final int EMPLOYE_PRODUCER_UNITCOST = 5;

	/**
	 * Prime mensuelle pour un repr�sentant.
	 */
	public static final int EMPLOYE_REPRESENTANT_PRIME = 800;

	/**
	 * Prime bonus pour les employ�s manipulant des produits � risque.
	 */
	public static final int EMPLOYE_RISK_PRIME = 200;

	/**
	 * Prime mensuelle pour un vendeur.
	 */
	public static final int EMPLOYE_SALES_PRIME = 400;

	/**
	 * Pourcentage du chiffre d'affaire permettant de calculer le salaire d'un
	 * vendeur.
	 */
	public static final int EMPLOYE_SALES_TURNOVER_PART = 20;

	/**
	 * Salaire horaire pour les employ�s de la manutention.
	 */
	public static final int EMPLOYE_WAREHOUSE_HOURCOST = 65;
	
	/**
	 * Frais de d�placement pour les ind�pendants.
	 */
	
	public static final String TRAVEL_FEES = "Frais de d�placement";
	

}
