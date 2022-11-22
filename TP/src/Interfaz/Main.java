package Interfaz;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import Datos.Encargado;
import Datos.Equipo;
import Datos.Pais;
import Datos.Partido;

public class Main {

	public static void main(String[] args) {

		
		/*
		String a = JOptionPane.showInputDialog("ingrese el nombre del pais que busca");
		if (tablaA().contains(a)) {
			JOptionPane.showMessageDialog(null, "se encontro "+a+" en el grupo A");
		} else if (grupoB.contains(a)) {
			JOptionPane.showMessageDialog(null, "se encontro "+a+" en el grupo B");
		}
		*/
		
		Encargado pablo = new Encargado (01,"Pablo");
		
		LinkedList<Pais> paisesA = grupoA();
		LinkedList<Pais> paisesB = grupoB();
		LinkedList<Pais> paisesC = grupoC();
		LinkedList<Pais> paisesD = grupoD();
		LinkedList<Pais> paisesE = grupoE();
		LinkedList<Pais> paisesF = grupoF();
		LinkedList<Pais> paisesG = grupoG();
		LinkedList<Pais> paisesH = grupoH();
		
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		
		int menu = Integer.parseInt(JOptionPane.showInputDialog("\n1-ingresar partido a la base de datos\n2-Buscar y/o cambiar datos de un partido\n3-jugar fase de grupos"));
		
		switch (menu) {
		case 1:
			
			break;
		case 2:// visualizar partidos
			int res = Integer.parseInt(JOptionPane.showInputDialog("1-Ver la tabla de un grupo\n2-Ver un partido\n3-Ver todas las tablas"));
			if (res == 1) {
				buscarTabla();
			} else if(res==2) {
				buscarPartidos();
			}else if (res == 3) {
				//pablo.verpartidos();
			}
			break;
		case 3:
			// jugar primero y segundo de cada grupo X
			int primeroA = (int)(Math.random()*4);
			int segundoA = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO A\nprimero: "+paisesA.get(primeroA).getNombre());
			octavos.add(paisesA.get(primeroA));
			paisesA.remove(primeroA);
			JOptionPane.showMessageDialog(null, "GRUPO A\nsegundo: "+paisesA.get(segundoA).getNombre());
			octavos.add(paisesA.get(segundoA));
			
			int primeroB = (int)(Math.random()*4);
			int segundoB = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO B\nprimero: "+paisesB.get(primeroB).getNombre());
			paisesB.remove(primeroB);
			JOptionPane.showMessageDialog(null, "GRUPO B\nsegundo: "+paisesB.get(segundoB).getNombre());
			
			int primeroC = (int)(Math.random()*4);
			int segundoC = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO C\nprimero: "+paisesC.get(primeroC).getNombre());
			paisesC.remove(primeroC);
			JOptionPane.showMessageDialog(null, "GRUPO C\nsegundo: "+paisesC.get(segundoC).getNombre());
			
			
			int primeroD = (int)(Math.random()*4);
			int segundoD = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO D\nprimero: "+paisesD.get(primeroD).getNombre());
			paisesD.remove(primeroD);
			JOptionPane.showMessageDialog(null, "GRUPO D\nsegundo: "+paisesD.get(segundoD).getNombre());
			
			int primeroE = (int)(Math.random()*4);
			int segundoE = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO E\nprimero: "+paisesE.get(primeroE).getNombre());
			paisesE.remove(primeroE);
			JOptionPane.showMessageDialog(null, "GRUPO E\nsegundo: "+paisesE.get(segundoE).getNombre());
			
			int primeroF = (int)(Math.random()*4);
			int segundoF = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO F\nprimero: "+paisesF.get(primeroF).getNombre());
			paisesF.remove(primeroF);
			JOptionPane.showMessageDialog(null, "GRUPO F\nsegundo: "+paisesF.get(segundoF).getNombre());
			
			int primeroG = (int)(Math.random()*4);
			int segundoG = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO G\nprimero: "+paisesG.get(primeroG).getNombre());
			paisesG.remove(primeroG);
			JOptionPane.showMessageDialog(null, "GRUPO G\nsegundo: "+paisesG.get(segundoG).getNombre());
			
			int primeroH = (int)(Math.random()*4);
			int segundoH = (int)(Math.random()*3);
			JOptionPane.showMessageDialog(null, "GRUPO H\nprimero: "+paisesH.get(primeroH).getNombre());
			paisesH.remove(primeroH);
			JOptionPane.showMessageDialog(null, "GRUPO H\nsegundo: "+paisesH.get(segundoH).getNombre());
			
			// obentener octavos, cuartos, semis y final
			//String octavo = JOptionPane.showInputDialog("Octavos jugados, ingrese el nombre de u pais para ver si clasifico");
			break;
		}
		
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
	
	public static void primeroYsegundo() {
		LinkedList<Partido> todos = General();
		LinkedList<Pais> paises = new LinkedList<Pais>();
		/*
		LinkedList<Pais> grupo1 = grupoA();
		LinkedList<Pais> grupo2 = grupoB();
		LinkedList<Pais> grupo3 = grupoC();
		LinkedList<Pais> grupo4 = grupoD();
		LinkedList<Pais> grupo5 = grupoE();
		LinkedList<Pais> grupo6 = grupoF();
		LinkedList<Pais> grupo7 = grupoG();
		LinkedList<Pais> grupo8 = grupoH();*/
		int a = 0;
		int b = 0;
		
		/*for (int i = 0; i < todos.size() ; i++) {
			JOptionPane.showMessageDialog(null, "grupo "+todos.get(i).getEquipo1().getGrupo()+"\n"+
					todos.get(i).getEquipo1().getNombre()+" VS "+todos.get(i).getEquipo2().getNombre());
			 a = Integer.parseInt(JOptionPane.showInputDialog("\ningrese goles de "+todos.get(i).getEquipo1().getNombre()));
			todos.get(i).getEquipo1().setGoles(a);
			 b = Integer.parseInt(JOptionPane.showInputDialog("\ningrese goles de "+todos.get(i).getEquipo2().getNombre())); 
			todos.get(i).getEquipo2().setGoles(b);
			
			if (a == b) {
				//todos.get(i).getEquipo1().setPuntos((todos.get(i).getEquipo1().getPuntos())+0);
				todos.get(i).getEquipo1().setPosicion(0);
				todos.get(i).getEquipo2().setPosicion(0);
				
				
			} else 	if (a > b) {
				todos.get(i).getEquipo1().setPuntos(pta++);//sumo un punto al pais que gano
				todos.get(i).getEquipo1().setPosicion(1);// 1 gano el partido
				todos.get(i).getEquipo2().setPosicion(2);// 2 perdio el partido
				
				//JOptionPane.showMessageDialog(null, partido.getEquipo1().getNombre()+"goles: "+partido.getEquipo1().getGoles()+"\npuntos: "+paises.get(i).getPuntos());
			}else if (b < a)  {
				todos.get(i).getEquipo2().setPuntos(ptb++);
				todos.get(i).getEquipo1().setPosicion(2);
				todos.get(i).getEquipo2().setPosicion(1);
				
			}
					
		}*/
		
		for (Partido partido : todos) {
			JOptionPane.showMessageDialog(null, "grupo "+partido.getEquipo1().getGrupo()+"\n"+
					partido.getEquipo1().getNombre()+" VS "+partido.getEquipo2().getNombre());
			 a = Integer.parseInt(JOptionPane.showInputDialog("\ningrese goles de "+partido.getEquipo1().getNombre()));
			partido.getEquipo1().setGoles(a);
			 b = Integer.parseInt(JOptionPane.showInputDialog("\ningrese goles de "+partido.getEquipo2().getNombre())); 
			partido.getEquipo2().setGoles(b);
			if (a == b) {
				//todos.get(i).getEquipo1().setPuntos((todos.get(i).getEquipo1().getPuntos())+0);
				partido.getEquipo1().setPosicion(0);
				partido.getEquipo2().setPosicion(0);
				
			} else 	if (a > b) {
				int pta = partido.getEquipo1().getPuntos();
				partido.getEquipo1().setPuntos(pta+1);//sumo un punto al pais que gano
				partido.getEquipo1().setPosicion(1);// 1 gano el partido
				partido.getEquipo2().setPosicion(2);// 2 perdio el partido
				
				//JOptionPane.showMessageDialog(null, partido.getEquipo1().getNombre()+"goles: "+partido.getEquipo1().getGoles()+"\npuntos: "+paises.get(i).getPuntos());
			}else if (b > a)  {
				int ptb = partido.getEquipo1().getPuntos();
				partido.getEquipo2().setPuntos(ptb+1);
				partido.getEquipo1().setPosicion(2);
				partido.getEquipo2().setPosicion(1);
			}
			
			if (paises.contains(partido.getEquipo1())==false) {
				paises.add(partido.getEquipo1());
			} else if (paises.contains(partido.getEquipo2())==false) {
				paises.add(partido.getEquipo2());
			}
		
		}
		
		for (Partido partido : todos) {
			
		}
		
		ganadores(paises);
	}
	
	public static LinkedList<Pais> ganadores (LinkedList<Pais> paises) {
		int maxgoles = 0;
		int maxpuntos = 0;
		String paisGanador ="";
		
		int goles2 = 0;
		int puntos2 = 0;
		String paisSegundo ="";
		for (Pais  pais : paises) {
			JOptionPane.showMessageDialog(null, pais.getNombre()+" goles: "+pais.getGoles()+" puntos: "+pais.getPuntos());
			if (pais.getPuntos()>maxpuntos) {//gano
				// guardo los datos del pais que rebaso para el segundo lugar
				paisSegundo = paisGanador;
				goles2 = goles2+maxgoles;
				puntos2 = puntos2+maxpuntos;
				 // guardo los datos del primero
				paisGanador = pais.getNombre();
				maxgoles = maxgoles+pais.getGoles();
				maxpuntos = maxpuntos +pais.getPuntos();
			}
		}
		JOptionPane.showMessageDialog(null, "primer lugar: "+paisGanador+" puntos:"+maxpuntos+" goles totales: "+maxgoles+
				"\nsegundo lugar: "+paisSegundo+" puntos2: "+puntos2+" goles2: "+goles2);
		return paises;
	}
	
	public static LinkedList<Pais> grupoA() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais qatar = 	new Pais("Qatar",false,'A',new Equipo("QFA",4),0,0);
		Pais ecuador = 	new Pais("Ecuador",true,'A',new Equipo("ECU",5),0,0);
		Pais senegal = 	new Pais("Senegal",false,'A',new Equipo("SNG",4),0,0);
		Pais paisesBajos = new Pais("P.Bajos",false,'A',new Equipo("PBS",4),0,0);
		paises1.add(qatar);
		paises1.add(ecuador);
		paises1.add(senegal);
		paises1.add(paisesBajos);

		return paises1;
	}
	
	public static LinkedList<Pais> grupoB() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais inglaterra = new Pais("Inglaterra",false,'B',new Equipo("ING",4),0,0);
		Pais iran = 	new Pais("Iran",true,'B',new Equipo("IRN",5),0,0);
		Pais estadosUnidos = new Pais("EstadosUnidos",false,'B',new Equipo("EEUU",4),0,0);
		Pais gales = 	new Pais("Gales",false,'B',new Equipo("GLS",4),0,0);
		paises1.add(inglaterra);
		paises1.add(iran);
		paises1.add(estadosUnidos);
		paises1.add(gales);
		return paises1;
	}
	
	public static LinkedList<Pais> grupoC() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais argentina = new Pais("Argentina",false,'C',new Equipo("ARG",4),0,0);
		Pais arabiaSaudita = new Pais("Arabia.s",true,'C',new Equipo("ARS",5),0,0);
		Pais mexico = 	new Pais("Mexico",false,'C',new Equipo("MEX",4),0,0);
		Pais polonia = 	new Pais("Polonia",false,'C',new Equipo("PLN",4),0,0);
		paises1.add(argentina);
		paises1.add(arabiaSaudita);
		paises1.add(mexico);
		paises1.add(polonia);
		return paises1;
	}
	
	public static LinkedList<Pais> grupoD() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais francia = 	new Pais("Francia",false,'D',new Equipo("FRN",4),0,0);
		Pais australia = new Pais("Australia",false,'D',new Equipo("AUS",4),0,0);
		Pais dinamarca = new Pais("Dinamarca",false,'D',new Equipo("DNM",4),0,0);
		Pais tunez = 	new Pais("Tunez",false,'D',new Equipo("TNZ",4),0,0);
		paises1.add(francia);
		paises1.add(australia);
		paises1.add(dinamarca);
		paises1.add(tunez);
		return paises1;
	}
	public static LinkedList<Pais> grupoE() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais espana = 	new Pais("Espania",false,'E',new Equipo("ESP",4),0,0);
		Pais costaRica = new Pais("CostaRica",false,'E',new Equipo("CTR",4),0,0);
		Pais alemania = new Pais("Alemania",false,'E',new Equipo("ALM",4),0,0);
		Pais japon = 	new Pais("Japon",false,'E',new Equipo("JPN",4),0,0);
		paises1.add(espana);
		paises1.add(costaRica);
		paises1.add(alemania);
		paises1.add(japon);
		return paises1;
	}
	public static LinkedList<Pais> grupoF() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais belgica = 	new Pais("Belgica",false,'F',new Equipo("BLG",4),0,0);
		Pais canada = 	new Pais("Canada",false,'F',new Equipo("CND",4),0,0);
		Pais marruecos = new Pais("Marruecos",false,'F',new Equipo("MRC",4),0,0);
		Pais croacia = 	new Pais("Croacia",false,'F',new Equipo("CRC",4),0,0);
		paises1.add(belgica);
		paises1.add(canada);
		paises1.add(marruecos);
		paises1.add(croacia);
		return paises1;
	}
	
	public static LinkedList<Pais> grupoG() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais brasil = 	new Pais("Brasil",false,'G',new Equipo("BRS",4),0,0);
		Pais serbia = 	new Pais("Serbia",false,'G',new Equipo("SRB",4),0,0);
		Pais suiza = 	new Pais("Suiza",false,'G',new Equipo("SZA",4),0,0);
		Pais camerun = 	new Pais("Camerun",false,'G',new Equipo("CMR",4),0,0);
		paises1.add(brasil);
		paises1.add(serbia);
		paises1.add(suiza);
		paises1.add(camerun);
		return paises1;
	}
	public static LinkedList<Pais> grupoH() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		Pais portugal = new Pais("Portugal",false,'H',new Equipo("PRT",4),0,0);
		Pais ghana = 	new Pais("Ghana",false,'H',new Equipo("GHN",4),0,0);
		Pais uruguay = 	new Pais("Uruguay",false,'H',new Equipo("URG",4),0,0);
		Pais coreaSur = new Pais("Corea.s",false,'H',new Equipo("CRS",4),0,0);
				
		paises1.add(portugal);
		paises1.add(ghana);
		paises1.add(uruguay);
		paises1.add(coreaSur);
		return paises1;
	}
	/*
	public static void primerosYsegundos() {
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		
		
		LinkedList<Partido> todos = General();	
			
		int primeroA = 0;
		int primeroB = 0;
		int primeroC = 0;
		int primeroD = 0;
		int primeroE = 0;
		int primeroF = 0;
		int primeroG = 0;
		int primeroH = 0;
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
		//imprimo el nombre del pais en la posicion del ganador de cada tabla que guarde antes
		
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
	*/

	
	public static LinkedList<Partido> General(){
		
		LinkedList<Partido> todos = new LinkedList<Partido>();
		Partido partido1 = new Partido (1,new Pais("Qatar",false,'A',new Equipo("QFA",0),0,0),	new Pais("Ecuador",true,'A',new Equipo("ECU",0),0,0),100);
		Partido partido2 = new Partido (1,new Pais("Senegal",false,'A',new Equipo("SNG",0),0,0),	new Pais("P.Bajos",true,'A',new Equipo("PBS",0),0,0),100);
		Partido partido3 = new Partido (1,new Pais("Qatar",false,'A',new Equipo("QFA",0),0,0),	new Pais("Senegal",true,'A',new Equipo("SNG",0),0,0),100);
		Partido partido4 = new Partido (1,new Pais("P.Bajos",false,'A',new Equipo("PBS",0),0,0),	new Pais("Ecuador",true,'A',new Equipo("ECU",0),0,0),100);
		Partido partido5 = new Partido (1,new Pais("P.Bajos",true,'A',new Equipo("PBS",0),0,0),	new Pais("Qatar",false,'A',new Equipo("QFA",0),0,0),100);
		Partido partido6 = new Partido (1,new Pais("Ecuador",false,'A',new Equipo("ECU",0),0,0),	new Pais("Senegal",true,'A',new Equipo("SNG",0),0,0),100);
		todos.add(partido1);
		todos.add(partido2);
		todos.add(partido3);
		todos.add(partido4);
		todos.add(partido5);
		todos.add(partido6);
		/*
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
		*/
		return todos;
	}

}
