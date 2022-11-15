package Datos;

import java.awt.Container;
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
	
	public static void buscarTabla() {//buscar una tabla
		LinkedList<Partido> todos = General();
		String tabla = "";
		String grupo = JOptionPane.showInputDialog("ingrese la letra del grupo para buscar partidos de ese grupo");
		
		for (Partido partido : todos) {
			if (partido.getEquipo1().getGrupo()==grupo.charAt(0)) {//si grupo convertido en char es igual a Grupo
				tabla += partido.getEquipo1().getNombre()+" VS "+partido.getEquipo2().getNombre()+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, "grupo "+grupo+"\n"+tabla);
	}
	
	public static void elegirOctavos () {
		LinkedList<Partido> todos = General();
		for (Partido partido : todos) {//goles aleatorios para cada partido
				partido.getEquipo1().setGoles((int)(Math.random()*5+1));
				partido.getEquipo2().setGoles((int)(Math.random()*5+1));				
		}
		String tablaUno = "";
		String tablaDos = "";
		LinkedList<Pais> primeros = new LinkedList<Pais>();
		LinkedList<Pais> segundos = new LinkedList<Pais>();
		String ganadorA = "";
		String ganadorB = "";
		String ganadorC = "";
		String ganadorD = "";
		String ganadorE = "";
		String ganadorF = "";
		String ganadorG = "";
		String ganadorH = "";
		
		//Pais auxiliar = new Pais("aux",0,false,'Z',new Equipo("OOO",0));
		
		for (Partido partido : todos) {
			
			
			if (partido.getEquipo1().getGoles() == 0) {
				
			} else if(partido.getEquipo1().getGoles() == 0){

			}else if (partido.getEquipo1().getGoles() >= partido.getEquipo2().getGoles()) {
				partido.getEquipo1().setPuntos(partido.getEquipo1().getPuntos()-1);
				
				partido.getEquipo1().setPosicion(1);
				partido.getEquipo2().setPosicion(2);
			}else {
				partido.getEquipo2().setPuntos(partido.getEquipo2().getPuntos()-1);
				
				ganadorA = partido.getEquipo2().getNombre();
				partido.getEquipo1().setPosicion(2);
				partido.getEquipo2().setPosicion(1);
			}
		}
		
		for (Partido partido2 : todos) {
			
			switch (partido2.getEquipo1().getGrupo()) {
			case 'A':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					 
					partido2.getEquipo1().setPosicion(1);
					partido2.getEquipo2().setPosicion(2);
				}else {
					ganadorA = partido2.getEquipo2().getNombre();
					partido2.getEquipo1().setPosicion(2);
					partido2.getEquipo2().setPosicion(1);
				}
				
				break;
				
			case 'B':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorB = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorB = partido2.getEquipo2().getNombre();
				}
				break;
				
			case 'C':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorC = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorC = partido2.getEquipo2().getNombre();
				}
				break;
				
			case 'D':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorD = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorD = partido2.getEquipo2().getNombre();
				}
				break;
			case 'E':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorE = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorE = partido2.getEquipo2().getNombre();
				}
				break;
				
			case 'F':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorF = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorF = partido2.getEquipo2().getNombre();
				}
				break;
			case 'G':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorG = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorG = partido2.getEquipo2().getNombre();
				}
				break;
				
			case 'H':
				if (partido2.getEquipo1().getGoles() >= partido2.getEquipo2().getGoles()) {
					ganadorH = partido2.getEquipo1().getNombre(); 
				}else {
					ganadorH = partido2.getEquipo2().getNombre();
				}
				break;
				
			}			
			
		}
		
	}
	
	public static void primeroYsegundo (Partido partido) {
		
	}
	
	public static LinkedList<Partido> octavos(){
		LinkedList<Pais> octavosUno = new LinkedList<Pais>();
		return octavos();
	}
	
	
	public static LinkedList<Partido> cuartos(){
		LinkedList<Pais> cuartosUno = new LinkedList<Pais>();
		return cuartos();
	}
	
	
	
	public static void buscarPartidos() {
		boolean encontrado = false; 
		LinkedList<Partido> todos = General();
		// recorre toda la lista de partidos aunque encuentre los partidos que le indico
		String pais = JOptionPane.showInputDialog("ingrese el nombre del pais para buscar partidos relacionados");
		String partidos = "";
			for (Partido partido : todos) {
				if(partido.getEquipo1().getNombre().equalsIgnoreCase(pais) || partido.getEquipo2().getNombre().equalsIgnoreCase(pais)) {
					encontrado = true;
					partidos = partidos+"\n"+partido.getEquipo1().getNombre()+" VS "+partido.getEquipo2().getNombre();
				}
			}// terminar de recorrer todos los partidos
			
			if(encontrado==false) {
				int b = Integer.parseInt(JOptionPane.showInputDialog("No se encontro partidos relacionados con "+pais+", desea agregar este Pais a la base de datos?\n1-SI\n2-NO"));
				if (b==1) {
					JOptionPane.showMessageDialog(null, "agregar partido");
				}
			}else if(encontrado){
				JOptionPane.showMessageDialog(null,partidos);
			} 
	}
	//posicion de cada partido +1 de la lista General
	public void verpartidos() {
		LinkedList<Partido> todos = General();		
		
		for (Partido partido : todos) {
			
			JOptionPane.showMessageDialog(null, partido.getEquipo1().getGrupo()+"\n"+partido.getEquipo1().getNombre()+" VS "+ partido.getEquipo2().getNombre());
		}
		
	}
	
	
	
	public static LinkedList<Partido> General(){
		
		LinkedList<Partido> todos = new LinkedList<Partido>();
		Partido partido1 = new Partido (1,new Pais("Qatar",1,false,'A',new Equipo("QFA",4)),	new Pais("Ecuador",3,true,'A',new Equipo("ECU",5)),100);
		Partido partido2 = new Partido (1,new Pais("Senegal",1,false,'A',new Equipo("SNG",4)),new Pais("P.Bajos",3,true,'A',new Equipo("PBS",5)),100);
		Partido partido3 = new Partido (1,new Pais("Qatar",1,false,'A',new Equipo("QFA",4)),	new Pais("Senegal",3,true,'A',new Equipo("SNG",5)),100);
		Partido partido4 = new Partido (1,new Pais("P.Bajos",1,false,'A',new Equipo("PBS",4)),new Pais("Ecuador",3,true,'A',new Equipo("ECU",5)),100);
		Partido partido5 = new Partido (1,new Pais("P.Bajos",3,true,'A',new Equipo("PBS",5)),	new Pais("Qatar",1,false,'A',new Equipo("QFA",4)),100);
		Partido partido6 = new Partido (1,new Pais("Ecuador",1,false,'A',new Equipo("ECU",4)),new Pais("Senegal",3,true,'A',new Equipo("SNG",5)),100);
		todos.add(partido1);
		todos.add(partido2);
		todos.add(partido3);
		todos.add(partido4);
		todos.add(partido5);
		todos.add(partido6);
		
		Partido partido7 = new Partido (2,new Pais("Inglaterra",1,false,'B',new Equipo("ING",4)),	new Pais("Iran",3,true,'B',new Equipo("IRN",5)),100);
		Partido partido8 = new Partido (2,new Pais("EstadosUnidos",1,false,'B',new Equipo("EEUU",4)),new Pais("Gales",3,true,'B',new Equipo("GLS",5)),100);
		Partido partido9 = new Partido (2,new Pais("Inglaterra",1,false,'B',new Equipo("ING",4)),	new Pais("EstadosUnidos",3,true,'B',new Equipo("EEUU",5)),100);
		Partido partido10 = new Partido (2,new Pais("Gales",1,false,'B',new Equipo("GLS",4)),		new Pais("Iran",3,true,'B',new Equipo("IRN",5)),100);
		Partido partido11 = new Partido (2,new Pais("Gales",1,false,'B',new Equipo("GLS",4)),		new Pais("Inglaterra",3,true,'B',new Equipo("ING",5)),100);
		Partido partido12 = new Partido (2,new Pais("Iran",1,false,'B',new Equipo("IRN",4)),		new Pais("EstadosUnidos",3,true,'B',new Equipo("EEUU",5)),100);
		todos.add(partido7);
		todos.add(partido8);
		todos.add(partido9);
		todos.add(partido10);
		todos.add(partido11);
		todos.add(partido12);
		
		Partido partido13 = new Partido (3,new Pais("Argentina",1,false,'C',new Equipo("ARG",4)),new Pais("Arabia.s",3,true,'C',new Equipo("ARS",5)),100);
		Partido partido14 = new Partido (3,new Pais("Mexico",1,false,'C',new Equipo("MEX",4)),	new Pais("Polonia",3,true,'C',new Equipo("PLN",5)),100);
		Partido partido15 = new Partido (3,new Pais("Argentina",1,false,'C',new Equipo("ARG",4)),new Pais("Mexico",3,true,'C',new Equipo("MEX",5)),100);
		Partido partido16 = new Partido (3,new Pais("Polonia",1,false,'C',new Equipo("PLN",4)),	new Pais("Arabia.s",3,true,'C',new Equipo("ARS",5)),100);
		Partido partido17 = new Partido (3,new Pais("Polonia",1,false,'C',new Equipo("PLN",4)),	new Pais("Argentina",3,true,'C',new Equipo("ARG",5)),100);
		Partido partido18 = new Partido (3,new Pais("Arabia.s",1,false,'C',new Equipo("ARS",4)),new Pais("Mexico",3,true,'C',new Equipo("MEX",5)),100);
		todos.add(partido13);
		todos.add(partido14);
		todos.add(partido15);
		todos.add(partido16);
		todos.add(partido17);
		todos.add(partido18);
		
		Partido partido19 = new Partido (4,new Pais("Francia",1,false,'D',new Equipo("FRN",4)),	new Pais("Australia",3,true,'D',new Equipo("AUS",5)),100);
		Partido partido20 = new Partido (4,new Pais("Dinamarca",1,false,'D',new Equipo("DNM",4)),new Pais("Tunez",3,true,'D',new Equipo("TNZ",5)),100);
		Partido partido21 = new Partido (4,new Pais("Francia",1,false,'D',new Equipo("FRN",4)),	new Pais("Dinamarca",3,true,'D',new Equipo("DNM",5)),100);
		Partido partido22 = new Partido (4,new Pais("Tunez",1,false,'D',new Equipo("TNZ",4)),	new Pais("Australia",3,true,'D',new Equipo("AUS",5)),100);
		Partido partido23 = new Partido (4,new Pais("Tunez",1,false,'D',new Equipo("TNZ",4)),	new Pais("Francia",3,true,'D',new Equipo("FRN",5)),100);
		Partido partido24 = new Partido (4,new Pais("Australia",1,false,'D',new Equipo("AUS",4)),new Pais("Dinamarca",3,true,'D',new Equipo("DNM",5)),100);
		todos.add(partido19);
		todos.add(partido20);
		todos.add(partido21);
		todos.add(partido22);
		todos.add(partido23);
		todos.add(partido24);
		
		Partido partido25 = new Partido (5,new Pais("España",1,false,'E',new Equipo("ESP",4)),	new Pais("CostaRica",3,true,'E',new Equipo("CTR",5)),100);
		Partido partido26 = new Partido (5,new Pais("Alemania",1,false,'E',new Equipo("ALM",4)),new Pais("Japon",3,true,'E',new Equipo("JPN",5)),100);
		Partido partido27 = new Partido (5,new Pais("España",1,false,'E',new Equipo("ESP",4)),	new Pais("Alemania",3,true,'D',new Equipo("ALM",5)),100);
		Partido partido28 = new Partido (5,new Pais("Japon",1,false,'E',new Equipo("JPN",4)),	new Pais("CostaRica",3,true,'D',new Equipo("CTR",5)),100);
		Partido partido29 = new Partido (5,new Pais("Japon",1,false,'E',new Equipo("JPN",4)),	new Pais("España",3,true,'D',new Equipo("ESP",5)),100);
		Partido partido30 = new Partido (5,new Pais("CostaRica",1,false,'E',new Equipo("CTR",4)),new Pais("Alemania",3,true,'D',new Equipo("ALM",5)),100);
		todos.add(partido25);
		todos.add(partido26);
		todos.add(partido27);
		todos.add(partido28);
		todos.add(partido29);
		todos.add(partido30);
		
		Partido partido31 = new Partido (6,new Pais("Belgica",1,false,'F',new Equipo("BLG",4)),	new Pais("Canada",3,true,'F',new Equipo("CND",5)),100);
		Partido partido32 = new Partido (6,new Pais("Marruecos",1,false,'F',new Equipo("MRC",4)),new Pais("Croacia",3,true,'F',new Equipo("CRC",5)),100);
		Partido partido33 = new Partido (6,new Pais("Belgica",1,false,'F',new Equipo("BLG",4)),	new Pais("Marruecos",3,true,'F',new Equipo("MRC",5)),100);
		Partido partido34 = new Partido (6,new Pais("Croacia",1,false,'F',new Equipo("CRC",4)),	new Pais("Canada",3,true,'F',new Equipo("CND",5)),100);
		Partido partido35 = new Partido (6,new Pais("Croacia",1,false,'F',new Equipo("CRC",4)),	new Pais("Belgica",3,true,'F',new Equipo("BLG",5)),100);
		Partido partido36 = new Partido (6,new Pais("Canada",1,false,'F',new Equipo("CND",4)),	new Pais("Marruecos",3,true,'F',new Equipo("MRC",5)),100);
		todos.add(partido31);
		todos.add(partido32);
		todos.add(partido33);
		todos.add(partido34);
		todos.add(partido35);
		todos.add(partido36);
		
		Partido partido37 = new Partido (7,new Pais("Brasil",1,false,'G',new Equipo("BRS",4)),	new Pais("Serbia",3,true,'G',new Equipo("SRB",5)),100);
		Partido partido38 = new Partido (7,new Pais("Suiza",1,false,'G',new Equipo("SZA",4)),	new Pais("Camerun",3,true,'G',new Equipo("CMR",5)),100);
		Partido partido39 = new Partido (7,new Pais("Brasil",1,false,'G',new Equipo("BRS",4)),	new Pais("Suiza",3,true,'G',new Equipo("SZA",5)),100);
		Partido partido40 = new Partido (7,new Pais("Camerun",1,false,'G',new Equipo("CMR",4)),	new Pais("Serbia",3,true,'G',new Equipo("SRB",5)),100);
		Partido partido41 = new Partido (7,new Pais("Camerun",1,false,'G',new Equipo("CMR",4)),	new Pais("Brasil",3,true,'G',new Equipo("BRS",5)),100);
		Partido partido42 = new Partido (7,new Pais("Serbia",1,false,'G',new Equipo("SRB",4)),	new Pais("Suiza",3,true,'G',new Equipo("SZA",5)),100);
		todos.add(partido37);
		todos.add(partido38);
		todos.add(partido39);
		todos.add(partido40);
		todos.add(partido41);
		todos.add(partido42);
		
		Partido partido43 = new Partido (8,new Pais("Portugal",1,false,'H',new Equipo("PRT",4)),new Pais("Ghana",3,true,'H',new Equipo("GHN",5)),100);
		Partido partido44 = new Partido (8,new Pais("Uruguay",1,false,'H',new Equipo("URG",4)),	new Pais("Corea.s",3,true,'H',new Equipo("CRS",5)),100);
		Partido partido45 = new Partido (8,new Pais("Portugal",1,false,'H',new Equipo("PRT",4)),new Pais("Uruguay",3,true,'H',new Equipo("URG",5)),100);
		Partido partido46 = new Partido (8,new Pais("Corea.s",1,false,'H',new Equipo("CRS",4)),	new Pais("Ghana",3,true,'H',new Equipo("GHN",5)),100);
		Partido partido47 = new Partido (8,new Pais("Corea.s",1,false,'H',new Equipo("CRS",4)),	new Pais("Portugal",3,true,'H',new Equipo("PRT",5)),100);
		Partido partido48 = new Partido (8,new Pais("Ghana",1,false,'H',new Equipo("GHN",4)),	new Pais("Uruguay",3,true,'H',new Equipo("URG",5)),100);
		todos.add(partido43);
		todos.add(partido44);
		todos.add(partido45);
		todos.add(partido46);
		todos.add(partido47);
		todos.add(partido48);
		
		return todos;
	}
	
}
