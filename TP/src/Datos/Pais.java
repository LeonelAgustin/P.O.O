package Datos;

import javax.swing.JOptionPane;

public class Pais {
	private String nombre;
	private int goles;
	private boolean clasificado;
	private char grupo;
	//private int resultado;//cantidad de goles
	private Equipo representante;
	
	public Pais(String nombre, int goles, boolean clasificado, char grupo, Equipo representante) {
		super();
		this.nombre = nombre;
		this.goles = goles;
		this.clasificado = clasificado;
		this.grupo = grupo;
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



	public Equipo getRepresentante() {
		return representante;
	}



	public void setRepresentante(Equipo representante) {
		this.representante = representante;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", goles=" + goles + ", clasificado=" + clasificado + ", grupo=" + grupo
				+ ", representante=" + representante + "]";
	}

	public void cambiarDatos() {
		int b = Integer.parseInt(JOptionPane.showInputDialog("que dato del pais desea cambiar\n1-nombre\n2-goles\n3-clasificado\n4-grupo\n5-resultado\n6-representante"));
		
		switch (b) {
		case 1:
			break;
		case 2:
			int a = Integer.parseInt(JOptionPane.showInputDialog("ingrese goles hechos en el partido"));
			setGoles(a);
			JOptionPane.showMessageDialog(null, "Datos cambiados");
			toString();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			representante.cambiarDatos();
			break;
		}
		
		
		
		
	}
	
}
