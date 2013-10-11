package point;

/**
 * Clase Point representa un punto en el plano, caracterizado por sus coordenadas
 * x e y. 
 */
public class Point {

	private float x; // coordenada x del punto
	private float y; // coordenada y del punto
	
	/**
	 * Constructor por defecto. Genera un punto en la interseccion entre los ejes
	 * de x e y.
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * Constructor de la clase, que toma como parametros los valores para la 
	 * inicializacion.
	 * @param x es el valor a utilizar para setear la primera coordenada del punto
	 * @param y es el valor a utilizar para setear la segunda coordenda del punto.
	 */
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Retorna el valor de la primera coordenada del punto
	 * @return el valor de la primera coordenada del punto.
	 */
	public float getX() {
		return x;
	}

	/**
	 * Retorna el valor de la segunda coordenada del punto
	 * @return el valor de la segunda coordenada del punto.
	 */	
	public float getY() {
		return y;
	}

	/**
	 * Cambia el valor de la primera coordenada del punto
	 * @param x es el valor con el cual setear la primera coordenada del punto
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Cambia el valor de la segunda coordenada del punto
	 * @param x es el valor con el cual setear la segunda coordenada del punto
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Intercambia los valores de la primera y segunda coordenadas del punto.
	 */
	public void swap() {
		x = x+y;
		y = x-y;
		x = x-y;
	}
	
	/**
	 * Redefine metodo heredado de Object. Retorna true ssi el objeto corriente es igual
	 * al pasado como parametro.
	 * @param other es el objeto con el cual se compara el objeto corriente.
	 * @return true ssi el objeto corriente es igual a other.
	 */
	public boolean equals(Object other) {
		// TODO: implementar este metodo, recurriendo al implementado en la superclase
		// cuando other no sea de tipo Point.
		return false;
	}
}
