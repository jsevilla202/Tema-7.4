package ejercicio2;

/**
 * Clase del Gestor
 * @author Jaime Sevilla
 *
 */
public class Gestisimal {
	/**
	 * Codigo del producto
	 */
	private int codigo;
	/**
	 * Descripcion del producto
	 */
	private String descripcion;
	/**
	 * Precio de compra
	 */
	private double precioc;
	/**
	 * Precio de venta
	 */
	private double preciov;
	/**
	 * Total de stock
	 */
	private int stock;
	
	/**
	 * Constructor por defecto
	 */
	public Gestisimal() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros
	 * @param codigo Codigo dado por el usuario
	 * @param descripcion Descripcion dada por el usuario
	 * @param precioc Precio de compra dado por el usuario
	 * @param preciov Precio de venta dado por el usuario
	 * @param stock Cantidad de unidades dada por el usuario
	 */
	public Gestisimal(int codigo, String descripcion, double precioc, double preciov, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioc = precioc;
		this.preciov = preciov;
		this.stock = stock;
	}
	
	/**
	 * Getter de codigo
	 * @return Devuelve el valor de codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Setter d ecodigo
	 * @param codigo Codigo dado por el usuario
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Getter de descripcion
	 * @return Devuelve la descripcion del producto
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Setter de la descripcion del producto
	 * @param descripcion Descripcion dada por el usuario
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Getter del precio de compra
	 * @return Devuelve el precio de compra
	 */
	public double getPrecioc() {
		return precioc;
	}
	/**
	 * Setter del precio de compra
	 * @param precioc Precio de compra
	 */
	public void setPrecioc(double precioc) {
		this.precioc = precioc;
	}
	/**
	 * Getter de precio de venta
	 * @return Devuelve el precio de venta
	 */
	public double getPreciov() {
		return preciov;
	}
	/**
	 * Setter de precio de venta
	 * @param preciov Precio de venta dado por el usuario
	 */
	public void setPreciov(double preciov) {
		this.preciov = preciov;
	}
	/**
	 * Getter de stock
	 * @return Devuelve el stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * Setter de stock
	 * @param stock Stock dado por el usuario
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Gestisimal [codigo=" + codigo + ", descripcion=" + descripcion + ", precioc=" + precioc + ", preciov="
				+ preciov + ", stock=" + stock + "]";
	}
	
	
}
