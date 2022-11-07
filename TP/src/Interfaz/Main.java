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
		
		/*(int res = Integer.parseInt(JOptionPane.showInputDialog("1-ingresar un partdio\n2-Cambiar un partido"));*/
		
		LinkedList<Partido> todos = General();
		
		int res = Integer.parseInt(JOptionPane.showInputDialog("1-Ver la tabla de un grupo\n2-Ver un partido"));
		
		switch (res) {
		case 1:
			String grupo = JOptionPane.showInputDialog("ingrese la letra del grupo para buscar partidos de ese grupo");
			
			for (Partido partido : todos) {
				if (partido.getEquipo1().getGrupo()==grupo.charAt(0)) {
					JOptionPane.showMessageDialog(null, partido.getEquipo1().getNombre()+" VS "+partido.getEquipo2().getNombre());
				}else {
					
				}
			}
			break;

		case 2:
			String pais = JOptionPane.showInputDialog("ingrese el nombre del pais para buscar partidos relacionados");
			for (Partido partido : todos) {
				if(partido.getEquipo1().getNombre().equalsIgnoreCase(pais) || partido.getEquipo2().getNombre().equalsIgnoreCase(pais)) {
					int a = Integer.parseInt(JOptionPane.showInputDialog("partidos encontrados:\n"+partido.getEquipo1().getNombre()+" VS "+partido.getEquipo2().getNombre()+"\ndesea cambiar los datos?\n1-SI\n2-NO")); 
					
				}else {
					String b = JOptionPane.showInputDialog("No se encontro partidos relacionados con "+pais+", desea agregar este Pais a la base de datos?");
					if (b.equalsIgnoreCase("si")) {
						todos.add(partido);
					} else {

					}
				}
			}
			break;
		}
		
	}
	/*
	//devuelve LISTA de tipo PAIS		
	public static LinkedList<Pais> tablaA(){// lista de partidos grupo A
		
		LinkedList<Pais> grupoA = new LinkedList<Pais>();
		grupoA.add(new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)));
		return grupoA;
	}
	
	public static LinkedList<Pais> tablaB(){
		LinkedList<Pais> grupoB = new LinkedList<Pais>();
		grupoB.add(new Pais("Inglaterra",3,true,'B',4,new Equipo("england",5)));
		return null;
	}*/

	public static LinkedList<Partido> General(){
		
		LinkedList<Partido> todos = new LinkedList<Partido>();
		Partido partido1 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),new Pais("Ecuador",3,true,'A',4,new Equipo("ECU",5)),100);
		Partido partido2 = new Partido (001,new Pais("Senegal",1,false,'A',4,new Equipo("SNG",4)),new Pais("P.Bajos",3,true,'A',4,new Equipo("PBS",5)),100);
		Partido partido3 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),new Pais("Senegal",3,true,'A',4,new Equipo("SNG",5)),100);
		Partido partido4 = new Partido (001,new Pais("P.Bajos",1,false,'A',4,new Equipo("PBS",4)),new Pais("Ecuador",3,true,'A',4,new Equipo("ECU",5)),100);
		Partido partido5 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),new Pais("P.Bajos",3,true,'A',4,new Equipo("PBS",5)),100);
		Partido partido6 = new Partido (001,new Pais("Ecuador",1,false,'A',4,new Equipo("ECU",4)),new Pais("Senegal",3,true,'A',4,new Equipo("SNG",5)),100);
		todos.add(partido1);
		todos.add(partido2);
		todos.add(partido3);
		todos.add(partido4);
		todos.add(partido5);
		todos.add(partido6);
		
		Partido partido7 = new Partido (001,new Pais("Inglaterra",1,false,'B',4,new Equipo("ING",4)),new Pais("Iran",3,true,'B',4,new Equipo("IRN",5)),100);
		Partido partido8 = new Partido (001,new Pais("EstadosUnidos",1,false,'B',4,new Equipo("EEUU",4)),new Pais("Gales",3,true,'B',4,new Equipo("GLS",5)),100);
		Partido partido9 = new Partido (001,new Pais("Inglaterra",1,false,'B',4,new Equipo("ING",4)),new Pais("EstadosUnidos",3,true,'B',4,new Equipo("EEUU",5)),100);
		Partido partido10 = new Partido (001,new Pais("Gales",1,false,'B',4,new Equipo("GLS",4)),new Pais("Iran",3,true,'B',4,new Equipo("IRN",5)),100);
		Partido partido11 = new Partido (001,new Pais("Gales",1,false,'B',4,new Equipo("GLS",4)),new Pais("Inglaterra",3,true,'B',4,new Equipo("ING",5)),100);
		Partido partido12 = new Partido (001,new Pais("Iran",1,false,'B',4,new Equipo("IRN",4)),new Pais("EstadosUnidos",3,true,'B',4,new Equipo("EEUU",5)),100);
		todos.add(partido7);
		todos.add(partido8);
		todos.add(partido9);
		todos.add(partido10);
		todos.add(partido11);
		todos.add(partido12);
		
		Partido partido13 = new Partido (001,new Pais("Argentina",1,false,'C',4,new Equipo("ARG",4)),new Pais("Arabia.s",3,true,'C',4,new Equipo("ARS",5)),100);
		Partido partido14 = new Partido (001,new Pais("Mexico",1,false,'C',4,new Equipo("MEX",4)),new Pais("Polonia",3,true,'C',4,new Equipo("PLN",5)),100);
		Partido partido15 = new Partido (001,new Pais("Argentina",1,false,'C',4,new Equipo("ARG",4)),new Pais("Mexico",3,true,'C',4,new Equipo("MEX",5)),100);
		Partido partido16 = new Partido (001,new Pais("Polonia",1,false,'C',4,new Equipo("PLN",4)),new Pais("Arabia.s",3,true,'C',4,new Equipo("ARS",5)),100);
		Partido partido17 = new Partido (001,new Pais("Polonia",1,false,'C',4,new Equipo("PLN",4)),new Pais("Argentina",3,true,'C',4,new Equipo("ARG",5)),100);
		Partido partido18 = new Partido (001,new Pais("Arabia.s",1,false,'C',4,new Equipo("ARS",4)),new Pais("Mexico",3,true,'C',4,new Equipo("MEX",5)),100);
		todos.add(partido13);
		todos.add(partido14);
		todos.add(partido15);
		todos.add(partido16);
		todos.add(partido17);
		todos.add(partido18);
		
		return todos;
	}

}
