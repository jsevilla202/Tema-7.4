package ejercicio1;

public class Alumno {
	/**
	 * Nombre del alumno
	 */
	private String nombre;
	/**
	 * Nota MEdia del alumno
	 */
	private double notaMedia;
	/**
	 * Constructor por defecto
	 */
	public Alumno() {
		super();
	}
	/**
	 * Constructor con todos los parametros
	 * @param nombre Nombre del alumno dado por el usuario
	 * @param notaMedia Nota media del alumno dada por el usuario
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	/**
	 * Getter de Nombre
	 * @return Devuelve el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter de Nombre
	 * @param nombre Valor del nombre dado por el usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Getter de Nota Media
	 * @return Devuelve el valor de la nota media
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	/**
	 * Setter de Nota Media
	 * @param notaMedia Valor de la nota media dada por el usuario
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
	
	
}
