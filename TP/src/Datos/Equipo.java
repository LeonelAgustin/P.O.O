package Datos;

public class Equipo {
	private String nombreE;
	private int goles;
	
	public Equipo(String nombre, int goles) {
		super();
		this.nombreE = nombre;
		this.goles = goles;
	}
	public String getNombre() {
		return nombreE;
	}
	public void setNombre(String nombre) {
		this.nombreE = nombre;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombreE + ", goles=" + goles + "]";
	}
	
	public void cambiarDatos() {
		
	}
	
}
