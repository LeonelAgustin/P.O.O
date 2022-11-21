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
	
	
	public void buscarTabla() {//buscar una tabla
		
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
	
	public void primerosYsegundos() {
		
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
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		
		paises1.add(qatar);
		paises1.add(ecuador);
		paises1.add(senegal);
		paises1.add(paisesBajos);
		paises1.add(inglaterra);
		paises1.add(iran);
		paises1.add(estadosUnidos);
		paises1.add(argentina);
		paises1.add(arabiaSaudita);
		paises1.add(mexico);
		paises1.add(polonia);
		paises1.add(francia);
		paises1.add(australia);
		paises1.add(dinamarca);
		paises1.add(tunez);
		paises1.add(espana);
		paises1.add(costaRica);
		paises1.add(alemania);
		paises1.add(japon);
		paises1.add(belgica);
		paises1.add(canada);
		paises1.add(marruecos);
		paises1.add(croacia);
		paises1.add(brasil);
		paises1.add(serbia);
		paises1.add(suiza);
		paises1.add(camerun);
		paises1.add(portugal);
		paises1.add(ghana);
		paises1.add(uruguay);
		paises1.add(coreaSur);
		
		
		int primeroA = 0;
		int primeroB = 0;
		int primeroC = 0;
		int primeroD = 0;
		int primeroE = 0;
		int primeroF = 0;
		int primeroG = 0;
		int primeroH = 0;
		
		LinkedList<Partido> todos = General();
		
		for (int i = 0; i < todos.size(); i++) {
			
			todos.get(i).getEquipo1().setGoles((int)(Math.random()*4+1));
		}
		
		for (int i = 0; i < paises1.size(); i++) {
			paises1.set(i, paises1.get(i)).setGoles(((int)(Math.random()*4+1)));
		}		
		
		for (Pais pais : paises1) {
			//juego los partidos cambiando los goles y agregandolos al lista de paises
			paises1.set(paises1.indexOf(pais), pais).setGoles(((int)(Math.random()*4+1)));
			pais.setGoles(((int)(Math.random()*4+1)));
			pais.setPuntos(((int)(Math.random()*4+1)));
		}
		/*		
		for (Partido partido : todos) {
				
				if (paises1.contains(partido.getEquipo1())==false) {
					paises1.add(partido.getEquipo1());
				}
				if(paises1.contains(partido.getEquipo2())==false){
					paises1.add(partido.getEquipo2());
				}				
		}*/
		
		for (Partido partido : todos) {
			if (partido.getEquipo1().getGoles() > partido.getEquipo2().getGoles()) {
				partido.getEquipo1().setPuntos((partido.getEquipo1().getPuntos())+1);//sumo un punto al pais que gano
				partido.getEquipo1().setPosicion(1);// 1 gano el partido
				partido.getEquipo2().setPosicion(2);// 2 perdio el partido
				
			}else {
				partido.getEquipo2().setPuntos((partido.getEquipo2().getPuntos())+1);
				partido.getEquipo1().setPosicion(2);
				partido.getEquipo2().setPosicion(1);
			}
		}
		
		
		
		for (int i = 0; i < todos.size(); i++) {
			if (todos.get(i).getEquipo1().getGrupo()=='A' || todos.get(i).getEquipo2().getGrupo()== 'A' && todos.get(i).getEquipo1().getPuntos() > primeroA || todos.get(i).getEquipo2().getPuntos() > primeroA) {
				
			} else if(todos.get(i).getEquipo2().getGrupo()=='A' || todos.get(i).getEquipo2().getGrupo()== 'A' && todos.get(i).getEquipo1().getPuntos() > primeroB ) {
				
			}
		}
		
		// primero dependiendo de quien gano en cada partido se le suma los puntos
		// voy a guardar el index del pais que tiene mas puntos y asi saco el ganador de cada grupo
		for (int i = 0; i < paises1.size(); i++) {
			// paises.get(i) devuelve el Pais en la posicion i, del mismo elemento tomo el aributo Grupo para solo tomar los del grupo A
			switch (paises1.get(i).getGrupo()) {
			case 'A':
				if (paises1.get(i).getPuntos() > primeroA) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroA = paises1.indexOf(paises1.get(i));
				}// alfinal me voy a quedar con el pais que tuvo mas puntos
				break;
				
			case 'B':
				if (paises1.get(i).getPuntos() > primeroB) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroB = paises1.indexOf(paises1.get(i));
				}
				break;
				
			case 'C':
				if (paises1.get(i).getPuntos() > primeroC) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroC = paises1.indexOf(paises1.get(i));
				}
				break;
				
			case 'D':
				if (paises1.get(i).getPuntos() > primeroD) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroD = paises1.indexOf(paises1.get(i));
				}
				break;
			case 'E':
				if (paises1.get(i).getPuntos() > primeroE) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroE = paises1.indexOf(paises1.get(i));
				}
				break;
				
			case 'F':
				if (paises1.get(i).getPuntos() > primeroF) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroF = paises1.indexOf(paises1.get(i));
				}
				break;
			case 'G':
				if (paises1.get(i).getPuntos() > primeroG) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroG = paises1.indexOf(paises1.get(i));
				}
				break;
				
			case 'H':
				if (paises1.get(i).getPuntos() > primeroH) {// si los puntos del pais en la posicion i es mayor a ganadorA guardo su posicion
					primeroH = paises1.indexOf(paises1.get(i));
				}
				break;
			}
		}
		//imprimo el nombre del pais en la posicion del ganador de cada tabla que guarde antes*/
		
		JOptionPane.showMessageDialog(null, "PRIMEROS\ngrupo A: "+paises1.get(primeroA).getNombre()+
				"\n"+"grupo B: "+paises1.get(primeroB).getNombre()+
				"\n"+"grupo C: "+paises1.get(primeroC).getNombre()+
				"\n"+"grupo D: "+paises1.get(primeroD).getNombre()+
				"\n"+"grupo E: "+paises1.get(primeroE).getNombre()+
				"\n"+"grupo F: "+paises1.get(primeroF).getNombre()+
				"\n"+"grupo G: "+paises1.get(primeroG).getNombre()+
				"\n"+"grupo H: "+paises1.get(primeroH).getNombre());
		
		paises1.remove(primeroA);
		paises1.remove(primeroB);
		paises1.remove(primeroC);
		paises1.remove(primeroD);
		paises1.remove(primeroE);
		paises1.remove(primeroF);
		paises1.remove(primeroG);
		paises1.remove(primeroH);
		// remuevo los primeros ganadores para sacar los segundos de cada grupo
		
		int segundoA = 0;
		int segundoB = 0;
		int segundoC = 0;
		int segundoD = 0;
		int segundoE = 0;
		int segundoF = 0;
		int segundoG = 0;
		int segundoH = 0;
		
		
		for (int i = 0; i < paises1.size(); i++) {
			switch (paises1.get(i).getGrupo()) {
			case 'A':
				if (paises1.get(i).getPuntos() > segundoA) {
					segundoA = paises1.indexOf(paises1.get(i));
					
				}
				break;
			case 'B':
				if (paises1.get(i).getPuntos() > segundoB) {
					segundoB = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoB);
				}
				break;
				
			case 'C':
				if (paises1.get(i).getPuntos() > segundoC) {
					segundoC = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoC);
				}
				break;
				
			case 'D':
				if (paises1.get(i).getPuntos() > segundoD) {
					segundoD = paises1.indexOf(paises1);
					paises1.remove(segundoD);
				}
				break;
			case 'E':
				if (paises1.get(i).getPuntos() > segundoE) {
					segundoE = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoE);
				}
				break;
				
			case 'F':
				if (paises1.get(i).getPuntos() > segundoF) {
					segundoF = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoF);
				}
				break;
			case 'G':
				if (paises1.get(i).getPuntos() > segundoG) {
					segundoG = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoG);
				}
				break;
				
			case 'H':
				if (paises1.get(i).getPuntos() > segundoH) {
					segundoH = paises1.indexOf(paises1.get(i));
					paises1.remove(segundoH);
				}
				break;
			}
		}
		String segundosGanadores = "SEGUNDOS\ngrupo A:"+
				paises1.get(primeroA).getNombre()+
		"\n"+"grupo B: "+paises1.get(primeroB-1).getNombre()+
		"\n"+"grupo C: "+paises1.get(primeroC-1).getNombre()+
		"\n"+"grupo D: "+paises1.get(primeroD-1).getNombre()+
		"\n"+"grupo E: "+paises1.get(primeroE-1).getNombre()+
		"\n"+"grupo F: "+paises1.get(primeroF-1).getNombre()+
		"\n"+"grupo G: "+paises1.get(primeroG-1).getNombre()+
		"\n"+"grupo H: "+paises1.get(primeroH-1).getNombre();
		JOptionPane.showMessageDialog(null,segundosGanadores);
		
	}
	
	
	
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
		Partido partido1 = new Partido (1,new Pais("Qatar",false,'A',new Equipo("QFA",4),0,0),	new Pais("Ecuador",true,'A',new Equipo("ECU",5),0,0),100);
		Partido partido2 = new Partido (1,new Pais("Senegal",false,'A',new Equipo("SNG",4),0,0),	new Pais("P.Bajos",true,'A',new Equipo("PBS",5),0,0),100);
		Partido partido3 = new Partido (1,new Pais("Qatar",false,'A',new Equipo("QFA",4),0,0),	new Pais("Senegal",true,'A',new Equipo("SNG",5),0,0),100);
		Partido partido4 = new Partido (1,new Pais("P.Bajos",false,'A',new Equipo("PBS",4),0,0),	new Pais("Ecuador",true,'A',new Equipo("ECU",5),0,0),100);
		Partido partido5 = new Partido (1,new Pais("P.Bajos",true,'A',new Equipo("PBS",5),0,0),	new Pais("Qatar",false,'A',new Equipo("QFA",4),0,0),100);
		Partido partido6 = new Partido (1,new Pais("Ecuador",false,'A',new Equipo("ECU",4),0,0),	new Pais("Senegal",true,'A',new Equipo("SNG",5),0,0),100);
		
		
		Partido partido7 = new Partido (2,new Pais("Inglaterra",false,'B',new Equipo("ING",4),0,0),	new Pais("Iran",true,'B',new Equipo("IRN",5),0,0),100);
		Partido partido8 = new Partido (2,new Pais("EstadosUnidos",false,'B',new Equipo("EEUU",4),0,0),new Pais("Gales",true,'B',new Equipo("GLS",5),0,0),100);
		Partido partido9 = new Partido (2,new Pais("Inglaterra",false,'B',new Equipo("ING",4),0,0),	new Pais("EstadosUnidos",true,'B',new Equipo("EEUU",5),0,0),100);
		Partido partido10 = new Partido (2,new Pais("Gales",false,'B',new Equipo("GLS",4),0,0),		new Pais("Iran",true,'B',new Equipo("IRN",5),0,0),100);
		Partido partido11 = new Partido (2,new Pais("Gales",false,'B',new Equipo("GLS",4),0,0),		new Pais("Inglaterra",true,'B',new Equipo("ING",5),0,0),100);
		Partido partido12 = new Partido (2,new Pais("Iran",false,'B',new Equipo("IRN",4),0,0),		new Pais("EstadosUnidos",true,'B',new Equipo("EEUU",5),0,0),100);
		
		
		Partido partido13 = new Partido (3,new Pais("Argentina",false,'C',new Equipo("ARG",4),0,0),new Pais("Arabia.s",true,'C',new Equipo("ARS",5),0,0),100);
		Partido partido14 = new Partido (3,new Pais("Mexico",false,'C',new Equipo("MEX",4),0,0),	new Pais("Polonia",true,'C',new Equipo("PLN",5),0,0),100);
		Partido partido15 = new Partido (3,new Pais("Argentina",false,'C',new Equipo("ARG",4),0,0),new Pais("Mexico",true,'C',new Equipo("MEX",5),0,0),100);
		Partido partido16 = new Partido (3,new Pais("Polonia",false,'C',new Equipo("PLN",4),0,0),	new Pais("Arabia.s",true,'C',new Equipo("ARS",5),0,0),100);
		Partido partido17 = new Partido (3,new Pais("Polonia",false,'C',new Equipo("PLN",4),0,0),	new Pais("Argentina",true,'C',new Equipo("ARG",5),0,0),100);
		Partido partido18 = new Partido (3,new Pais("Arabia.s",false,'C',new Equipo("ARS",4),0,0),new Pais("Mexico",true,'C',new Equipo("MEX",5),0,0),100);
	
		
		Partido partido19 = new Partido (4,new Pais("Francia",false,'D',new Equipo("FRN",4),0,0),	new Pais("Australia",true,'D',new Equipo("AUS",5),0,0),100);
		Partido partido20 = new Partido (4,new Pais("Dinamarca",false,'D',new Equipo("DNM",4),0,0),new Pais("Tunez",true,'D',new Equipo("TNZ",5),0,0),100);
		Partido partido21 = new Partido (4,new Pais("Francia",false,'D',new Equipo("FRN",4),0,0),	new Pais("Dinamarca",true,'D',new Equipo("DNM",5),0,0),100);
		Partido partido22 = new Partido (4,new Pais("Tunez",false,'D',new Equipo("TNZ",4),0,0),	new Pais("Australia",true,'D',new Equipo("AUS",5),0,0),100);
		Partido partido23 = new Partido (4,new Pais("Tunez",false,'D',new Equipo("TNZ",4),0,0),	new Pais("Francia",true,'D',new Equipo("FRN",5),0,0),100);
		Partido partido24 = new Partido (4,new Pais("Australia",false,'D',new Equipo("AUS",4),0,0),new Pais("Dinamarca",true,'D',new Equipo("DNM",5),0,0),100);
		
		
		Partido partido25 = new Partido (5,new Pais("España",false,'E',new Equipo("ESP",4),0,0),	new Pais("CostaRica",true,'E',new Equipo("CTR",5),0,0),100);
		Partido partido26 = new Partido (5,new Pais("Alemania",false,'E',new Equipo("ALM",4),0,0),new Pais("Japon",true,'E',new Equipo("JPN",5),0,0),100);
		Partido partido27 = new Partido (5,new Pais("España",false,'E',new Equipo("ESP",4),0,0),	new Pais("Alemania",true,'D',new Equipo("ALM",5),0,0),100);
		Partido partido28 = new Partido (5,new Pais("Japon",false,'E',new Equipo("JPN",4),0,0),	new Pais("CostaRica",true,'D',new Equipo("CTR",5),0,0),100);
		Partido partido29 = new Partido (5,new Pais("Japon",false,'E',new Equipo("JPN",4),0,0),	new Pais("España",true,'D',new Equipo("ESP",5),0,0),100);
		Partido partido30 = new Partido (5,new Pais("CostaRica",false,'E',new Equipo("CTR",4),0,0),new Pais("Alemania",true,'D',new Equipo("ALM",5),0,0),100);
		
		
		Partido partido31 = new Partido (6,new Pais("Belgica",false,'F',new Equipo("BLG",4),0,0),	new Pais("Canada",true,'F',new Equipo("CND",5),0,0),100);
		Partido partido32 = new Partido (6,new Pais("Marruecos",false,'F',new Equipo("MRC",4),0,0),new Pais("Croacia",true,'F',new Equipo("CRC",5),0,0),100);
		Partido partido33 = new Partido (6,new Pais("Belgica",false,'F',new Equipo("BLG",4),0,0),	new Pais("Marruecos",true,'F',new Equipo("MRC",5),0,0),100);
		Partido partido34 = new Partido (6,new Pais("Croacia",false,'F',new Equipo("CRC",4),0,0),	new Pais("Canada",true,'F',new Equipo("CND",5),0,0),100);
		Partido partido35 = new Partido (6,new Pais("Croacia",false,'F',new Equipo("CRC",4),0,0),	new Pais("Belgica",true,'F',new Equipo("BLG",5),0,0),100);
		Partido partido36 = new Partido (6,new Pais("Canada",false,'F',new Equipo("CND",4),0,0),	new Pais("Marruecos",true,'F',new Equipo("MRC",5),0,0),100);
		
		
		Partido partido37 = new Partido (7,new Pais("Brasil",false,'G',new Equipo("BRS",4),0,0),	new Pais("Serbia",true,'G',new Equipo("SRB",5),0,0),100);
		Partido partido38 = new Partido (7,new Pais("Suiza",false,'G',new Equipo("SZA",4),0,0),	new Pais("Camerun",true,'G',new Equipo("CMR",5),0,0),100);
		Partido partido39 = new Partido (7,new Pais("Brasil",false,'G',new Equipo("BRS",4),0,0),	new Pais("Suiza",true,'G',new Equipo("SZA",5),0,0),100);
		Partido partido40 = new Partido (7,new Pais("Camerun",false,'G',new Equipo("CMR",4),0,0),	new Pais("Serbia",true,'G',new Equipo("SRB",5),0,0),100);
		Partido partido41 = new Partido (7,new Pais("Camerun",false,'G',new Equipo("CMR",4),0,0),	new Pais("Brasil",true,'G',new Equipo("BRS",5),0,0),100);
		Partido partido42 = new Partido (7,new Pais("Serbia",false,'G',new Equipo("SRB",4),0,0),	new Pais("Suiza",true,'G',new Equipo("SZA",5),0,0),100);
		
		
		Partido partido43 = new Partido (8,new Pais("Portugal",false,'H',new Equipo("PRT",4),0,0),new Pais("Ghana",true,'H',new Equipo("GHN",5),0,0),100);
		Partido partido44 = new Partido (8,new Pais("Uruguay",false,'H',new Equipo("URG",4),0,0),	new Pais("Corea.s",true,'H',new Equipo("CRS",5),0,0),100);
		Partido partido45 = new Partido (8,new Pais("Portugal",false,'H',new Equipo("PRT",4),0,0),new Pais("Uruguay",true,'H',new Equipo("URG",5),0,0),100);
		Partido partido46 = new Partido (8,new Pais("Corea.s",false,'H',new Equipo("CRS",4),0,0),	new Pais("Ghana",true,'H',new Equipo("GHN",5),0,0),100);
		Partido partido47 = new Partido (8,new Pais("Corea.s",false,'H',new Equipo("CRS",4),0,0),	new Pais("Portugal",true,'H',new Equipo("PRT",5),0,0),100);
		Partido partido48 = new Partido (8,new Pais("Ghana",false,'H',new Equipo("GHN",4),0,0),	new Pais("Uruguay",true,'H',new Equipo("URG",5),0,0),100);
		todos.add(partido1);
		todos.add(partido2);
		todos.add(partido3);
		todos.add(partido4);
		todos.add(partido5);
		todos.add(partido6);
		todos.add(partido7);
		todos.add(partido8);
		todos.add(partido9);
		todos.add(partido10);
		todos.add(partido11);
		todos.add(partido12);
		todos.add(partido13);
		todos.add(partido14);
		todos.add(partido15);
		todos.add(partido16);
		todos.add(partido17);
		todos.add(partido18);
		todos.add(partido19);
		todos.add(partido20);
		todos.add(partido21);
		todos.add(partido22);
		todos.add(partido23);
		todos.add(partido24);
		todos.add(partido25);
		todos.add(partido26);
		todos.add(partido27);
		todos.add(partido28);
		todos.add(partido29);
		todos.add(partido30);
		todos.add(partido31);
		todos.add(partido32);
		todos.add(partido33);
		todos.add(partido34);
		todos.add(partido35);
		todos.add(partido36);
		todos.add(partido37);
		todos.add(partido38);
		todos.add(partido39);
		todos.add(partido40);
		todos.add(partido41);
		todos.add(partido42);
		todos.add(partido43);
		todos.add(partido44);
		todos.add(partido45);
		todos.add(partido46);
		todos.add(partido47);
		todos.add(partido48);
		
		return todos;
	}
	
}
