package fr.formation.exo6;

/**
 * Classe repr�sentant une forme math�matique de rectangle capable de calculer
 * son p�rim�tre et sa surface en fonction de sa largeur et de sa hauteur.
 *
 * @author hb-asus
 *
 */
public class Rectangle {

	private double height;
	private double width;

	Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	/**
	 * Calcul du p�rim�tre d'un rectangle.
	 *
	 * @return Double la valeur du p�rim�tre calcul�e.
	 */
	Double calculatePerimeter() {
		return 2 * (this.width + this.height);
	}

	/**
	 * Calcul de la surface d'un rectangle.
	 *
	 * @return Double la valeur de la surface calcul�e.
	 */
	Double calculateSurface() {
		return this.width * this.height;
	}

}
