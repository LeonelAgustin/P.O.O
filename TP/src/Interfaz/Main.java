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
		
		LinkedList<Partido> todos = pablo.General();
		
		int menu = Integer.parseInt(JOptionPane.showInputDialog("\n1-ingresar partido a la base de datos\n2-Buscar y/o cambiar datos de un partido\n3-jugar fase de grupos"));
		
		switch (menu) {
		case 1:
			
			break;
		case 2:// visualizar partidos
			int res = Integer.parseInt(JOptionPane.showInputDialog("1-Ver la tabla de un grupo\n2-Ver un partido\n3-Ver todas las tablas"));
			if (res == 1) {
				pablo.buscarTabla();
			} else if(res==2) {
				pablo.buscarPartidos();
			}else if (res == 3) {
				pablo.verpartidos();
			}
			break;
		case 3:
			// jugar partidos
			
			pablo.primerosYsegundos();
			
			// obentener octavos, cuartos, semis y final
			//String octavo = JOptionPane.showInputDialog("Octavos jugados, ingrese el nombre de u pais para ver si clasifico");
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

	

}
