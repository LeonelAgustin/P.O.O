package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Datos.Equipo;
import Datos.Pais;
import Datos.Partido;

public class Main {

	public static void main(String[] args) {
		/*
		LinkedList<Pais> grupoD = tablaA();
		LinkedList<Pais> grupoB = tablaB();
		
		String a = JOptionPane.showInputDialog("ingrese el nombre del pais que busca");
		if (tablaA().contains(a)) {
			JOptionPane.showMessageDialog(null, "se encontro "+a+" en el grupo A");
		} else if (grupoB.contains(a)) {
			JOptionPane.showMessageDialog(null, "se encontro "+a+" en el grupo B");
		}
		*/
		int c = Integer.parseInt(JOptionPane.showInputDialog("ingresar o cambiar un partido"));
		
		Partido partido1 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),new Pais("Inglaterra",3,true,'B',4,new Equipo("england",5)),100);
		LinkedList<Partido> grupoA = new LinkedList<Partido>();
		grupoA.add(partido1);
		
		String b = JOptionPane.showInputDialog("ingrese el nombre del pais para cambiar el partido");
		for (Partido partido : grupoA) {
			if(partido.getEquipo1().getNombre().equals(b)) {
				grupoA.add(partido);
			}
		}
		
		LinkedList<Partido> Lista10min = new LinkedList<Partido>();

	}
	//devuelve LISTA de tipo PAIS		
	public static LinkedList<Pais> tablaA(){
		LinkedList<Pais> grupoA = new LinkedList<Pais>();
		grupoA.add(new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)));
		return grupoA;
	}
	
	public static LinkedList<Pais> tablaB(){
		LinkedList<Pais> grupoB = new LinkedList<Pais>();
		grupoB.add(new Pais("Inglaterra",3,true,'B',4,new Equipo("england",5)));
		return null;
	}

	public static LinkedList<Pais> General(){
		LinkedList<Pais> grupoB = new LinkedList<Pais>();
		grupoB.add(new Pais("Inglaterra",3,true,'B',4,new Equipo("england",5)));
		return grupoB;
	}

}
