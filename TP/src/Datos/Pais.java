package Datos;

public class Pais {
	private String nombre;
	private int goles;
	private boolean clasificado;
	private char grupo;
	private int resultado;//cantidad de goles
	private Equipo representante;
	
	public Pais(String nombre, int goles, boolean clasificado, char grupo, int resultado, Equipo representante) {
		super();
		this.nombre = nombre;
		this.goles = goles;
		this.clasificado = clasificado;
		this.grupo = grupo;
		this.resultado = resultado;
		this.representante = representante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public boolean isClasificado() {
		return clasificado;
	}

	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public Equipo getRepresentante() {
		return representante;
	}

	public void setRepresentante(Equipo representante) {
		this.representante = representante;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", goles=" + goles + ", clasificado=" + clasificado + ", grupo=" + grupo
				+ ", resultado=" + resultado + ", representante=" + representante + "]";
	}
	
}
