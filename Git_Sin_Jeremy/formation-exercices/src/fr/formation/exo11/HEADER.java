package fr.formation.exo11;

/**
 * Enum�ration des ent�tes du fichier de donn�es CSV comportant la r�f�rence des
 * ustensiles.
 * 
 * @author Arcanis
 *
 */
public enum HEADER {
	TYPE("Type"), YEAR("Annee"), SCORE("Cote");

	private String title;
	
	private HEADER(final String title) {
		this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
}
