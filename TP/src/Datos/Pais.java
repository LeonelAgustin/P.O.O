package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Pais {
	private String nombre;
	private int goles =(int)(Math.random()*4+1);
	private boolean clasificado;
	private char grupo;
	//private int resultado;//cantidad de goles
	private Equipo representante;
	private int puntos = (int)(Math.random()*4+1);// suma 1 si gana si pierde no suma
	private int posicion;//primero o segundos

	public Pais(String nombre, boolean clasificado, char grupo, Equipo representante, int puntos,
			int posicion) {
		super();
		this.nombre = nombre;
		
		this.clasificado = clasificado;
		this.grupo = grupo;
		this.representante = representante;
		this.puntos = (int)(Math.random()*4+1);
		this.posicion = posicion;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
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
	
	public static LinkedList<Pais> paises(){
		LinkedList<Pais> todosPaises = new LinkedList<Pais>();
		// los goles y puntos no se estan modificando 
		Pais qatar = 	new Pais("Qatar",false,'A',new Equipo("QFA",4),0,0);
		Pais ecuador = 	new Pais("Ecuador",true,'A',new Equipo("ECU",5),0,0);
		Pais senegal = 	new Pais("Senegal",false,'A',new Equipo("SNG",4),0,0);
		Pais paisesBajos = new Pais("P.Bajos",false,'A',new Equipo("PBS",4),0,0);
		
		Pais inglaterra = new Pais("Inglaterra",false,'B',new Equipo("ING",4),0,0);
		
		Pais iran = 	new Pais("Iran",true,'B',new Equipo("IRN",5),0,0);
		Pais estadosUnidos = new Pais("EstadosUnidos",false,'B',new Equipo("EEUU",4),0,0);
		Pais gales = 	new Pais("Gales",false,'B',new Equipo("GLS",4),0,0);
		Pais argentina = new Pais("Argentina",false,'C',new Equipo("ARG",4),0,0);
		Pais arabiaSaudita = new Pais("Arabia.s",true,'C',new Equipo("ARS",5),0,0);
		Pais mexico = 	new Pais("Mexico",false,'C',new Equipo("MEX",4),0,0);
		Pais polonia = 	new Pais("Polonia",false,'C',new Equipo("PLN",4),0,0);
		Pais francia = 	new Pais("Francia",false,'D',new Equipo("FRN",4),0,0);
		Pais australia = new Pais("Australia",false,'D',new Equipo("AUS",4),0,0);
		Pais dinamarca = new Pais("Dinamarca",false,'D',new Equipo("DNM",4),0,0);
		Pais tunez = 	new Pais("Tunez",false,'D',new Equipo("TNZ",4),0,0);
		Pais espana = 	new Pais("Espania",false,'E',new Equipo("ESP",4),0,0);
		Pais costaRica = new Pais("CostaRica",false,'E',new Equipo("CTR",4),0,0);
		Pais alemania = new Pais("Alemania",false,'E',new Equipo("ALM",4),0,0);
		Pais japon = 	new Pais("Japon",false,'E',new Equipo("JPN",4),0,0);
		
		Pais belgica = 	new Pais("Belgica",false,'F',new Equipo("BLG",4),0,0);
		
		Pais canada = 	new Pais("Canada",false,'F',new Equipo("CND",4),0,0);
		Pais marruecos = new Pais("Marruecos",false,'F',new Equipo("MRC",4),0,0);
		Pais croacia = 	new Pais("Croacia",false,'F',new Equipo("CRC",4),0,0);
		Pais brasil = 	new Pais("Brasil",false,'G',new Equipo("BRS",4),0,0);
		Pais serbia = 	new Pais("Serbia",false,'G',new Equipo("SRB",4),0,0);
		Pais suiza = 	new Pais("Suiza",false,'G',new Equipo("SZA",4),0,0);
		Pais camerun = 	new Pais("Camerun",false,'G',new Equipo("CMR",4),0,0);
		Pais portugal = new Pais("Portugal",false,'H',new Equipo("PRT",4),0,0);
		Pais ghana = 	new Pais("Ghana",false,'H',new Equipo("GHN",4),0,0);
		Pais uruguay = 	new Pais("Uruguay",false,'H',new Equipo("URG",4),0,0);
		Pais coreaSur = new Pais("Corea.s",false,'H',new Equipo("CRS",4),0,0);
		
		return todosPaises;
	}
	
/*
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
			
			break;
		}
		
	}*/
	
}
