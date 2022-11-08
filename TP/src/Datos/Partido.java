package Datos;

import java.util.Set;

import javax.swing.JOptionPane;

public class Partido {
	private Pais equipo1;
	private Pais equipo2;
	private int duracion;
	
	public Partido(int id, Pais equipo1, Pais equipo2, int duracion) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.duracion = duracion;
	}

	

	public Pais getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Pais equipo1) {
		this.equipo1 = equipo1;
	}

	public Pais getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Pais equipo2) {
		this.equipo2 = equipo2;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Partido [ equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", duracion=" + duracion + "]";
	}
	
	public static void cambiarDatos() {
		// NO HACE FALTA CAMBIAR LOS DATOS DEL PARTIDO PORQUE LO INGRESE MANUALMENTE
	}
	
}
