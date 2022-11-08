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
		Partido partido1 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),	new Pais("Ecuador",3,true,'A',4,new Equipo("ECU",5)),100);
		Partido partido2 = new Partido (001,new Pais("Senegal",1,false,'A',4,new Equipo("SNG",4)),	new Pais("P.Bajos",3,true,'A',4,new Equipo("PBS",5)),100);
		Partido partido3 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),	new Pais("Senegal",3,true,'A',4,new Equipo("SNG",5)),100);
		Partido partido4 = new Partido (001,new Pais("P.Bajos",1,false,'A',4,new Equipo("PBS",4)),	new Pais("Ecuador",3,true,'A',4,new Equipo("ECU",5)),100);
		Partido partido5 = new Partido (001,new Pais("Qatar",1,false,'A',4,new Equipo("QFA",4)),	new Pais("P.Bajos",3,true,'A',4,new Equipo("PBS",5)),100);
		Partido partido6 = new Partido (001,new Pais("Ecuador",1,false,'A',4,new Equipo("ECU",4)),	new Pais("Senegal",3,true,'A',4,new Equipo("SNG",5)),100);
		todos.add(partido1);
		todos.add(partido2);
		todos.add(partido3);
		todos.add(partido4);
		todos.add(partido5);
		todos.add(partido6);
		
		Partido partido7 = new Partido (001,new Pais("Inglaterra",1,false,'B',4,new Equipo("ING",4)),	new Pais("Iran",3,true,'B',4,new Equipo("IRN",5)),100);
		Partido partido8 = new Partido (001,new Pais("EstadosUnidos",1,false,'B',4,new Equipo("EEUU",4)),new Pais("Gales",3,true,'B',4,new Equipo("GLS",5)),100);
		Partido partido9 = new Partido (001,new Pais("Inglaterra",1,false,'B',4,new Equipo("ING",4)),	new Pais("EstadosUnidos",3,true,'B',4,new Equipo("EEUU",5)),100);
		Partido partido10 = new Partido (001,new Pais("Gales",1,false,'B',4,new Equipo("GLS",4)),		new Pais("Iran",3,true,'B',4,new Equipo("IRN",5)),100);
		Partido partido11 = new Partido (001,new Pais("Gales",1,false,'B',4,new Equipo("GLS",4)),		new Pais("Inglaterra",3,true,'B',4,new Equipo("ING",5)),100);
		Partido partido12 = new Partido (001,new Pais("Iran",1,false,'B',4,new Equipo("IRN",4)),		new Pais("EstadosUnidos",3,true,'B',4,new Equipo("EEUU",5)),100);
		todos.add(partido7);
		todos.add(partido8);
		todos.add(partido9);
		todos.add(partido10);
		todos.add(partido11);
		todos.add(partido12);
		
		Partido partido13 = new Partido (001,new Pais("Argentina",1,false,'C',4,new Equipo("ARG",4)),new Pais("Arabia.s",3,true,'C',4,new Equipo("ARS",5)),100);
		Partido partido14 = new Partido (001,new Pais("Mexico",1,false,'C',4,new Equipo("MEX",4)),	new Pais("Polonia",3,true,'C',4,new Equipo("PLN",5)),100);
		Partido partido15 = new Partido (001,new Pais("Argentina",1,false,'C',4,new Equipo("ARG",4)),new Pais("Mexico",3,true,'C',4,new Equipo("MEX",5)),100);
		Partido partido16 = new Partido (001,new Pais("Polonia",1,false,'C',4,new Equipo("PLN",4)),	new Pais("Arabia.s",3,true,'C',4,new Equipo("ARS",5)),100);
		Partido partido17 = new Partido (001,new Pais("Polonia",1,false,'C',4,new Equipo("PLN",4)),	new Pais("Argentina",3,true,'C',4,new Equipo("ARG",5)),100);
		Partido partido18 = new Partido (001,new Pais("Arabia.s",1,false,'C',4,new Equipo("ARS",4)),new Pais("Mexico",3,true,'C',4,new Equipo("MEX",5)),100);
		todos.add(partido13);
		todos.add(partido14);
		todos.add(partido15);
		todos.add(partido16);
		todos.add(partido17);
		todos.add(partido18);
		
		Partido partido19 = new Partido (001,new Pais("Francia",1,false,'D',4,new Equipo("FRN",4)),	new Pais("Australia",3,true,'D',4,new Equipo("AUS",5)),100);
		Partido partido20 = new Partido (001,new Pais("Dinamarca",1,false,'D',4,new Equipo("DNM",4)),new Pais("Tunez",3,true,'D',4,new Equipo("TNZ",5)),100);
		Partido partido21 = new Partido (001,new Pais("Francia",1,false,'D',4,new Equipo("FRN",4)),	new Pais("Dinamarca",3,true,'D',4,new Equipo("DNM",5)),100);
		Partido partido22 = new Partido (001,new Pais("Tunez",1,false,'D',4,new Equipo("TNZ",4)),	new Pais("Australia",3,true,'D',4,new Equipo("AUS",5)),100);
		Partido partido23 = new Partido (001,new Pais("Tunez",1,false,'D',4,new Equipo("TNZ",4)),	new Pais("Francia",3,true,'D',4,new Equipo("FRN",5)),100);
		Partido partido24 = new Partido (001,new Pais("Australia",1,false,'D',4,new Equipo("AUS",4)),new Pais("Dinamarca",3,true,'D',4,new Equipo("DNM",5)),100);
		todos.add(partido19);
		todos.add(partido20);
		todos.add(partido21);
		todos.add(partido22);
		todos.add(partido23);
		todos.add(partido24);
		
		Partido partido25 = new Partido (001,new Pais("España",1,false,'E',4,new Equipo("ESP",4)),	new Pais("CostaRica",3,true,'E',4,new Equipo("CTR",5)),100);
		Partido partido26 = new Partido (001,new Pais("Alemania",1,false,'E',4,new Equipo("ALM",4)),new Pais("Japon",3,true,'E',4,new Equipo("JPN",5)),100);
		Partido partido27 = new Partido (001,new Pais("España",1,false,'E',4,new Equipo("ESP",4)),	new Pais("Alemania",3,true,'D',4,new Equipo("ALM",5)),100);
		Partido partido28 = new Partido (001,new Pais("Japon",1,false,'E',4,new Equipo("JPN",4)),	new Pais("CostaRica",3,true,'D',4,new Equipo("CTR",5)),100);
		Partido partido29 = new Partido (001,new Pais("Japon",1,false,'E',4,new Equipo("JPN",4)),	new Pais("España",3,true,'D',4,new Equipo("ESP",5)),100);
		Partido partido30 = new Partido (001,new Pais("CostaRica",1,false,'E',4,new Equipo("CTR",4)),new Pais("Alemania",3,true,'D',4,new Equipo("ALM",5)),100);
		todos.add(partido25);
		todos.add(partido26);
		todos.add(partido27);
		todos.add(partido28);
		todos.add(partido29);
		todos.add(partido30);
		
		Partido partido31 = new Partido (001,new Pais("Belgica",1,false,'F',4,new Equipo("BLG",4)),	new Pais("Canada",3,true,'F',4,new Equipo("CND",5)),100);
		Partido partido32 = new Partido (001,new Pais("Marruecos",1,false,'F',4,new Equipo("MRC",4)),new Pais("Croacia",3,true,'F',4,new Equipo("CRC",5)),100);
		Partido partido33 = new Partido (001,new Pais("Belgica",1,false,'F',4,new Equipo("BLG",4)),	new Pais("Marruecos",3,true,'F',4,new Equipo("MRC",5)),100);
		Partido partido34 = new Partido (001,new Pais("Croacia",1,false,'F',4,new Equipo("CRC",4)),	new Pais("Canada",3,true,'F',4,new Equipo("CND",5)),100);
		Partido partido35 = new Partido (001,new Pais("Croacia",1,false,'F',4,new Equipo("CRC",4)),	new Pais("Belgica",3,true,'F',4,new Equipo("BLG",5)),100);
		Partido partido36 = new Partido (001,new Pais("Canada",1,false,'F',4,new Equipo("CND",4)),	new Pais("Marruecos",3,true,'F',4,new Equipo("MRC",5)),100);
		todos.add(partido31);
		todos.add(partido32);
		todos.add(partido33);
		todos.add(partido34);
		todos.add(partido35);
		todos.add(partido36);
		
		Partido partido37 = new Partido (001,new Pais("Brasil",1,false,'G',4,new Equipo("BRS",4)),	new Pais("Serbia",3,true,'G',4,new Equipo("SRB",5)),100);
		Partido partido38 = new Partido (001,new Pais("Suiza",1,false,'G',4,new Equipo("SZA",4)),	new Pais("Camerun",3,true,'G',4,new Equipo("CMR",5)),100);
		Partido partido39 = new Partido (001,new Pais("Brasil",1,false,'G',4,new Equipo("BRS",4)),	new Pais("Suiza",3,true,'G',4,new Equipo("SZA",5)),100);
		Partido partido40 = new Partido (001,new Pais("Camerun",1,false,'G',4,new Equipo("CMR",4)),	new Pais("Serbia",3,true,'G',4,new Equipo("SRB",5)),100);
		Partido partido41 = new Partido (001,new Pais("Camerun",1,false,'G',4,new Equipo("CMR",4)),	new Pais("Brasil",3,true,'G',4,new Equipo("BRS",5)),100);
		Partido partido42 = new Partido (001,new Pais("Serbia",1,false,'G',4,new Equipo("SRB",4)),	new Pais("Suiza",3,true,'G',4,new Equipo("SZA",5)),100);
		todos.add(partido37);
		todos.add(partido38);
		todos.add(partido39);
		todos.add(partido40);
		todos.add(partido41);
		todos.add(partido42);
		
		Partido partido43 = new Partido (001,new Pais("Portugal",1,false,'H',4,new Equipo("PRT",4)),new Pais("Ghana",3,true,'H',4,new Equipo("GHN",5)),100);
		Partido partido44 = new Partido (001,new Pais("Uruguay",1,false,'H',4,new Equipo("URG",4)),	new Pais("Corea.s",3,true,'H',4,new Equipo("CRS",5)),100);
		Partido partido45 = new Partido (001,new Pais("Portugal",1,false,'H',4,new Equipo("PRT",4)),new Pais("Uruguay",3,true,'H',4,new Equipo("URG",5)),100);
		Partido partido46 = new Partido (001,new Pais("Corea.s",1,false,'H',4,new Equipo("CRS",4)),	new Pais("Ghana",3,true,'H',4,new Equipo("GHN",5)),100);
		Partido partido47 = new Partido (001,new Pais("Corea.s",1,false,'H',4,new Equipo("CRS",4)),	new Pais("Portugal",3,true,'H',4,new Equipo("PRT",5)),100);
		Partido partido48 = new Partido (001,new Pais("Ghana",1,false,'H',4,new Equipo("GHN",4)),	new Pais("Uruguay",3,true,'H',4,new Equipo("URG",5)),100);
		todos.add(partido43);
		todos.add(partido44);
		todos.add(partido45);
		todos.add(partido46);
		todos.add(partido47);
		todos.add(partido48);
		
		return todos;
	}

}
