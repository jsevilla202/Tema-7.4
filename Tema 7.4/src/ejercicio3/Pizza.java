package ejercicio3;

public class Pizza {
	enum Tamaño{MEDIANA, GRANDE};
	enum Tipo{MARGARITA, CUATROQUESOS, FUNGUI};
	enum Estado{PEDIDA, SERVIDA};
	private int codigo;
	private Tamaño tamaño;
	private Tipo tipo;
	private Estado estado;
	
	public Pizza() {
		super();
		estado = Estado.valueOf("PEDIDA");
	}

	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pizza [codigo=" + codigo + ", tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
}
