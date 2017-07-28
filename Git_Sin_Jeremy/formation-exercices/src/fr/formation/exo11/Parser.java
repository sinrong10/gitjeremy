package fr.formation.exo11;

import java.util.List;

import fr.formation.exo11.utensil.Utensil;

/**
 * D�finition d'un parseur d'ustensiles.
 * 
 * @author Arcanis
 *
 */
public interface Parser extends Runnable {

	/**
	 * R�cup�ration des ustensiles pars�s.
	 * 
	 * @return List<Utensil>
	 */
	public List<Utensil> getResults();
}
