package ejercicio3;

/**
 * Clase de Pizzas
 * 
 * @author Jaime Sevilla
 *
 */
public class Pizza {
	/**
	 * Enumerados para el tamano
	 * 
	 * @author Jaime Sevilla
	 *
	 */
	enum Tamano {
		/**
		 * Tamano Mediana
		 */
		MEDIANA, 
		/**
		 * Tamano Grande
		 */
		GRANDE
	};

	/**
	 * Enumerados para el tipo
	 * 
	 * @author Jaime Sevilla
	 *
	 */
	enum Tipo {
		/**
		 * Tipo Margarita
		 */
		MARGARITA, 
		/**
		 * Tipo Cuatro Quesos
		 */
		CUATROQUESOS, 
		/**
		 * Tipo Fungui
		 */
		FUNGUI
	};

	/**
	 * Enumerados para el estado
	 * 
	 * @author Jaime Sevilla
	 *
	 */
	enum Estado {
		/**
		 * Estado de la pizza pedida
		 */
		PEDIDA, 
		/**
		 * Estado de la pizza servida
		 */
		SERVIDA
	};

	/**
	 * Codigo de la pizza
	 */
	private int codigo;
	/**
	 * Tamano de la pizza
	 */
	private Tamano tamano;
	/**
	 * Tipo de la pizza
	 */
	private Tipo tipo;
	/**
	 * Estado de la pizza
	 */
	private Estado estado;

	/**
	 * Constructor por defecto
	 */
	public Pizza() {
		super();
		estado = Estado.valueOf("PEDIDA");
	}

	/**
	 * Constructor con casi todos los parametros
	 * 
	 * @param codigo Codigo de la pizza dado por el usuario
	 * @param tamano Tamano de la pizza dado por el usuario
	 * @param tipo   Tipo de la pizza dado por el usuario
	 */
	public Pizza(int codigo, Tamano tamano, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamano = tamano;
		this.tipo = tipo;
	}

	/**
	 * Getter de codigo
	 * 
	 * @return Devuelve el codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter de codigo
	 * 
	 * @param codigo Codigo de la pizza dado por el usuario
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter de Tamano
	 * 
	 * @return Devuelve el tamano de la pizza
	 */
	public Tamano getTamano() {
		return tamano;
	}

	/**
	 * Setter de Tamano
	 * 
	 * @param tamano Tamano de la pizza dado por el usuario
	 */
	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}

	/**
	 * Getter de tipo
	 * 
	 * @return Devuelve el tipo de pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Setter de Tipo
	 * 
	 * @param tipo Tipo de la pizza dado por el usuario
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * Getter de Estado
	 * 
	 * @return Devuelve el estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Setter de Estado
	 * 
	 * @param estado Estado de la pizza dado por el usuario
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	/**
	 * To String de la clase
	 */
	public String toString() {
		return "Pizza [codigo=" + codigo + ", tamano=" + tamano + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
}
