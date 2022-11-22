package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Encargado {
	private int id_encargado;
	private String nombre;
	
	public Encargado(int id_encargado, String nombre) {
		super();
		this.id_encargado = id_encargado;
		this.nombre = nombre;
	}
	public int getId_encargado() {
		return id_encargado;
	}
	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Encargado [id_encargado=" + id_encargado + ", nombre=" + nombre + "]";
	}
	
	
	
	/*
	public static void elegirOctavos () {
		LinkedList<Partido> todos = General();
		for (Partido partido : todos) {//goles aleatorios para cada partido
				partido.getEquipo1().setGoles((int)(Math.random()*5+1));
				partido.getEquipo2().setGoles((int)(Math.random()*5+1));				
		}
		
	
		
		//Pais auxiliar = new Pais("aux",0,false,'Z',new Equipo("OOO",0));
		
		for (Partido partido : todos) {
			// nombre, goles, clasifico, grupo, equipo
			
			if (partido.getEquipo1().getGoles() == 0) {
				
			} else if(partido.getEquipo1().getGoles() == 0){

			}else if (partido.getEquipo1().getGoles() >= partido.getEquipo2().getGoles()) {
				// se uma un punto al ganar
				partido.getEquipo1().setPuntos(partido.getEquipo1().getPuntos()+1);				
				partido.getEquipo1().setPosicion(1);
				partido.getEquipo2().setPosicion(2);
			}else {
				 // no suma puntos porque perdio				
				partido.getEquipo1().setPosicion(2);
				partido.getEquipo2().setPosicion(1);
			}
		}
		
		
		
	}
	
	
	/*
	public static LinkedList<Partido> octavos(){
		LinkedList<Pais> octavosUno = new LinkedList<Pais>();
		return octavos();
	}
	
	
	public static LinkedList<Partido> cuartos(){
		LinkedList<Pais> cuartosUno = new LinkedList<Pais>();
		return cuartos();
	}*/
	
	
	
	
	//posicion de cada partido +1 de la lista General
	/*public void verpartidos() {
		LinkedList<Partido> todos = General();		
		
		for (Partido partido : todos) {
			
			JOptionPane.showMessageDialog(null, partido.getEquipo1().getGrupo()+"\n"+partido.getEquipo1().getNombre()+" VS "+ partido.getEquipo2().getNombre());
		}
		
	}*/

	
	
	
}
